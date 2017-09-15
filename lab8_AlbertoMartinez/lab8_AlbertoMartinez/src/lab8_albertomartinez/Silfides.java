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
public class Silfides extends Hadas{
    public int alas;//6 0 mas
    public String descripcion="el poder de lanzar tornados desde sus manos";

    public Silfides(int alas, int salud, int daño, String nombre, int edad, int estatura) {
        super(salud, daño, nombre, edad, estatura);
        this.alas = alas;
    }



    public Silfides() {
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
    
    
}
