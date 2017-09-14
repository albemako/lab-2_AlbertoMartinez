/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_albertomartinez;

/**
 *
 * @author Alberto
 */
public class Salamandras extends Hadas{
    public int salud=683;
    public int alas;//mas de 16
    public String descripcion="el poder de lanzar tornados desde sus manos";
    public double daño=71;

    public Salamandras(int alas, String nombre, int edad, int estatura) {
        super(nombre, edad, estatura);
        this.alas = alas;
    }

    public Salamandras() {
    }


    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) {
        this.daño = daño;
    }
    
    
}
