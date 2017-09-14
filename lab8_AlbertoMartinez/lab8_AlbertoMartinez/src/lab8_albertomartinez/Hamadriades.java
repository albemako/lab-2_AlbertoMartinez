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
public class Hamadriades extends Hadas{
    public int salud=373;
    public int saluda=173;
    public String descripcion="Ninfas ligadas a un árbol concreto de tal modo que si éste era cortado, la ninfa moría con él.";
    public double daño=78;

    public Hamadriades() {
    }

    public Hamadriades(String nombre, int edad, int estatura) {
        super(nombre, edad, estatura);
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSaluda() {
        return saluda;
    }

    public void setSaluda(int saluda) {
        this.saluda = saluda;
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
