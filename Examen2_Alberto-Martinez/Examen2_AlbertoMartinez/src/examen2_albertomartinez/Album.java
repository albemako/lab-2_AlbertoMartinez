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
public class Album implements Serializable{
    public final long SerializableUID=123L;
    public String nombre;
    public String artista;
    public ArrayList<Cancion> canciones=new ArrayList();

    public Album() {
    }

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
    
}
