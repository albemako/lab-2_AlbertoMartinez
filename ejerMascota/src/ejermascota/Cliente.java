/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejermascota;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alberto
 */
public class Cliente {
    private String nombre;
    private int edad;
    private Date fecha;
    private ArrayList<Mascota>mascotas;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, Date fecha, ArrayList<Mascota> mascotas) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.mascotas = mascotas;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + ", mascotas=" + mascotas + '}';
    }
    
    
}
