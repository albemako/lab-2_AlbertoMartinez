/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albertomartinez_lab6;

/**
 *
 * @author Alberto
 */
public class Carreteras {

    public int numero;
    public double distancia;
    public Lugares inicio;
    public Lugares finaliza;

    public Carreteras() {
    }

    public Carreteras(int numero, double distancia, Lugares inicio, Lugares finaliza) {
        this.numero = numero;
        this.distancia = distancia;
        this.inicio = inicio;
        this.finaliza = finaliza;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugares getInicio() {
        return inicio;
    }

    public void setInicio(Lugares inicio) {
        this.inicio = inicio;
    }

    public Lugares getFinaliza() {
        return finaliza;
    }

    public void setFinaliza(Lugares finaliza) {
        this.finaliza = finaliza;
    }

    @Override
    public String toString() {
        return "Carretera numero: " + numero ;
    }
    
    
}
