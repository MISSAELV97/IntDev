/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proint;

/**
 *
 * @author danie
 */
public class Persona {
    private String Nom1;
    private String Ape1;
    private String Email;
    private String Tel;

    public Persona() {
        Nom1 = "";
        Ape1 = "";
        Email = "";
        Tel ="";
    }

    public String getNom1() {
        return Nom1;
    }

    public boolean setNom1(String Nom1) {
        Nom1 = Nom1.replace(" ", "");
        Nom1 = Nom1.replace("á","a");
        Nom1 = Nom1.replace("é","e");
        Nom1 = Nom1.replace("í","i");
        Nom1 = Nom1.replace("ó","o");
        Nom1 = Nom1.replace("ú","u");
        if(Nom1.length()<= 20 ){
            this.Nom1 = Nom1.toUpperCase().trim();
            return true;
        }else{
            return false;
        }
    }

    public String getApe1() {
        return Ape1;
    }

    public boolean setApe1(String Ape1) {
        Ape1 = Ape1.replace(" ", "");
        Ape1 = Ape1.replace("á","a");
        Ape1 = Ape1.replace("é","e");
        Ape1 = Ape1.replace("í","i");
        Ape1 = Ape1.replace("ó","o");
        Ape1 = Ape1.replace("ú","u");
        if(Ape1.length()<= 20 ){
            this.Ape1 = Ape1.toUpperCase().trim();
            return true;
        }else{
            return false;
        }
    }

    public String getEmail() {
        return Email;
    }

    public boolean setEmail(String Email) {
        if(Email.contains("@") && Email.contains(".")&& !Email.contains(" ")){
            this.Email = Email.toLowerCase().trim();
            return true;
        }else{
            return false;
        }
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        if(Tel.length()<= 12){
            this.Tel = Tel.trim();
        }
    }
    
    
    
    
}
