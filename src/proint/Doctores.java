/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proint;

/**
 *
 * @author danie
 */
public class Doctores extends Persona {
    
    private String Id_clinica;
    private String Id_Especialidad;
    private String Email;
    private String Tel;
    
    
    public Doctores(){
        
        Id_clinica = "";
        Id_Especialidad = "";
        Email = "";
        Tel =" ";
    }
    public void Id_clinica(String Id_clinica){
        this.Id_clinica = Id_clinica;
    }
    public String getId_clinica(){
        return Id_clinica;
    }
    public void Id_Especialidades(String Id_Especialidad){
        this.Id_Especialidad = Id_Especialidad;
    }
    public String getId_Especialidad(){
        return Id_Especialidad;
    }
     public void Email(String Email){
        this.Email = Email;
    }
    public String Email(){
        return Email;
    }
     public void Tel(String Tel){
        this.Tel = Tel;
    }
    public String Tel(){
        return Tel;
    }
    
    
    
}
