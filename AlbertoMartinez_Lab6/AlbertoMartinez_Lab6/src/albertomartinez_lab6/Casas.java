/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertomartinez_lab6;

/**
 *
 * @author Alberto
 */
public class Casas extends Lugares{

    public Casas() {
    }

    public Casas(String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
    }

    
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
