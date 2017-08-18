
package labexamen1_alberto.martinez;

import java.util.ArrayList;
import java.util.Date;

public class Libros {

public String titulo;
public String descripcion;
public int puntaje;
public int copias;
public String genero;
public double valor;
public String edicion;
public String autor;
public Date publicacion;

    public Libros() {
    }

    public Libros(String titulo, String descripcion, int puntaje, int copias, String genero, double valor, String edicion, String autor, Date publicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.publicacion = publicacion;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", copias: " + copias;
    }




}
