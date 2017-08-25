/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_albertomartinez;

/**
 *
 * @author Alberto
 */
public class Rey extends Figuras{
    


    public String[][] Movimiento(int pos1, int pos2, int nuevapos1, int nuevapos2, String[][] Tablero) {
        Tablero[nuevapos1][nuevapos2] = Tablero[pos1][pos2];
        Tablero[pos1][pos2] = "   ";
        
                //comer
        if (Tablero[nuevapos1][nuevapos2+1].equals(" • ")) {
            if (Tablero[nuevapos1][nuevapos2+2].equals(" o ")) {
                Tablero[nuevapos1][nuevapos2+1]="   ";
            }
        }
        if (Tablero[nuevapos1][nuevapos2-1].equals(" • ")) {
            if (Tablero[nuevapos1][nuevapos2-2].equals(" o ")) {
                Tablero[nuevapos1][nuevapos2-1]="   ";
            }
        }
        if (Tablero[nuevapos1+1][nuevapos2].equals(" • ")) {
            if (Tablero[nuevapos1+2][nuevapos2].equals(" o ")) {
                Tablero[nuevapos1+1][nuevapos2]="   ";
            }
        }
        if (Tablero[nuevapos1-1][nuevapos2].equals(" • ")) {
            if (Tablero[nuevapos1-2][nuevapos2].equals(" o ")) {
                Tablero[nuevapos1-1][nuevapos2]="   ";
            }
        }
        
        return Tablero;
    }
}
