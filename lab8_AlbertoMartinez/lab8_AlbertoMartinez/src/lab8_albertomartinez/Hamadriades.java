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
    public int saluda=173;
    public String descripcion="Ninfas ligadas a un árbol concreto de tal modo que si éste era cortado, la ninfa moría con él.";

    public Hamadriades() {
    }

    public Hamadriades(int salud, int daño, String nombre, int edad, int estatura) {
        super(salud, daño, nombre, edad, estatura);
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


    
}
