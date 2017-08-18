/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_cartas;

/**
 *
 * @author Alberto
 */
public class Carta {
    private String Palo;
    private char Valor;

    Carta(String palo, char valor){
        this.Palo = palo;
        this.Valor = valor;
    }

    public String getPalo() {
        return Palo;
    }

    public char getValor() {
        return Valor;
    }

    public void setPalo(String palo) {
         this.Palo=palo;
    }

    public void setValor(char valor) {
        this.Valor=valor;
    }
    
    public boolean compara(Carta c){
        if(this.Palo.equals(c.getPalo()) 
                && this.Valor==c.getValor()){
            return true;
        }
        return false;
    }

    
}
