/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_cartas;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alberto
 */
public class Baraja {
    public ArrayList<Carta> cartas;

    Baraja(){
        cartas = new ArrayList();
        String palos[] = {"♣","♠","♦","♥"};//alt 3-6
        String valores[] = {"A","2","3","4","5","6","7",
                  "8","9","10","J","Q","K"};
        for(int i = 0; i < palos.length; i++){
            for(int j = 0; j < valores.length; j++){
                cartas.add(
                        new Carta(palos[i],valores[j].charAt(0)
                         )
                );
            }
        }
    }//Fin del constructor

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
       
    public void Barajar(){
        Collections.shuffle(cartas);        
    }

    public Carta repartirCarta(){
        Carta carta = cartas.get(cartas.size() - 1);
        cartas.remove(cartas.size() - 1);
        return carta;
    }

}//Fin de la clase
