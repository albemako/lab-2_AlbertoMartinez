/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_albertomartinez;

import java.io.Serializable;

/**
 *
 * @author Alberto
 */
public class Hadas implements Serializable{
    public final long SerializableUID=123L;
    public double salud;
    public double daño;
    public String nombre;
    public int edad;
    public int estatura;//<=15

    public Hadas() {
    }

    

    public Hadas(int salud, int daño, String nombre, int edad, int estatura) {
        this.salud = salud;
        this.daño = daño;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
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

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }




    @Override
    public String toString() {
        return nombre;
    }
    
    
}
