/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.awt.Color;

/**
 *
 * @author Alberto
 */
public class herbolario extends Experimento{
    private String nombre;
    private boolean veneno;
    private Color color;
    private String contextura;

    public herbolario() {
    }

    public herbolario(String nombre, boolean veneno, Color color, String contextura) {
        this.nombre = nombre;
        this.veneno = veneno;
        this.color = color;
        this.contextura = contextura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    @Override
    public String toString() {
        return "herbolario{" + "nombre=" + nombre + ", veneno=" + veneno + ", color=" + color + ", contextura=" + contextura + '}';
    }
    
        public String nivel(){
        if(veneno){
            return "avanzado";
        }else{
            return "basico";
        }
    }
}
