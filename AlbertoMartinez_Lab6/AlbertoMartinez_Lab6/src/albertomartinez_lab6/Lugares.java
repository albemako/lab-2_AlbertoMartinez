/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertomartinez_lab6;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Lugares {

    public String nombre;
    public String direccion;
    public int seguridad;
    ArrayList <Carreteras> carreteras=new ArrayList();

    public Lugares() {
    }

    public Lugares(String nombre, String direccion, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.seguridad = seguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    public ArrayList<Carreteras> getCarreteras() {
        return carreteras;
    }

    public void setCarreteras(ArrayList<Carreteras> carreteras) {
        this.carreteras = carreteras;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
