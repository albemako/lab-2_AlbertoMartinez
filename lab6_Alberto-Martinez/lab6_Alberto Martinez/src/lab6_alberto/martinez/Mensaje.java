/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_alberto.martinez;

/**
 *
 * @author Alberto
 */
public class Mensaje {
    public String correo;
    public String mensaje;
    public String estado;

    public Mensaje() {
    }

    public Mensaje(String correo, String mensaje, String estado) {
        this.correo = correo;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return mensaje ;
    }
    
    
}
