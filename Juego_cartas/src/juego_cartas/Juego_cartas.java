/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_cartas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto
 */
public class Juego_cartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b = new Baraja();
        ArrayList <Jugador> lista=new ArrayList();
        ArrayList <Jugador> lista2=new ArrayList();
        String op="";
        while ( !op.equals("s") ) {  
            op=JOptionPane.showInputDialog(""
                    + "a-agregar jugador\n"
                    + "b-barajar\n"
                    + "c-repartir\n"
                    + "d-imprimir ganadores\n"
                    + "e-Listado de los ultimos 5 ganadores\n"
                    + "s-salir");
            if(op==null){
                op="s";
            }
            if (op.equals("a")) {
                if(lista.size()<10){
                String nombre;
                nombre=JOptionPane.showInputDialog("nombre");
                lista.add(new Jugador(nombre));
                }else{
                    JOptionPane.showMessageDialog(null, "No se pueden ingresar mas de 10 jugadores!");
                }
            }
            if (op.equals("b")) {
                b.Barajar();              
            }
            if (op.equals("c")) {
            for(int i = 0; i < lista.size(); i++){
                lista.get(i).setCartas(new ArrayList());
            for(int j = 0; j < 5; j++){
                lista.get(i).recibirCarta(b.repartirCarta());
            }
            
            }
            for(int j = 0; j < lista.size(); j++){
                lista.get(j).recibirCarta(b.repartirCarta());
            }
            for(int i = 0; i < lista.size(); i++){
            System.out.printf(   "\n__________________\n"
                                            + "Jugador: %s\nCartas: \n%s"
                                            + "Valor de la mano: %s",
                                            lista.get(i).getNombre(),
                                            lista.get(i).getCartas(),
                                            lista.get(i).calcularValor()
                                        );
            }
            }
            if (op.equals("d")) {
            Jugador jugadores[] = new Jugador[lista.size()];
            for(int j = 0; j < lista.size(); j++){
                jugadores[j]=lista.get(j);
            }
            int ganadores[] = ganador(jugadores); 
            
            if(ganadores.length == 1){//Si el ganador es solo uno...
            int g = ganadores[0];
            System.out.printf("\n\nEl Ganador es: %s, su mano tiene un valor de %d!\n",
                jugadores[g].getNombre(),jugadores[g].calcularValor());
            lista2.add(0,jugadores[g]);
            }else{
                //Si hay empate
                int x = 0;
                System.out.printf("\n\nHay un empate:\nLos jugadores empatados son: \n");
                for(int i = 0; i < ganadores.length; i++){
                    x = ganadores[i];
                    System.out.printf("%s, su mano tiene un valor de %d!\n",
                                                 jugadores[x].getNombre(),
                                                 jugadores[x].calcularValor()
                                               );
                    lista2.add(0,jugadores[x]);
                }
            }
        }
            if (op.equals("e")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(lista.get(i));
                }
         
            }
        }
    }
    static int[] ganador(Jugador j[]){
        int maxVal = j[0].calcularValor();
        int c=0;//Contador de jugadores con el valor maximo de mano
        //Ciclo para determinar el valor maximo de las manos
        for(int i = 1; i < j.length; i++){
            if(j[i].calcularValor()> maxVal){
                maxVal = j[i].calcularValor();
            }
        }
        //Ciclo para determinar si el valor maximo se repite
        for(int i = 0; i <j.length;  i++){
            if(maxVal == j[i].calcularValor()){
                c++;
            }
        }
        //se crea el arreglo de ganadores en cato de empate
        int index[] = new int[c];
        c = 0;
        //Se llena la tabla de indices "i" de ganadores
        for(int i = 0; i <j.length;  i++){
            if(maxVal == j[i].calcularValor()){
                index[c] = i;
                c++;
            }
        }
        return index;
    }
    }
