/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class ManejoDeArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int codigo;
        String nombre;
        int edad;
        //agregar
        codigo=Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
        nombre=JOptionPane.showInputDialog("Nombre");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
        
        administrarPersonas ap=new administrarPersonas("./salida.txt");
        ap.cargarArchivo();
        ap.getListaPersonas().add(new Persona(codigo,nombre, edad));
        ap.escribirArchivo();
        
        //listar
       ap.cargarArchivo();
        for (Persona t : ap.getListaPersonas()) {
            System.out.println(t);
        }
        
        //modifcar
        ap.cargarArchivo();
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea modificar"));
        nombre=JOptionPane.showInputDialog("nuevo Nombre");
        ap.getListaPersonas().get(0).setNombre(nombre);
        ap.escribirArchivo();
        
        //eliminar
        ap.cargarArchivo();
        pos=Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea borrar?"));
        ap.getListaPersonas().remove(pos);
        ap.escribirArchivo();
        
    }
    
}
