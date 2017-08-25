/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_albertomartinez;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProyectoLab_AlbertoMartinez {
    static Scanner sc=new Scanner(System.in);
    static String[][] Tablero = Lectura();
    static Rebeldes b = new Rebeldes();
    static Duques d=new Duques();
    static Rey r=new Rey();
    
    public static void main(String[] args) {
        int opcion;
        do{
        Tablero = Lectura();
        int cont=2;
        String Jugador1, Jugador2;
        Jugador1 = JOptionPane.showInputDialog("Nombre del lider de los Rebeldes (Piezas negras)");
        Jugador2 = JOptionPane.showInputDialog("Nombre del lider de los Duques (Piezas blancas)");
        
        //variable de control para ganar
        int win=0;
        do{
        
        int resp, fuera ,x, x1,y,y1;
            if (cont%2==0) {
                do{
                    
                    resp=2;
                    do{
                    fuera=1;
                    Imprimir(Tablero);
                    System.out.println("");
                    System.out.println("Es el turno de " + Jugador1+"!");
                    System.out.println("Si escoje una posicion fuera del tablero se le volvera a preguntar");
                    System.out.println("Escoja la Fila:");
                    x = sc.nextInt();
                    System.out.println("Columna:");
                    y = sc.nextInt();
                    System.out.println("Escoja la nueva posicion de fila:");
                    x1 = sc.nextInt();
                    System.out.println("columna:");
                    y1 = sc.nextInt();
                    
                    if(x<20&&y<20&&x1<20&&y1<20&&x>0&&y>0&&x1>0&&y1>0){
                        fuera=2;
                    }
                    
                    }while(fuera==1);
                        if (" • ".equals(Tablero[x][y])  ) {
                            resp=1;
                            if (x==x1||y==y1) {
                            if (x==x1) {
                                if(y<y1){
                                    for (int i = y+1; i <= y1; i++) {
                                        if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • "||Tablero[x][i] == " 0 ") {
                                            System.out.println("");
                                            resp=3;
                                            System.out.println("hola");
                                        }

                                    }
                                }if(y1<y){
                                    for (int i = y-1; i >= y1; i--) {
                                        if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • "||Tablero[x][i] == " 0 ") {
                                            System.out.println("");
                                            resp=3;

                                        }

                                    }
                                }

                            }
                            
                        
                            if (y==y1) {

                                if(x<x1){
                                    for (int i = x+1; i <= x1; i++) {
                                        if (Tablero[i][y] == " o "||Tablero[i][y] == "{o}"||Tablero[i][y] == " • "||Tablero[i][y] == " 0 ") {
                                            System.out.println("");
                                            resp=3;
                                        }
                                    }
                                }else{
                                    for (int i = x-1; i >= x1; i--) {
                                        if (Tablero[i][y] == " o "||Tablero[i][y] == "{o}"||Tablero[i][y] == " • "||Tablero[i][y] == " 0 ") {
                                            System.out.println("");
                                            resp=3;
                                        }

                                    }
                                 }

                            }
                            if (Tablero[x1][y1]==(" X ")) {
                                resp=4;
                            }
                            }else{
                            resp=5;
                            }    

                           
                    
                   
                        if (resp<2) {
                            Tablero=b.Movimiento(x, y, x1, y1, Tablero);
                            resp=1;
                        }
                        }
                       Validar(resp);
                    win=1;
                    for (int i = 0; i < Tablero.length; i++) {
                        for (int j = 0; j < Tablero[i].length; j++) {
                            if (Tablero[i][j].equals("{o}")) {
                                win=0;
                            }
 

                        }

                    }

                }while(resp==2||resp==3||resp==4||resp==5);



                cont++;
            }else{
                do{
                    resp=2;
                    do{
                    fuera=1;
                    Imprimir(Tablero);
                    System.out.println("");
                    System.out.println("Es el turno de " + Jugador2+"!");
                    System.out.println("Escoja la Fila:");
                    x = sc.nextInt();
                    System.out.println("Columna:");
                    y = sc.nextInt();
                    System.out.println("Escoja la nueva posicion de fila:");
                    x1 = sc.nextInt();
                    System.out.println("columna:");
                    y1 = sc.nextInt();
                    
                    if(x<20&&y<20&&x1<20&&y1<20&&x>0&&y>0&&x1>0&&y1>0){
                        fuera=2;
                    }
                    }while(fuera==1);
                    
                    
                        if (" o ".equals(Tablero[x][y])||" 0 ".equals(Tablero[x][y])   ) {
                            resp=1;
                            if(x==x1||y==y1){
                                if (x==x1) {
                                    if(y<y1){
                                        for (int i = y+1; i <= y1; i++) {
                                            if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • "||Tablero[x][i] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                            }

                                        }
                                    }else{
                                        for (int i = y-1; i >= y1; i--) {
                                            if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • "||Tablero[x][i] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                            }

                                        }
                                    }

                                }
                                if (y==y1) {
                                    if(x<x1){
                                        for (int i = x+1; i <= x1; i++) {
                                            if (Tablero[i][y] == " o "||Tablero[i][y] == "{o}"||Tablero[i][y] == " • "||Tablero[i][y] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                            }
                                        }
                                    }else{
                                        for (int i = x-1; i >= x1; i--) {
                                            if (Tablero[i][y] == " o "||Tablero[i][y] == "{o}"||Tablero[i][y] == " • "||Tablero[i][y] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                            }

                                        }
                                    }                                                    
                                }
                                if (Tablero[x1][y1]==(" X ")) {
                                        resp=4;
                                }
                            }else{
                              resp=5;
                            }   
                        
                        
                    
                        if ( resp<2 ) {
                                Tablero=d.Movimiento(x, y, x1, y1, Tablero);   
                            }
                        
                        }
                        
                        if (" o ".equals(Tablero[x][y])||" 0 ".equals(Tablero[x][y])) {
                        Validar(resp);
                        }
                        
                    
                        
                        if ("{o}".equals(Tablero[x][y])  ) {
                            resp=1;
                            if(x==x1||y==y1){
                                if (x==x1) {
                                    if(y<y1){
                                        for (int i = y+1; i <= y1; i++) {
                                            if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • "||Tablero[x][i] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                                System.out.println("hola1");
                                            }

                                        }
                                    }else{
                                        for (int i = y-1; i >= y1; i--) {
                                            if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • "||Tablero[x][i] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                                System.out.println("hola2");
                                            }

                                        }
                                    }

                                }
                                if (y==y1) {
                                   if(x<x1){
                                        for (int i = x+1; i <= x1; i++) {
                                            if (Tablero[i][y] == " o "||Tablero[i][y] == "{o}"||Tablero[i][y] == " • "||Tablero[i][y] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                            }
                                        }
                                    }else{
                                        for (int i = x-1; i >= x1; i--) {
                                            if (Tablero[i][y] == " o "||Tablero[i][y] == "{o}"||Tablero[i][y] == " • "||Tablero[i][y] == " 0 ") {
                                                System.out.println("");
                                                resp=3;
                                            }

                                        }
                                    }                  
                                }
                                if (Tablero[x1][y1]==(" x ")) {
                                resp=4;
                            }
                            }else{
                            resp=5;
                            }
                        
                        
                    
                        if ( resp<2 ) {
                                if (Tablero[x1][y1].equals(" X ")) {
                                win=2;
                            }
                                Tablero=r.Movimiento(x, y, x1, y1, Tablero); 
                            }
                    
                        }
                        
                        if (resp==2||"{o}".equals(Tablero[x][y])) {
                        Validar(resp);
                    }
                     
                }while(resp==2||resp==3||resp==4||resp==5);
                cont++;
                
            }
        }while(win==0);
        Imprimir(Tablero);
        if (win==1) {
            JOptionPane.showMessageDialog(null, "Felicidades " + Jugador1+" GANASTE!"); 
        }
        if (win==2) {
            JOptionPane.showMessageDialog(null, "Felicidades " + Jugador2+" GANASTE!");
        }
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Desea volver a jugar? 0=si, 1=no"));
        }while(opcion==0);
    }
    
    
    public static String[][] Lectura() {
        String[][] Temporal = new String[21][21];
        //duques
        Temporal[9][5] = " o ";
        Temporal[11][5] = " o ";
        Temporal[10][7] = " o ";
        Temporal[9][8] = " o ";
        Temporal[11][8] = " o ";
        Temporal[5][9] = " o ";
        Temporal[8][9] = " o ";
        Temporal[10][9] = " 0 ";
        Temporal[12][9] = " o ";
        Temporal[15][9] = " o ";
        Temporal[12][11] = " o ";
        Temporal[10][11] = " 0 ";
        Temporal[8][11] = " o ";
        Temporal[5][11] = " o ";
        Temporal[15][11] = " o ";
        Temporal[11][12] = " o ";
        Temporal[9][12] = " o ";
        Temporal[10][13] = " o ";
        Temporal[9][15] = " o ";
        Temporal[11][15] = " o ";
        Temporal[7][10] = " o ";
        Temporal[9][10] = " 0 ";
        Temporal[11][10] = " 0 ";
        Temporal[13][10] = " o ";
        //rey
        Temporal[10][10] = "{o}";
        

        //rebeldes
        Temporal[3][1] = " • ";
        Temporal[6][1] = " • ";
        Temporal[14][1] = " • ";
        Temporal[17][1] = " • ";
        Temporal[1][3] = " • ";
        Temporal[6][3] = " • ";
        Temporal[14][3] = " • ";
        Temporal[19][3] = " • ";
        Temporal[8][4] = " • ";
        Temporal[10][4] = " • ";
        Temporal[12][4] = " • ";
        Temporal[7][5] = " • ";
        Temporal[13][5] = " • ";
        Temporal[1][6] = " • ";
        Temporal[3][6] = " • ";
        Temporal[6][6] = " • ";
        Temporal[19][6] = " • ";
        Temporal[17][6] = " • ";
        Temporal[14][6] = " • ";
        Temporal[5][7] = " • ";
        Temporal[15][7] = " • ";
        Temporal[4][8] = " • ";
        Temporal[16][8] = " • ";
        Temporal[4][10] = " • ";
        Temporal[16][10] = " • ";
        Temporal[3][19] = " • ";
        Temporal[6][19] = " • ";
        Temporal[14][19] = " • ";
        Temporal[17][19] = " • ";
        Temporal[1][17] = " • ";
        Temporal[6][17] = " • ";
        Temporal[14][17] = " • ";
        Temporal[19][17] = " • ";
        Temporal[8][16] = " • ";
        Temporal[10][16] = " • ";
        Temporal[12][16] = " • ";
        Temporal[7][15] = " • ";
        Temporal[13][15] = " • ";
        Temporal[1][14] = " • ";
        Temporal[3][14] = " • ";
        Temporal[6][14] = " • ";
        Temporal[19][14] = " • ";
        Temporal[17][14] = " • ";
        Temporal[14][14] = " • ";
        Temporal[5][13] = " • ";
        Temporal[15][13] = " • ";
        Temporal[4][12] = " • ";
        Temporal[16][12] = " • ";
        
        
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
        
        //LLenar los null con recursivo
        Temporal=LlenarE(Temporal, 0, 0);

        return Temporal;

    }
    
    static String[][] LlenarE(String matriz[][], int filas, int cols){
        if (filas==matriz.length-1&&cols==matriz[0].length-1){
            if (matriz[filas][cols] == null) {
                    matriz[filas][cols] = "   ";
                }
            return matriz;
        }else{
            if (cols==matriz[0].length-1) {
                if (matriz[filas][cols] == null) {
                    matriz[filas][cols] = "   ";
                }
                LlenarE(matriz,filas+1,0);
            } else {
                if (matriz[filas][cols] == null) {
                    matriz[filas][cols] = "   ";
                }
                
                LlenarE(matriz,filas,cols+1);
            }
        }
        return matriz;
    }
    
        public static void Imprimir(String[][] matriz) {
            if (matriz[10][10].equals("   ")) {
                matriz[10][10]=" x ";
            }
        for (int i = 0; i < matriz.length-1; i++) {
            System.out.print(" |");
            for (int j = 0; j < matriz[i].length-1; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("|");
            }
            System.out.println("");
        }
    }
        public static void Validar(int resp){
            switch(resp){
                case 2:
                    JOptionPane.showMessageDialog(null, "Selecciono una coordenada incorrecta");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "No se puede saltar otras piezas!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "No se puede colocar esa pieza en la X");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Solo se puede mover en cruz, vuelva a intentar");
                    break;
                default:
                    break;
            }
        }
}
