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

    public String descripcion="Su poder consta en atrapar a sus enemigos con su encanto";


    public Lamias() {
        
    }

    public Lamias(int tamaletas, int numbranquias, int salud, int daño, String nombre, int edad, int estatura) {
        super(salud, daño, nombre, edad, estatura);
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
