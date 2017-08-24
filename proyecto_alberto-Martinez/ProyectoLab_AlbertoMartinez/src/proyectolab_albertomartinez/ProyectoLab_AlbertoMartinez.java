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
public class ProyectoLab_AlbertoMartinez {

    static String[][] Tablero = Lectura();
    
    public static void main(String[] args) {
        
        Imprimir(Tablero);
        
    }
    
    public static String[][] Lectura() {
        String[][] Temporal = new String[20][20];
        //duques
        Temporal[9][5] = " o ";
        Temporal[11][5] = " o ";
        Temporal[10][7] = " o ";
        Temporal[9][8] = " o ";
        Temporal[11][8] = " o ";
        Temporal[5][9] = " o ";
        Temporal[8][9] = " o ";
        Temporal[10][9] = " o ";
        Temporal[12][9] = " o ";
        Temporal[15][9] = " o ";
        Temporal[12][11] = " o ";
        Temporal[10][11] = " o ";
        Temporal[8][11] = " o ";
        Temporal[5][11] = " o ";
        Temporal[15][11] = " o ";
        Temporal[11][12] = " o ";
        Temporal[9][12] = " o ";
        Temporal[10][13] = " o ";
        Temporal[9][15] = " o ";
        Temporal[11][15] = " o ";
        Temporal[7][10] = " o ";
        Temporal[9][10] = " o ";
        Temporal[11][10] = " o ";
        Temporal[13][10] = " o ";
        //rey
        Temporal[1][1] = "{o}";
        

        //rebeldes
        Temporal[1][1] = " • ";
        
        //las X
        Temporal[1][1] = " X ";
        Temporal[1][2] = " X ";
        Temporal[2][1] = " X ";
        Temporal[2][2] = " X ";
        
        Temporal[1][18] = " X ";
        Temporal[1][19] = " X ";
        Temporal[2][18] = " X ";
        Temporal[2][19] = " X ";
        
        Temporal[18][1] = " X ";
        Temporal[18][2] = " X ";
        Temporal[19][1] = " X ";
        Temporal[19][2] = " X ";
        
        Temporal[18][18] = " X ";
        Temporal[18][19] = " X ";
        Temporal[19][18] = " X ";
        Temporal[19][19] = " X ";
        

        int cont=0, cont2=1;
        for (int i = 0; i < Temporal.length; i++) {
            for (int j = 0; j < Temporal[i].length; j++) {
                if(i==0){
                    if(cont>9){
                        Temporal[i][j] = " "+(cont);
                    }else{
                        Temporal[i][j] = " "+(cont)+" ";
                    }
                    cont++;
                }
                if (j==0&&i>0) {
                    if(cont2>9){
                        Temporal[i][j] = " "+(cont2); 
                    }else{
                        Temporal[i][j] = " "+(cont2)+" ";
                    }
                    cont2++;
                }
                
            }
            
        }
        
        for (int i = 0; i < Temporal.length; i++) {
            for (int j = 0; j < Temporal[i].length; j++) {
                if (Temporal[i][j] == null) {
                    Temporal[i][j] = "   ";
                }
            }
        }
        

        return Temporal;

    }
        public static void Imprimir(String[][] matriz) {
            if (matriz[10][10].equals("   ")) {
                matriz[10][10]=" X ";
            }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" |");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }
}
