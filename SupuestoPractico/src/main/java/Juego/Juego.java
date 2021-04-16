/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Juego;

/**
 *
 * @author Neiroh
 */
public class Juego {

    protected String nombre;
    protected String genero;
    
    public Juego(){
        
    }
    
    public Juego(String nombre, String genero){
        this.nombre = nombre;
        this.genero = genero;
    }
    
    public boolean equals(Juego other){
        return genero.equals(other.genero) && nombre.equals(other.genero);
    }
    
    @Override
    public String toString(){
        return "Juego{\n"
                + "Nombre: " + nombre + "\n"
                + "Género: " + genero + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
