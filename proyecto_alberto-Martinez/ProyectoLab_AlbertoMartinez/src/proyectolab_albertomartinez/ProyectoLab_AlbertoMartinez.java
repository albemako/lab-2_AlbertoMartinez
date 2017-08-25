/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_albertomartinez;

import java.util.Scanner;


public class ProyectoLab_AlbertoMartinez {
    static Scanner sc=new Scanner(System.in);
    static String[][] Tablero = Lectura();
    static Rebeldes b = new Rebeldes();
    static Duques d=new Duques();
    static Rey r=new Rey();
    
    public static void main(String[] args) {
        
        int cont=2, turnos;
        String Jugador1, Jugador2;
        Imprimir(Tablero);
        System.out.println("Escoja su nombre jugador 1");
        Jugador1 = sc.next();
        System.out.println("Escoja su nombre jugador 2");
        Jugador2 = sc.next();
        
        System.out.println("Cuantos turnos?");
        turnos=sc.nextInt();
        //variable de control para ganar
        int win=0;
        do{
        
        int resp;
            if (cont%2==0) {
                do{
                    resp=2;
                    Imprimir(Tablero);
                    System.out.println("");
                    System.out.println("Es el turno de " + Jugador1+"!");
                    System.out.println("Escoja la posicion x:");
                    int x = sc.nextInt();
                    System.out.println("y:");
                    int y = sc.nextInt();
                    System.out.println("Escoja la posicion a mover x:");
                    int x1 = sc.nextInt();
                    System.out.println("y:");
                    int y1 = sc.nextInt();
                    if (" • ".equals(Tablero[x][y])  ) {
                        if (x==x1) {
                            if(y<y1){
                                for (int i = y+1; i <= y1; i++) {
                                    if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                        System.out.println("hola");
                                    }

                                }
                            }if(y1<y){
                                for (int i = y-1; i >= y1; i--) {
                                    if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                        
                                    }

                                }
                            }

                        }
                        if (y==y1) {
                            
                            if(x<x1){
                                for (int i = x+1; i <= x1; i++) {
                                    if (Tablero[y][i] == " o "||Tablero[y][i] == "{o}"||Tablero[y][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }
                                }
                            }else{
                                for (int i = x-1; i >= x1; i--) {
                                    if (Tablero[y][i] == " o "||Tablero[y][i] == "{o}"||Tablero[y][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                             }
                           
                        }
                        
                        if (resp!=3) {
                            Tablero=b.Movimiento(x, y, x1, y1, Tablero);
                            resp=1;
                            
                        }
                    }
                    win=1;
                    for (int i = 0; i < Tablero.length; i++) {
                        for (int j = 0; j < Tablero[i].length; j++) {
                            if (Tablero[i][j].equals("{o}")) {
                                win=0;
                            }
 

                        }

                    }

                }while(resp==2||resp==3);



                cont++;
            }else{
                do{
                    resp=2;
                    int x2,x3,y2,y3;
                    Imprimir(Tablero);
                    System.out.println("");
                    System.out.println("Es el turno de " + Jugador2+"!");
                    System.out.println("Escoja la posicion x:");
                    int x = sc.nextInt();
                    System.out.println("y:");
                    int y = sc.nextInt();
                    System.out.println("Escoja la posicion a mover x:");
                    int x1 = sc.nextInt();
                    System.out.println("y:");
                    int y1 = sc.nextInt();
                    
                    if(y<y1){
                       y2=y;
                       y3=y1;
                    }else{
                       y2=y1;
                       y3=y;
                    }
                    if(x<x1){
                       x2=x;
                       x3=x1;
                    }else{
                       x2=x1;
                       x3=x;
                    }
                    
                    if (" o ".equals(Tablero[x][y])  ) {
                        if (x==x1) {
                            if(y<y1){
                                for (int i = y+1; i <= y1; i++) {
                                    if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                            }else{
                                for (int i = y-1; i >= y1; i--) {
                                    if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                            }

                        }
                        if (y==y1) {
                            if(x<x1){
                                for (int i = x+1; i <= x1; i++) {
                                    if (Tablero[y][i] == " o "||Tablero[y][i] == "{o}"||Tablero[y][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }
                                }
                            }else{
                                for (int i = x-1; i >= x1; i--) {
                                    if (Tablero[y][i] == " o "||Tablero[y][i] == "{o}"||Tablero[y][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                            }                                                    
                        }
                        if ( resp!=3 ) {
                                Tablero=d.Movimiento(x, y, x1, y1, Tablero);
                                resp=1; 
                            }
                            
                    }
                    
                    if ("{o}".equals(Tablero[x][y])  ) {
                        if (x==x1) {
                            if(y<y1){
                                for (int i = y+1; i <= y1; i++) {
                                    if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                            }else{
                                for (int i = y-1; i >= y1; i--) {
                                    if (Tablero[x][i] == " o "||Tablero[x][i] == "{o}"||Tablero[x][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                            }

                        }
                        if (y==y1) {
                            if(x<x1){
                                for (int i = x+1; i <= x1; i++) {
                                    if (Tablero[y][i] == " o "||Tablero[y][i] == "{o}"||Tablero[y][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }
                                }
                            }else{
                                for (int i = x-1; i >= x1; i--) {
                                    if (Tablero[y][i] == " o "||Tablero[y][i] == "{o}"||Tablero[y][i] == " • ") {
                                        System.out.println("");
                                        resp=3;
                                    }

                                }
                             }                          
                        }
                        if ( resp!=3 ) {
                                if (Tablero[x1][y1].equals(" X ")) {
                                win=2;
                            }
                                Tablero=r.Movimiento(x, y, x1, y1, Tablero);
                                resp=1; 
                            }
                    }
                    
                }while(resp==2||resp==3);
                cont++;
            }
        }while(win==0);
        Imprimir(Tablero);
        if (win==1) {
            System.out.println("Felicidades " + Jugador1+" GANASTE!");
        }
        if (win==2) {
            System.out.println("Felicidades " + Jugador2+" GANASTE!");
        }
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
                matriz[10][10]=" x ";
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
