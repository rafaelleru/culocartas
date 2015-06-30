/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culocartas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import culocartas.Carta;
import culocartas.Player;
import culocartas.Palos;


/**
 *
 * @author rafa
 */
public class Barajador {
    private ArrayList<Carta> baraja = new ArrayList();
    private Barajador instance = new Barajador();
    private ArrayList<Player> jugadores = new ArrayList();
    
    public Barajador getInstance(){
        return instance;
    }
    
    private Barajador(){
        iniciarCartas();
        barajar();
    }
    
    private void iniciarCartas(){
        Carta aux;
        
        for(int i=0; i<13; i++){
            aux = new Carta(i, Palos.CORAZONES);
            baraja.add(aux);
        }
        
        for(int i=0; i<13; i++){
            aux = new Carta(i, Palos.ROMBOS);
            baraja.add(aux);
        }
        
        for(int i=0; i<13; i++){
            aux = new Carta(i, Palos.PICAS);
            baraja.add(aux);
        }
        
        for(int i=0; i<13; i++){
            aux = new Carta(i, Palos.TREBOLES);
            baraja.add(aux);
        }
    }
    
    private void barajar(){
        long seed = System.nanoTime();
        Collections.shuffle(baraja, new Random(seed));
    }
    
    public void repartir(int numero_jugadores){
        while(!baraja.isEmpty()){
            for(int j=0; j<52; j++){
                for(int i=0; i<numero_jugadores; i++){
                    jugadores.get(i).recibirCarta(baraja.get(j));
                    baraja.remove(j);
                }
            }
        }
    }
}
