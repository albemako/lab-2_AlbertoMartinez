
package labexamen1_alberto.martinez;

import java.util.ArrayList;
import java.util.Date;


public class Usuario {

public String usuario;
public String contraseña;
public Date fecha;
public int telefono;
public String correo;
public String nombre;
public String genfav;
ArrayList <Libros>libro=new ArrayList();
ArrayList <Usuario>amigos=new ArrayList();
boolean admin;
    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, Date fecha, int telefono, String correo, String nombre, String genfav, boolean admin) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.genfav = genfav;
        this.admin = admin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenfav() {
        return genfav;
    }

    public void setGenfav(String genfav) {
        this.genfav = genfav;
    }

    public ArrayList<Libros> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libros> libro) {
        this.libro = libro;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
    @Override
    public String toString() {
        return "Usuario:" + usuario + "/ Nombre:" + nombre;
    }



}
