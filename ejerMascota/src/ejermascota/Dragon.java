/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejermascota;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Alberto
 */
public class Dragon extends Mascota{
    private Color color;

    public Dragon() {
        super();
    }

    public Dragon(Color color, int codigo, String nombre, double peso, Date fecha) {
        super(codigo, nombre, peso, fecha);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dragon{" + "color=" + color + '}';
    }

    
    
    
    
}
