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
public class Comandancia extends Personaje implements Movimiento.Orden{

    String orden;
    
    public Comandancia(){
        
    }
    
    public Comandancia(String nombre, int casillas, String orden){
        super(nombre, casillas);
        this.orden = orden;
    }
    
    @Override
    public void ordenar(){
        System.out.println("Da una orden");
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "Comandancia{" + "orden=" + orden + '}';
    }
    
    public boolean equals(Comandancia other){
        return super.equals(other) && orden == other.orden;
    }
}
