/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_albertomartinez.pkg11641226;

/**
 *
 * @author Alberto
 */
public class usuario {
    public String nombre;
    public int edad;
    public String lugar;
    public String username;
    public String password;
    
    public usuario(){        
    } 
    
    public usuario(String user){
        this.username=user;
    }
    
    public usuario(String nom,int ed,String lug,String user,String pass){
        this.nombre=nom;
        this.edad=ed;
        this.lugar=lug;
        this.username=user;
        this.password=pass;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setlugar(String lug){
        lugar=lug;
    }
    
    public String getlugar(){
        return lugar;
    }
    public void setUsername(String user){
        username=user;
    }
    
    public String getUsername(){
        return username;
    }
    public void setPassword(String pass){
        password=pass;
    }
    
    public String getPassword(){
        return password;
    }
    
        public void setEdad(int ed){
        this.edad=ed;
    }
    
    public int getEdad(){
        return edad;
    }
    
    @Override
    public String toString(){
        return nombre+" / "+username;
    }
}
