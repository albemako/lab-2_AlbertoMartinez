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
public class Materiales {
    public Color color;
    public String textura;
    public String descripcion;

    public Materiales() {
    }

    
    
    public Materiales(Color color, String textura, String descripcion) {
        this.color = color;
        this.textura = textura;
        this.descripcion = descripcion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Materiales{" + "color=" + color + ", textura=" + textura + ", descripcion=" + descripcion + '}';
    }
    
    
}
