/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_albertomartinez.pkg11641226;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class Lab2_AlbertoMartinez11641226 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <usuario> lista=new ArrayList();
        
        String op="";
        while ( !op.equals("s") ) {  
            op=JOptionPane.showInputDialog(""
                    + "a-agregar\n"
                    + "b-modificar usuario\n"
                    + "c-eliminar usuario\n"
                    + "d-listar usuarios\n"
                    + "e-LOGIN\n"
                    + "s-salir");
            if(op==null){
                op="s";
            }
            if (op.equals("a")) {
                
                int edad;
                String nombre, lugar, usuario, pass;
                nombre=JOptionPane.showInputDialog("nombre");
                edad=Integer.parseInt(
                  JOptionPane.showInputDialog("edad")
                );
                lugar=JOptionPane.showInputDialog("Lugar de nacimiento");
                usuario=JOptionPane.showInputDialog("Username");
                pass=JOptionPane.showInputDialog("Password");
                lista.add(new usuario(nombre,edad,lugar,usuario,pass));                
            }
            if (op.equals("b")) {
                int pos, edad;
                String nombre, lugar, usuario, pass;
                String s="";
                for (Object t : lista) {
                    if (t instanceof usuario) {
                       s+= ""+lista.indexOf(t)+"- "+t+"\n" ;
                    }
                }
                pos=Integer.parseInt(
                  JOptionPane.showInputDialog(s+"\n"+"Que posicion desea Modificar?")
                );             
                nombre=JOptionPane.showInputDialog("nuevo nombre");
                edad=Integer.parseInt(
                  JOptionPane.showInputDialog("nueva edad")
                );
                lugar=JOptionPane.showInputDialog("nuevo Lugar de nacimiento");
                usuario=JOptionPane.showInputDialog("nuevo Username");
                pass=JOptionPane.showInputDialog("nuevo Password");
                ((usuario)lista.get(pos)).setNombre(nombre);
                ((usuario)lista.get(pos)).setEdad(edad);
                ((usuario)lista.get(pos)).setlugar(lugar);
                ((usuario)lista.get(pos)).setUsername(usuario);
                ((usuario)lista.get(pos)).setPassword(pass);
            }
            if (op.equals("c")) {
                int pos;
                String s="";
                for (Object t : lista) {
                    if (t instanceof usuario) {
                       s+= ""+lista.indexOf(t)+"- "+t+"\n" ;
                    }
                }
                pos=Integer.parseInt(
                  JOptionPane.showInputDialog(s+"\n"+"Que posicion desea Eliminar?")
                );
                
               lista.remove(pos);
           }
            
            if (op.equals("d")) {
                String s="";
                for (Object t : lista) {
                    if (t instanceof usuario) {
                       s+= ""+lista.indexOf(t)+"- "+t+"\n" ;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }
            if (op.equals("e")){
                int resp=1, resp2=1;
                do{
                    resp2=1;
                do{
                    resp=1;
                String user="", pass="";
                user=JOptionPane.showInputDialog("Username");
                pass=JOptionPane.showInputDialog("Password");
                for (int i = 0; i < lista.size(); i++) {
                    if(lista.get(i).getUsername().contains(user) && lista.get(i).getPassword().contains(pass)){
                        JOptionPane.showMessageDialog(null, "Bienvenido");  
                    }
                    else{
                        resp=3;
                    }
                }
                }while(resp==0);
                if(resp==3){
                   JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                   resp2=0;
                }
                }while(resp2==0);
            }
        }
    }
    
}
