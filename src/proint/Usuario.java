package proint;

import java.util.Scanner;


public class Usuario extends Persona {
    protected String ID;
    protected String User;
    protected String Password;

   
    
    //CONSTRUCTOR//
    
    public Usuario(){
        this.ID = "";
        this.User = "";
        this.Password = "";
    }
    //GETS AND SETS OF ID//
    public void setID(String ID){
        this.ID = ID;
    }
    public void setID(int ID){
        this.ID = String.valueOf(ID);
    }
    public String ID(){
        return ID;
    }
    //GETS and SETS OF PASSWORD//
    public void setPassword(String Password){
      this.Password = Password;
    }
    public void setPassword(Double Pssword){
       this.Password = String.valueOf(Password);
    }
    public void setPassword(int Password){
        this.Password = String.valueOf(Password);
    }
    public String getPassword(){
        return Password;
    }
    //GETS and SETS OF EMAIL//
    public String getUser(){
        return User;
    }
    public void SetUser(String User){
        this.User = User;
    } 
    
    boolean Verificado = true;
    public boolean Validacion(String User, String Password){
            if(!this.User.equals(User) && this.Password.equals(Password)){
                System.out.println("Bienvenido");
                return true;
            }else{
                System.out.println("Accesso denegado");
                return false;
            }   
    }
    public void Menu(){
        int opcion =0;
         Scanner sc = new Scanner(System.in);
            
        do{
           System.out.println("1.Ver un doctor");
           System.out.println("¿Que te gustaria hacer?");
           System.out.println("¿Que te gustaria hacer?");
           opcion =sc.nextInt();
        }while(opcion !=5);
    
        
    }

  
    
}
