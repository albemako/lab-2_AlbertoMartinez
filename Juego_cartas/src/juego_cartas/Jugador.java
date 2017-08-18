/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_cartas;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Jugador {

    public ArrayList<Carta> cartas;
    public String nombre;

    Jugador(String nombre) {
        this.nombre = nombre;
        cartas = new ArrayList<Carta>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    //mutadores cartas modificados
    public void recibirCarta(Carta carta) {
        cartas.add(carta);
    }
    
    public String getCartas() {
        String res = "";
        for (int i = 0; i < cartas.size(); i++) {
            res += "" + cartas.get(i).getPalo() + 
                             cartas.get(i).getValor() + "\n";
        }
        return res;
    }

    //metodos de administracion
    public int valorEntero(char c) {
        switch (c) {
            case 'A': {
                return 1;
            }
            case 'K': {
                return 13;
            }
            case 'Q': {
                return 12;
            }
            case 'J': {
                return 11;
            }
            case '1': {
                return 10;
            }
            default: {
                return Integer.parseInt("" + c);
            }
        }//Fin del switch
    }//Fin del metodo

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public int calcularValor() {
        int valor = 0;
        for (int i = 0; i < cartas.size(); i++) {
            valor += valorEntero(cartas.get(i).getValor());
        }
        return valor;
    }
    
    public String toString(){
        return nombre;
    }
}
