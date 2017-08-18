/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alberto
 */
public class Experimento implements Complementos{
    private String nombre;
    private double calificacion;
    private Date fecha;
    private ArrayList<Materiales> materiales=new ArrayList();

    public Experimento() {
    }

    public Experimento(String nombre, double calificacion, Date fecha) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Materiales> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Materiales> materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Experimento{" + "nombre=" + nombre + ", calificacion=" + calificacion + ", fecha=" + fecha + ", materiales=" + materiales + '}';
    }

    @Override
    public String nivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
