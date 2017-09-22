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
public class Album {
    public String nombre;
    public String Artista;
    public ArrayList <Cancion> canciones=new ArrayList();

    public Album() {
    }

    public Album(String nombre, String Artista) {
        this.nombre = nombre;
        this.Artista = Artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
