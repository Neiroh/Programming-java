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
public class Viento extends Instrumento{
    
    String mat;
    
    public Viento(){
        
    }
    
    public Viento(String def, String desc, String mat, String ejec){
        super(def, desc, ejec);
        this.ejec = ejec;
    }
    
    @Override
    public void limpiar(){
        System.out.println("Limpiando Instrumento de Viento...");
    }
    
    @Override
    public void afinar(){
        System.out.println("Afinando Instrumento de Viento...");
    }
    
    @Override
    public void testear(){
        System.out.println("Testeando Instrumento de Viento...");
    }
    
    public boolean equals(Viento other){
        return super.equals(other) && mat.equals(other.mat);
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "Viento{" + "mat=" + mat + '}';
    }
}
