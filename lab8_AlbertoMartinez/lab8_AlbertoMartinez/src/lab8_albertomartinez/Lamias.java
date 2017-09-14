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
public class Lamias extends Hadas{
    public int tamaletas;//<=5cm
    public int numbranquias;//<8
    public int salud=45;
    public String descripcion="Su poder consta en atrapar a sus enemigos con su encanto";
    public double daño=57.0;

    public Lamias() {
    }

    public Lamias(int tamaletas, int numbranquias, String nombre, int edad, int estatura) {
        super(nombre, edad, estatura);
        this.tamaletas = tamaletas;
        this.numbranquias = numbranquias;
    }


    public int getTamaletas() {
        return tamaletas;
    }

    public void setTamaletas(int tamaletas) {
        this.tamaletas = tamaletas;
    }

    public int getNumbranquias() {
        return numbranquias;
    }

    public void setNumbranquias(int numbranquias) {
        this.numbranquias = numbranquias;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
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
