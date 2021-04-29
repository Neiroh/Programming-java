/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Posicion.Comandancia;
import Posicion.Personaje;
import Posicion.Retaguardia;
import Posicion.Vanguardia;

/**
 *
 * @author arce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personaje van1 = new Vanguardia();
        Personaje ret1 = new Retaguardia();
        Personaje com1 = new Comandancia();
        
        Personaje[] pjs = new Personaje[3];
        pjs[0] = van1;
        pjs[1] = ret1;
        pjs[2] = com1;
        
        for (int i = 0; i < pjs.length; i++) {
            
             if(pjs[i] instanceof Comandancia){
                 
                 pjs[i].ordenar();
                 
             }else if(pjs[i] instanceof Retaguardia){
                 
                 pjs[i].defender();
                 
             }else if(pjs[i] instanceof Vanguardia){
                 
                 pjs[i].ordenar();
                 pjs[i].atacar();
                 
             }
            
        }
        
    }
    
}
