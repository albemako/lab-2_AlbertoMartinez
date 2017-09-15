/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_albertomartinez;

import javax.swing.JLabel;
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

    public simulacion(JProgressBar progBar_h1, JProgressBar progBar_h2, boolean win, Hadas hada1, Hadas hada2) {
        this.progBar_h1 = progBar_h1;
        this.progBar_h2 = progBar_h2;
        this.win = win;
        this.hada1 = hada1;
        this.hada2 = hada2;
    }
    
    
}
