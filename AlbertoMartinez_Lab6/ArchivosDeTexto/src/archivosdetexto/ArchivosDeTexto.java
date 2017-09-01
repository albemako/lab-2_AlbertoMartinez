/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosdetexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ArchivosDeTexto {

    
    public static void main(String[] args) throws IOException {
        //leer archivo de texto
        //primera forma
        File f=null;
        FileReader fr=null;
        BufferedReader br=null;
        //que es una ruta? la ubicacion fisica de un archivo dentro del sistema de archivos del sistema operativo
        /*try {
            f=new File("c:/progra/prueba.txt");
            fr=new FileReader(f);
            br=new BufferedReader(fr);
            
            String linea;
                while ((linea=br.readLine())!=null) {                
                System.out.println(linea);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        br.close();
        fr.close();
     */  
     
     //segunda forma
     /*
     Scanner sc=null;
        try {
            f=new File("c:/progra/prueba.txt");
            sc=new Scanner(f);
            while (sc.hasNext()) {                
                System.out.println(sc.nextLine());
            }
            
        } catch (Exception e) {
        }
        sc.close();
        */
     
     //Escribir un archivo
     /*
    FileWriter fw=null;
    BufferedWriter bw=null;
    
    try{
        f=new File("./salida.txt");
        fw=new FileWriter(f,true);
        bw=new BufferedWriter (fw);
        String d=JOptionPane.showInputDialog("Ingrese texto");
        bw.write(d);
        bw.newLine();
        bw.flush();
        
        
    }catch (Exception e){
        e.printStackTrace();
    }
    bw.close();
    fw.close();
    */
    Scanner sc=null;
        try {
            f=new File("c:/progra/prueba.txt");
            sc=new Scanner(f);
            sc.useDelimiter(",");
            while (sc.hasNext()) {                
                System.out.println(sc.next());
                sc.next();
            }
            
        } catch (Exception e) {
        }
        sc.close();
     
     
    }
    
    
     
     
}
