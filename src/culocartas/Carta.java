/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culocartas;
import culocartas.Palos;
/**
 *
 * @author rafa
 */
public class Carta {
    private int valor;
    private Palos palo;
    
    public Carta(int v, Palos p){
        valor = v;
        palo = p;
    }
    
    public int getValor(){
        return valor;
    }
    
    public Palos getPalo(){
        return palo;
    }
}
