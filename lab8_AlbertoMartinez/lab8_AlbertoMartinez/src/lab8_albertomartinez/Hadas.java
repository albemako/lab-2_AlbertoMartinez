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
public class Hadas {
    public String nombre;
    public int edad;
    public int estatura;//<=15

    public Hadas() {
    }

    public Hadas(String nombre, int edad, int estatura) {
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


    @Override
    public String toString() {
        return nombre;
    }
    
    
}
