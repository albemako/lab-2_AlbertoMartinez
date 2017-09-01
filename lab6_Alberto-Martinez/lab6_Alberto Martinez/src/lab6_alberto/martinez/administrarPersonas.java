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
public class administrarPersonas {
    public ArrayList<Usuario>listaPersonas = new ArrayList();
    private File archivo=null;

    public administrarPersonas() {
    }
    
    public administrarPersonas(String path){
        archivo=new File(path);
    }

    public ArrayList<Usuario> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Usuario> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }
    
    //extra mutador
    public void setPersona(Usuario u){
        this.listaPersonas.add(u);
    }
    
    //metodos de administracion
    public void escribirArchivo()throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            for (Usuario t : listaPersonas) {
                bw.write(t.getNombre()+";");
                bw.write(t.getApellido()+";");
                bw.write(t.getCorreo()+";");
                bw.write(t.getFecha()+";");
                bw.write(t.getPais()+";");
                bw.write(t.getTelefono()+";");
                bw.write(t.getContra()+";");
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
            listaPersonas=new ArrayList();
            try {
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext()){
                    listaPersonas.add(new Usuario(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next()));
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

