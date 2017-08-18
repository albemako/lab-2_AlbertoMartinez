/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_albertomartinez;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Conjuntos {
    ArrayList <NumerosComplejos> complejos=new ArrayList();

    public Conjuntos() {
    }

    public ArrayList<NumerosComplejos> getComplejos() {
        return complejos;
    }

    public void setComplejos(ArrayList<NumerosComplejos> complejos) {
        this.complejos = complejos;
    }

    @Override
    public String toString() {
        return  complejos + ", ";
    }
    
    
}
