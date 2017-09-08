/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_alberto.martinez;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto
 */
public class Lugar extends Thread{

    public String nombre;
    public String clima;
    public int extension;
    public int habitantes;
    public String zona;
    public int fundacion;
    public TablaDePersonas tdp;
    public ArrayList<Persona> listapersonas=new ArrayList();

    public Lugar() {
    }

    public Lugar(TablaDePersonas tdp) {
        this.tdp = tdp;
    }


    public Lugar(String nombre, String clima, int extension, int habitantes, String zona, int fundacion, TablaDePersonas tdp) {
        this.nombre = nombre;
        this.clima = clima;
        this.extension = extension;
        this.habitantes = habitantes;
        this.zona = zona;
        this.fundacion = fundacion;
        this.tdp = tdp;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public ArrayList<Persona> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<Persona> listapersonas) {
        this.listapersonas = listapersonas;
    }
    
    public void run(){
        
            TablaDePersonas tp=new TablaDePersonas();
            principal p=new principal();
            System.out.println(nombre);
            tp.jl_nombre.setText(nombre);
            tp.pack();
            tp.setVisible(true);
            
            
            while(true){
                System.out.println("hola");
                tp.jt_personas.setModel(new javax.swing.table.DefaultTableModel(
                         new Object [][] {

                         },
                         new String [] {
                             "Nombre", "ID", "Lugar", "Edad", "Estatura", "Profesion"
                         }
                     ));

                DefaultTableModel modelo=(DefaultTableModel)tp.jt_personas.getModel();

                for (int i = 0; i < p.personas.size(); i++) {
                    if(p.personas.get(i).getLugar().equals(nombre)){
                    Object[] newrow={p.personas.get(i).getNombre(), p.personas.get(i).getId(), p.personas.get(i).getLugar(),p.personas.get(i).getEdad(), p.personas.get(i).getEstatura(), p.personas.get(i).getProfesion()};
                    modelo.addRow(newrow);
                    
                    }
                }
                tp.jt_personas.setModel(modelo);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                }
        }
            
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
