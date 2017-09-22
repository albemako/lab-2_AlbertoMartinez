/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_albertomartinez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Playlist implements Serializable{
    public final long SerializableUID=123L;
    public String nombre;
    public ArrayList <Cancion> canciones=new ArrayList();

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public Playlist() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Playlist: " + nombre;
    }
    
    
    
}
