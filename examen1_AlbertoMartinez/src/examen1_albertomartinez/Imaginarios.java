/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_albertomartinez;

/**
 *
 * @author Alberto
 */
public class Imaginarios {
    
    int entero;
    String cons;

    public Imaginarios() {
    }

    public Imaginarios(int entero, String cons) {
        
        this.entero = entero;
        this.cons = cons;
    }


    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    @Override
    public String toString() {
        return entero+ cons;
    }
    
    
}
