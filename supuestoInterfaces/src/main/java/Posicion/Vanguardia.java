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
public class Vanguardia extends Personaje implements Movimiento.Ataque, Movimiento.Orden{

    int daño;
    
    public Vanguardia(){
        
    }
    
    public Vanguardia(String nombre, int casillas, int daño){
        super(nombre, casillas);
        this.daño = daño;
    }
    
    @Override
    public void atacar(){
        System.out.println("Realiza un ataque");
    }
    
    @Override
    public void ordenar(){
        System.out.println("Da una orden");
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
