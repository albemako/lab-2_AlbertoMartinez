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


    public Lugar(String nombre, String clima, int extension, int habitantes, String zona, int fundacion, TablaDePersonas tdp, ArrayList listapersonas) {
        this.nombre = nombre;
        this.clima = clima;
        this.extension = extension;
        this.habitantes = habitantes;
        this.zona = zona;
        this.fundacion = fundacion;
        this.tdp = tdp;
        this.listapersonas=listapersonas;
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
            tp.jl_nombre.setText(nombre);
            tp.pack();
            tp.setVisible(true);
            System.out.println(listapersonas.size());
            
            while(true){
                
                tp.jt_personas.setModel(new javax.swing.table.DefaultTableModel(
                         new Object [][] {

                         },
                         new String [] {
                             "Nombre", "ID", "Lugar", "Edad", "Estatura", "Profesion"
                         }
                     ));

                DefaultTableModel modelo=(DefaultTableModel)tp.jt_personas.getModel();
                
                for (int i = 0; i < listapersonas.size(); i++) {
                    System.out.println(listapersonas.get(i).getLugar());
                    if(listapersonas.get(i).getLugar().equals(tp.jl_nombre.getText())){
                        
                    Object[] newrow={listapersonas.get(i).getNombre(), listapersonas.get(i).getId(), listapersonas.get(i).getLugar(),listapersonas.get(i).getEdad(), listapersonas.get(i).getEstatura(), listapersonas.get(i).getProfesion()};
                    modelo.addRow(newrow);
                    tp.jt_personas.setModel(modelo);
                    }
                }
                
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
