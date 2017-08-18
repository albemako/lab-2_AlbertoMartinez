
package labexamen1_alberto.martinez;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class LabExamen1_AlbertoMartinez {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <Usuario> usuarios=new ArrayList();
        ArrayList <Libros> libreria=new ArrayList();
        ArrayList <String> genero = new ArrayList();
        genero.add("Fantasia");
        genero.add("Romance");
        genero.add("Accion");
        genero.add("Historia");
        Date fecha = null;
        
        //agregar admin
        usuarios.add(new Usuario("admin", "hola", fecha, 31943173, "albemako@yahoo.com", "alberto", "accion", true));
        
        String op="";
        String cuenta="";
        while ( !op.equals("s") ) {  
            op=JOptionPane.showInputDialog(""
                    + "a-Login\n"
                    + "s-salir");
            if(op==null){
                op="s";
            }
            if (op.equals("a")) {
                cuenta=JOptionPane.showInputDialog("Tiene cuenta?s/n");
                if (cuenta.equals("s")) {
                                    int resp=1;
                                    String resp2="n";
                do{
                    resp2="n";
                do{
                    resp=1;
                String user="nel", pass="nel";
                user=JOptionPane.showInputDialog("Username");
                pass=JOptionPane.showInputDialog("Password");
                if (user==null||pass==null||user.equals("")||pass.equals("")){
                    user="nel";
                    pass="nel";
                }
                for (int i = 0; i < usuarios.size(); i++) {
                    if(usuarios.get(i).getUsuario().contains(user) && usuarios.get(i).getContraseña().contains(pass)){
                        if(usuarios.get(i).isAdmin()){
                            JOptionPane.showMessageDialog(null, "Bienvenido " + usuarios.get(i).getNombre()); 
                            String opci="";
                            while ( !opci.equals("s") ) {  
                                opci=JOptionPane.showInputDialog(""
                                        + "a-agregar Libro\n"
                                        + "b-modificar Libro\n"
                                        + "c-eliminar Libro\n"
                                        + "d-listar Libreria\n"
                                        + "s-salir");
                                if(opci==null){
                                    opci="s";
                                }
                                if (opci.equals("a")) {
                                    String titulo;
                                    String descripcion;
                                    int puntaje;
                                    int copias;
                                    String gen;
                                    double valor;
                                    String edicion;
                                    String autor;
                                    Date publicacion=null;
                                    String s="";
                                    titulo=JOptionPane.showInputDialog("Titulo");
                                    descripcion=JOptionPane.showInputDialog("Descripcion");
                                    puntaje=Integer.parseInt(JOptionPane.showInputDialog("Puntaje del 1-5"));
                                    copias=Integer.parseInt(JOptionPane.showInputDialog("Cuantas copias hay?"));
                                    for (Object t : genero) {
                                        if (t instanceof String) {
                                           s+= ""+t+"\n" ;
                                        }
                                    }
                                    gen=JOptionPane.showInputDialog(s+"\n"+"escriba el Genero que quiere");
                                    valor=Integer.parseInt(JOptionPane.showInputDialog("Valor"));
                                    edicion=JOptionPane.showInputDialog("Edicion");
                                    autor=JOptionPane.showInputDialog("Autor");
                                    //*fecha*
                                    libreria.add(new Libros(titulo,descripcion,puntaje,copias,gen,valor, edicion, autor, publicacion));                
                                }
                                if (opci.equals("b")) {
                                    int pos;
                                    String titulo;
                                    String descripcion;
                                    int puntaje;
                                    int copias;
                                    String gen;
                                    double valor;
                                    String edicion;
                                    String autor;
                                    Date publicacion=null;
                                    String s="";
                                    for (Object t : libreria) {
                                        if (t instanceof Libros) {
                                           s+= ""+libreria.indexOf(t)+"- "+t+"\n" ;
                                        }
                                    }
                                    pos=Integer.parseInt(
                                      JOptionPane.showInputDialog(s+"\n"+"Que posicion desea Modificar?")
                                    ); 
                                    titulo=JOptionPane.showInputDialog("Nuevo Titulo");
                                    descripcion=JOptionPane.showInputDialog("Nueva Descripcion");
                                    puntaje=Integer.parseInt(JOptionPane.showInputDialog("Nuevo Puntaje del 1-5"));
                                    copias=Integer.parseInt(JOptionPane.showInputDialog("Cuantas copias hay?"));
                                    for (Object t : genero) {
                                        if (t instanceof String) {
                                           s+= ""+t+"\n" ;
                                        }
                                    }
                                    gen=JOptionPane.showInputDialog(s+"\n"+"escriba el Nuevo Genero que quiere");
                                    valor=Integer.parseInt(JOptionPane.showInputDialog("Nuevo Valor"));
                                    edicion=JOptionPane.showInputDialog("Nueva Edicion");
                                    autor=JOptionPane.showInputDialog("Nuevo Autor");
                                    
                                    
                                    
                                    ((Libros)libreria.get(pos)).setTitulo(titulo);
                                    ((Libros)libreria.get(pos)).setDescripcion(descripcion);
                                    ((Libros)libreria.get(pos)).setPuntaje(puntaje);
                                    ((Libros)libreria.get(pos)).setCopias(copias);
                                    ((Libros)libreria.get(pos)).setGenero(gen);
                                    ((Libros)libreria.get(pos)).setValor(valor);
                                    ((Libros)libreria.get(pos)).setEdicion(edicion);
                                    ((Libros)libreria.get(pos)).setAutor(autor);
                                }
                                if (opci.equals("c")) {
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

                                if (opci.equals("d")) {
                                    String s="";
                                    for (Object t : libreria) {
                                        if (t instanceof Libros) {
                                           s+= ""+libreria.indexOf(t)+"- "+t+"\n" ;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, s);
                                }
                                if (opci.equals("e")){

                                }
                            }
                            
                            
                            
                            resp=1;
                        }else{
                            JOptionPane.showMessageDialog(null, "Bienvenido " + usuarios.get(i).getNombre());
                            
                            
                            
                            resp=1;
                        } 
                    }
                    else{
                        resp=3;
                    }
                }
                }while(resp==0);
                if(resp==3){
                   JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");                   
                }
                resp2=JOptionPane.showInputDialog(null, "Desea volver a ingresar usuario?s/n");
                if (resp2==(null)){
                    resp2="n";
                }
                }while(resp2.equals("s"));
                }else{
                    JOptionPane.showMessageDialog(null, "Creara una cuenta nueva");
                    String usuario;
                    String contra;
                    int telefono;
                    String correo;
                    String nombre;
                    String genfav;
                    boolean admin=false;
                    
                    usuario=JOptionPane.showInputDialog("Username");
                    contra=JOptionPane.showInputDialog("Contraseña");
                    telefono=Integer.parseInt(JOptionPane.showInputDialog("Telefono"));
                    correo=JOptionPane.showInputDialog("Correo");
                    nombre=JOptionPane.showInputDialog("Nombre");
                    genfav=JOptionPane.showInputDialog("Genero Favorito");
                    usuarios.add(new Usuario(usuario, contra, fecha, telefono, correo, nombre, genfav, admin));  

                    }
                
                
            }
            if (op.equals("l")) {
                String s="";
                for (Object t : usuarios) {
                    if (t instanceof Usuario) {
                       s+= ""+usuarios.indexOf(t)+"- "+t+"\n" ;
                    }
                }
                JOptionPane.showMessageDialog(null, s);
            }
        }
    }
}
