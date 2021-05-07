/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Instrumento;

/**
 *
 * @author Raul
 */
public class Cuerda extends Instrumento{
    
    int numCuerdas;
    
    public Cuerda(){
        
    }
    
    public Cuerda(String def, String desc, String ejec, int numCuerdas){
        super(def, desc, ejec);
        this.numCuerdas = numCuerdas;
    }
    
     @Override
     public void limpiar(){
        System.out.println("Limpiando Instrumento de Cuerda...");
    }
    
    @Override
    public void afinar(){
        System.out.println("Afinando Instrumento de Cuerda...");
    }
    
    @Override
    public void testear(){
        System.out.println("Testeando Instrumento de Cuerda...");
    }
    
    public boolean equals(Cuerda other){
        return super.equals(other) && numCuerdas==other.numCuerdas;
    }

    public int getNumCuerdas() {
        return numCuerdas;
    }

    public void setNumCuerdas(int numCuerdas) {
        this.numCuerdas = numCuerdas;
    }

    @Override
    public String toString() {
        return "Cuerda{" + "numCuerdas=" + numCuerdas + '}';
    }
}
