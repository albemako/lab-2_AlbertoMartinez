/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_alberto.martinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class administrarMensajes {
    public ArrayList<Mensaje>listaMensajes = new ArrayList();
    private File archivo=null;

    public administrarMensajes() {
    }
    
    public administrarMensajes(String path){
        archivo=new File(path);
    }

    public ArrayList<Mensaje> getListaMensaje() {
        return listaMensajes;
    }

    public void setListaPersonas(ArrayList<Mensaje> listaMensaje) {
        this.listaMensajes = listaMensaje;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaMensajes=" + listaMensajes;
    }
    
    //extra mutador
    public void setMensaje(Mensaje m){
        this.listaMensajes.add(m);
    }
    
    //metodos de administracion
    public void escribirArchivo()throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            for (Mensaje t : listaMensajes) {
                bw.write(t.getCorreo()+";");
                bw.write(t.getEstado()+";");
                bw.write(t.getMensaje()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        finally{
            bw.close();
            fw.close();
        }
    }
    
    //cargar archivo
    public void cargarArchivo(){
        if(archivo.exists()){
            Scanner sc=null;
            listaMensajes=new ArrayList();
            try {
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listaMensajes.add(new Mensaje(sc.next(),sc.next(),sc.next()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            finally{
                sc.close();
            }
        }//fin if exists
    }
    
}
