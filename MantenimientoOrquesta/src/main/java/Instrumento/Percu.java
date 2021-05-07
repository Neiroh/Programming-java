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
public class Percu extends Instrumento{
    
    String piel;
    
    public Percu(){
        
    }
    
    public Percu(String def, String desc, String ejec, String piel){
        super(def, desc, ejec);
        this.piel = piel;
    }
    
     @Override
     public void limpiar(){
        System.out.println("Limpiando Instrumento de Percusión...");
    }
    
    @Override
    public void afinar(){
        System.out.println("Afinando Instrumento de Percusión...");
    }
    
    @Override
    public void testear(){
        System.out.println("Testeando Instrumento de Percusión...");
    }
    
    public boolean equals(Percu other){
        return super.equals(other) && piel.equals(other.piel);
    }

    public String getPiel() {
        return piel;
    }

    public void setPiel(String piel) {
        this.piel = piel;
    }

    @Override
    public String toString() {
        return "Percu{" + "piel=" + piel + '}';
    }
}
