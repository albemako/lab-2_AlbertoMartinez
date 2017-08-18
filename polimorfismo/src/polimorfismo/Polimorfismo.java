/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;


public class Polimorfismo {


    public static void main(String[] args) {
        ArrayList lista=new ArrayList();
        lista.add(5);
        lista.add("perro");
        lista.add(new Encantamiento());
        lista.add(new Encantamiento());
        lista.add(new herbolario());
        
        ((Encantamiento)lista.get(2)).setPersonas(150);
        ((Encantamiento)lista.get(3)).setPersonas(30);
        ((herbolario)lista.get(4)).setVeneno(true);
        
        for (Object t : lista) {
            if (t instanceof Experimento) {
                if ((Experimento)t).nivel().equals("avanzado") {
                    System.out.println(t);
                }
            }
            
        }
    }
    
}
