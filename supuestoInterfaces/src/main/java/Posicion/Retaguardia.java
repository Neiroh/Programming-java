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
public class Retaguardia extends Personaje{

    int defensa;
    
    public Retaguardia(){
        
    }
    
    public Retaguardia(String nombre, int casillas, int defensa){
        super(nombre, casillas);
        this.defensa = defensa;
    }
    
    public boolean equals(Retaguardia other){
        return super.equals(other) && defensa == other.defensa;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return "Retaguardia{" + "defensa=" + defensa + '}';
    }
    
    
}
