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
public class NumerosComplejos extends Imaginarios{
    int ent;
    String signo;

    public NumerosComplejos() {
    }

    public NumerosComplejos(int ent, String signo, int entero, String cons) {
        super(entero, cons);
        this.ent = ent;
        this.signo = signo;
    }

    public int getEnt() {
        return ent;
    }

    public void setEnt(int ent) {
        this.ent = ent;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    @Override
    public String toString() {
        return "("+ ent+ signo + entero+ cons+ ')';
    }
    
    
}
