/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_albertomartinez;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Usuario {
     
     public String nombre;
     public int edad;
     public String username;
     public String password;
     public ArrayList <Playlist> playlists=new ArrayList();
     public ArrayList <Cancion> favoritas=new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String username, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public ArrayList<Cancion> getFavoritas() {
        return favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> favoritas) {
        this.favoritas = favoritas;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
     
     
             
}
