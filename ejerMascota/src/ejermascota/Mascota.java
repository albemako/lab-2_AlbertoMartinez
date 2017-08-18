/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejermascota;

import java.util.Date;

/**
 *
 * @author Alberto
 */
public class Mascota {
    protected int codigo;
    private String nombre;
    private double peso;
    private Date fecha;

    public Mascota(int codigo, String nombre, double peso, Date fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.peso = peso;
        this.fecha = fecha;
    }

    public Mascota() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", nombre=" + nombre + ", peso=" + peso + ", fecha=" + fecha + '}';
    }
    
    
    
}
