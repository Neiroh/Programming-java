/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vehiculo.Maquinaria;

/**
 *
 * @author Neiroh
 */
public class RetroExcavadora extends Vehiculo.Vehiculo{

    String modelo;
    
    public RetroExcavadora(){
        
    }
    
    public RetroExcavadora(String modelo){
        this.modelo = modelo;
    }

    @Override
    public void trabaja() {
        System.out.println("Consiguiendo arena...");
    }

    @Override
    public String toString() {
        return "RetroExcavadora{" + "modelo=" + modelo + '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
