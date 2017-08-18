/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.examen.pkg1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PracticaExamen1 {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    try {
        System.out.println("Ingrese un numero");
        int num=sc.nextInt();
        validar(num);
    } catch (MiException ex) {
        System.out.println(ex.getMessage());
    }
        System.out.println("despues de chupar verg ingrese 2 numeros");
        System.out.println("num1:");
        int num2=sc.nextInt();
        System.out.println("num2:");
        int num3=sc.nextInt();
        System.out.println("la suma es: "+suma(num2, num3));
    }
    public static void validar(int num)throws MiException{
        if (num<0) {
            throw new MiException("chupe verg");
        }
    }
    public static int suma(int num2, int num3){
        
        if(num3==1){
            return num2+;
        }else{
            num2+=1;
            return suma(num2,num3-1);
        }
        
    }
    
}
