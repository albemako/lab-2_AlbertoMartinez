/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_albertomartinez;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Alberto
 */
public class simulacion {
    public JProgressBar progBar_h1;
    public JProgressBar progBar_h2;
    public boolean win;
    public JLabel jl_h1;
    public JLabel jl_h2;
    public Hadas hada1;
    public Hadas hada2;

    public simulacion(JProgressBar progBar_h1, JProgressBar progBar_h2, Hadas hada1, Hadas hada2) {
        this.progBar_h1 = progBar_h1;
        this.progBar_h2 = progBar_h2;
        this.win = win;
        this.hada1 = hada1;
        this.hada2 = hada2;
    }

    public JProgressBar getProgBar_h1() {
        return progBar_h1;
    }

    public void setProgBar_h1(JProgressBar progBar_h1) {
        this.progBar_h1 = progBar_h1;
    }

    public JProgressBar getProgBar_h2() {
        return progBar_h2;
    }

    public void setProgBar_h2(JProgressBar progBar_h2) {
        this.progBar_h2 = progBar_h2;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public JLabel getJl_h1() {
        return jl_h1;
    }

    public void setJl_h1(JLabel jl_h1) {
        this.jl_h1 = jl_h1;
    }

    public JLabel getJl_h2() {
        return jl_h2;
    }

    public void setJl_h2(JLabel jl_h2) {
        this.jl_h2 = jl_h2;
    }

    public Hadas getHada1() {
        return hada1;
    }

    public void setHada1(Hadas hada1) {
        this.hada1 = hada1;
    }

    public Hadas getHada2() {
        return hada2;
    }

    public void setHada2(Hadas hada2) {
        this.hada2 = hada2;
    }
    
    public void run(){
        progBar_h1.setValue((int) hada1.getSalud());
        progBar_h2.setValue((int) hada2.getSalud());
        progBar_h1.setMaximum((int) hada1.getSalud());
        progBar_h2.setMaximum((int) hada2.getSalud());
        String ganador = "";
        boolean bandera = true;
        while (bandera) {
            if ((hada1 instanceof Salamandras) && (hada2 instanceof Hamadriades)) {
                hada2.setSalud(hada2.getSalud() - (hada1.getDaño() + (hada1.getDaño() * 0.37)));
            } else if ((hada1 instanceof Lamias) && (hada2 instanceof Salamandras)) {
                hada2.setSalud(hada2.getSalud() - (hada1.getDaño() + (hada1.getDaño() * 0.42)));
            } else if ((hada1 instanceof Silfides) && (hada2 instanceof Salamandras)) {
                hada2.setSalud(hada2.getSalud() - (hada1.getDaño() + (hada1.getDaño() * 0.37)));
            } else {
                hada2.setSalud(hada2.getSalud() - hada1.getDaño());
            }
            progBar_h2.setValue((int) hada2.getSalud());

            if (hada2.getSalud() <= 0) {
                bandera = false;
                ganador = hada1.getNombre();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                
            }

            if (bandera) {
                if ((hada2 instanceof Salamandras) && (hada2 instanceof Hamadriades)) {
                    hada1.setSalud(hada1.getSalud() - (hada2.getDaño() + (hada2.getDaño() * 0.37)));
                } else if ((hada2 instanceof Lamias) && (hada2 instanceof Salamandras)) {
                    hada1.setSalud(hada1.getSalud() - (hada2.getDaño() + (hada2.getDaño() * 0.42)));
                } else if ((hada2 instanceof Silfides) && (hada2 instanceof Salamandras)) {
                    hada1.setSalud(hada1.getSalud() - (hada2.getDaño() + (hada2.getDaño() * 0.37)));
                } else {
                    hada1.setSalud(hada1.getSalud() - hada2.getDaño());
                }
                progBar_h1.setValue((int) hada1.getSalud());

                if (hada1.getSalud() <= 0) {
                    bandera = false;
                    ganador = hada2.getNombre();
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    
                }
            }

        }
        JOptionPane.showMessageDialog(null, "ganador es: " + ganador);
    }
    }

