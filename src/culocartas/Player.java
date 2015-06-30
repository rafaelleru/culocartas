/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culocartas;

import java.util.ArrayList;


import culocartas.Carta;


/**
 *
 * @author rafa
 */
public class Player {
    private String nombre;
    private int position;
    private ArrayList<Carta> mano = new ArrayList();
    
    public Player(String n, int p){
        nombre = n;
        position = p;
    }
    
    public String getNonbre(){
        return nombre;
    }
    
    public int getPosition(){
        return position;
    }
    
    public Carta getCarta(int i){
        return mano.get(i);
    }
    
    public void recibirCarta(Carta c){
        mano.add(c);
    }
/*
    
    Hay que pasar la lista con las posiciones de las cartas que se quieren jugar
*/    
    public ArrayList<Carta> jugarCartas(int[] posiciones){
        ArrayList<Carta> jugadas = new ArrayList<Carta>();
        
        for(int i=0; i<posiciones.length; i++){
            jugadas.add(mano.get(posiciones[i]));
        }
        
        return jugadas;
    }

}
