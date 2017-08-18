/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_albertomartinez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Examen1_AlbertoMartinez {
static Scanner sc=new Scanner(System.in);
static Random R=new Random();

    public static void main(String[] args) {
        ArrayList <Object> lista=new ArrayList();
        String resp="";
        Conjuntos c=new Conjuntos();
        
        while(!resp.equals("f")){
            System.out.println("Menu");
            System.out.println("a. Agregar promedio al ArrayList");
            System.out.println("b. Agregar un numero complejo");
            System.out.println("e. Listar el ArrayList");
            System.out.println("c. Unir dos conjuntos del arraylist y guardar dicho conjunto en el mismo arrayList");
            System.out.println("f. Salir");
            System.out.println("Escriba la opcion a la que desea ingresar: ");
            resp=sc.next();
            
            if(resp.equals("a")){
                System.out.println("Escriba el tamaño de su arreglo: ");
                int tam=sc.nextInt();
                int[]arreglo=new int[tam];
                arreglo=llenarA(arreglo);
                imprimir(arreglo);
                System.out.println("");
                System.out.println("el promedio de los pares es: "+PromedioPares(arreglo, -1, 0));
                
                lista.add(PromedioPares(arreglo, -1, 0));
            }
            
            if(resp.equals("b")){
                ArrayList <NumerosComplejos> temp=new ArrayList();
                System.out.println("Cuantos numeros complejos va a ingresar?");
                int cant=sc.nextInt();
                for (int i = 0; i < cant; i++) {
                   int ent=0, entero=0;
                String signo="",cons="";
                System.out.println("Ingresara un numero complejo");
                System.out.println("Ingrese el primero entero= ");
                ent=sc.nextInt();
                
                System.out.println("Ingrese el signo");
                signo=sc.next();
                System.out.println("Ahora ingresara el numero imaginario: ");
                System.out.println("Ingrese el entero=");
                entero=sc.nextInt();
                cons="i";
                
                temp.add(new NumerosComplejos(ent, signo, entero, cons));

                c.setComplejos(temp); 
                }
                
                lista.add(temp);
                
                
            }
            
            if(resp.equals("c")){
                ArrayList temp=new ArrayList();
                char seguir;
                do{
                    int pos;
                    System.out.println("que posicion?");
                    pos=sc.nextInt();
                    temp.add(lista.get(0));
                    System.out.println("Desea unir otro complejo?");
                    seguir=sc.next().charAt(0);
                }while (seguir=='s');
                lista.add(temp);
                
            }
            
            if(resp.equals("d")){
                
            }
            
            if(resp.equals("e")){
                System.out.print("| ");
                for (Object f : lista) {
                    System.out.print(f);
                    System.out.print(" | ");
                }
                System.out.println("");
            }
            
        }
                  
        
    }
    
    public static double PromedioPares(int[]arreglo, int cont, int prom){
        double num=0;
        if (cont==arreglo.length-1) {
            return num;
        }else{
            cont++;
            if(arreglo[cont]%2==0){      
                prom++;
                num=PromedioPares(arreglo, cont, prom)+arreglo[cont];
            }else{
                num=PromedioPares(arreglo, cont, prom)+0;
            }  
        }
        if(num>0){
           num=num/prom; 
        }
        return num;
    }
    
    public static int[] llenarA(int[]arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=R.nextInt(10);
        }
        
        return arreglo;
    }
    
    public static void imprimir(int[]arreglo){
        System.out.print("|");
        for (int i = 0; i < arreglo.length; i++) { 
                System.out.print(arreglo[i]+"|");
        }
    }
}
