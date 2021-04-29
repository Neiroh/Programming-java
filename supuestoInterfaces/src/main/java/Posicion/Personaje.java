/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Posicion;

import Movimiento.Ataque;
import Movimiento.Defensa;
import Movimiento.Orden;
import java.util.Objects;

/**
 *
 * @author Neiroh
 */
public class Personaje implements Ataque, Defensa, Orden{

    String nombre;
    int casillas;
    
    public Personaje(){
        
    }
    
    public Personaje(String nombre, int casillas){
        this.nombre = nombre;
        this.casillas = casillas;
    }
    
    @Override
    public void atacar(){
        System.out.println("Realiza un ataque");
    }
    
    @Override
    public void ordenar(){
        System.out.println("Da una orden");
    }
    
    @Override
    public void defender(){
        System.out.println("Se defiende");
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
