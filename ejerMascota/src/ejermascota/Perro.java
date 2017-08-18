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
public class Perro extends Mascota{
    private String raza;

    public Perro() {
        super();
    }

    public Perro(String raza, int codigo, String nombre, double peso, Date fecha) {
        super(codigo, nombre, peso, fecha);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }


    
    
    
    
    
    
}
