/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

import Interfaces.IOrdena;
import java.lang.Math;

/**
 *
 * @author Neiroh
 */
public abstract class Objeto implements IOrdena{

    protected double volumen;
    protected double radio;
    protected final double pi = Math.PI;
    
    public Objeto(){
        
    }
    
    public Objeto(double radio){
        this.radio = radio;
    }
       
    public boolean equals(Objeto other){
        return volumen == other.volumen && radio == other.radio;
    }

    @Override
    public String toString() {
        return "Objeto{" + "volumen=" + volumen + ", radio=" + radio + '}';
    }
    
    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
}
