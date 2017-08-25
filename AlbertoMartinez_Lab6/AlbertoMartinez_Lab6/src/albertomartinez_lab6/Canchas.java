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
public class Canchas extends Lugares{

    public String categoria;
    public String estado;

    public Canchas() {
    }

    public Canchas(String categoria, String estado, String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
        this.categoria = categoria;
        this.estado = estado;
    }



    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
