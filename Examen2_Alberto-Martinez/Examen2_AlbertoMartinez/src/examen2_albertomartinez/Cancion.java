/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_albertomartinez;

/**
 *
 * @author Alberto
 */
public class Cancion {
    public String nombre;
    public Double duracion;
    public String artista;
    public String genero;

    public Cancion() {
    }

    public Cancion(String nombre, Double duracion, String artista, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.artista = artista;
        this.genero = genero;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
