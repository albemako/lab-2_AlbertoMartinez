/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Date;

/**
 *
 * @author Alberto
 */
public class Encantamiento extends Experimento{
    private int personas;
    private int duracion;
    private String instrumento;

    public Encantamiento() {
        super();
    }

    public Encantamiento(int personas, int duracion, String instrumento, String nombre, double calificacion, Date fecha) {
        super(nombre, calificacion, fecha);
        this.personas = personas;
        this.duracion = duracion;
        this.instrumento = instrumento;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    
    
    @Override
    public String toString() {
        return "Encantamiento{" + "personas=" + personas + ", duracion=" + duracion + ", instrumento=" + instrumento + '}';
    }
    
    public String nivel(){
        if(this.personas>50){
            return "avanzado";
        }else{
            return "basico";
        }
    }
    
}
