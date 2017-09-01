
package lab6_alberto.martinez;

import java.util.ArrayList;
import java.util.Date;


public class Usuario {

    public String nombre;  
    public String apellido;  
    public String correo;  
    public String fecha;  
    public String pais;  
    public int telefono;  
    public String contra;  
    public ArrayList <Mensaje> noLeidos=new ArrayList();  
    public ArrayList <Mensaje> leidos=new ArrayList();  
    public ArrayList <Mensaje> noDeseados=new ArrayList();  
    public ArrayList <Mensaje> spam=new ArrayList();  
    public ArrayList <Mensaje> borradores=new ArrayList();  
    public ArrayList <Mensaje> enviados=new ArrayList();  
    public ArrayList <Mensaje> eliminados=new ArrayList();  
    public ArrayList <Mensaje> importantes=new ArrayList();  

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, String fecha, String pais, int telefono, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.pais = pais;
        this.telefono = telefono;
        this.contra = contra;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Mensaje> getNoLeidos() {
        return noLeidos;
    }

    public void setNoLeidos(ArrayList<Mensaje> noLeidos) {
        this.noLeidos = noLeidos;
    }

    public ArrayList<Mensaje> getLeidos() {
        return leidos;
    }

    public void setLeidos(ArrayList<Mensaje> leidos) {
        this.leidos = leidos;
    }

    public ArrayList<Mensaje> getNoDeseados() {
        return noDeseados;
    }

    public void setNoDeseados(ArrayList<Mensaje> noDeseados) {
        this.noDeseados = noDeseados;
    }

    public ArrayList<Mensaje> getSpam() {
        return spam;
    }

    public void setSpam(ArrayList<Mensaje> spam) {
        this.spam = spam;
    }

    public ArrayList<Mensaje> getBorradores() {
        return borradores;
    }

    public void setBorradores(ArrayList<Mensaje> borradores) {
        this.borradores = borradores;
    }

    public ArrayList<Mensaje> getEnviados() {
        return enviados;
    }

    public void setEnviados(ArrayList<Mensaje> enviados) {
        this.enviados = enviados;
    }

    public ArrayList<Mensaje> getEliminados() {
        return eliminados;
    }

    public void setEliminados(ArrayList<Mensaje> eliminados) {
        this.eliminados = eliminados;
    }

    public ArrayList<Mensaje> getImportantes() {
        return importantes;
    }

    public void setImportantes(ArrayList<Mensaje> importantes) {
        this.importantes = importantes;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
}
