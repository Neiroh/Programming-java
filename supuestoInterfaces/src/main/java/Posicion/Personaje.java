/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Posicion;

import java.util.Objects;

/**
 *
 * @author Neiroh
 */
public class Personaje {

    String nombre;
    int casillas;
    
    public Personaje(){
        
    }
    
    public Personaje(String nombre, int casillas){
        this.nombre = nombre;
        this.casillas = casillas;
    }

    public boolean equals(Personaje other){
        return nombre.equals(other.nombre) && casillas == other.casillas;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", casillas=" + casillas + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCasillas() {
        return casillas;
    }

    public void setCasillas(int casillas) {
        this.casillas = casillas;
    }
    
    
}
