/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Posicion;

/**
 *
 * @author Neiroh
 */
public class Vanguardia extends Personaje{

    int daño;
    
    public Vanguardia(){
        
    }
    
    public Vanguardia(String nombre, int casillas, int daño){
        super(nombre, casillas);
        this.daño = daño;
    }  

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public boolean equals(Vanguardia other){
        return super.equals(other) && daño == other.daño;
    }

    @Override
    public String toString() {
        return "Vanguardia{" + "da\u00f1o=" + daño + '}';
    }
    
    
    
}
