/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos;

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
    private ArrayList<Persona>listaPersonas = new ArrayList();
    private File archivo=null;

    public administrarPersonas() {
    }
    
    public administrarPersonas(String path){
        archivo=new File(path);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
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
    public void setPersona(Persona p){
        this.listaPersonas.add(p);
    }
    
    //metodos de administracion
    public void escribirArchivo()throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        try {
            fw=new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                bw.write(t.getCodigo()+";");
                bw.write(t.getNombre()+";");
                bw.write(t.getEdad()+";");
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
                    listaPersonas.add(new Persona(sc.nextInt(),sc.next(),sc.nextInt()));
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
