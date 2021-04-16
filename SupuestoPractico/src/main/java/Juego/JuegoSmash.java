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
public class JuegoSmash extends Juego{

    protected String personaje;
    
    public JuegoSmash(){
        
    }
    
    public JuegoSmash(String nombre, String genero, String personaje){
        super(nombre, genero);
        this.personaje = personaje;
    }
    
    public boolean equals(JuegoSmash other){
        return super.equals(other) && personaje.equals(other.personaje);
    }
    
    @Override
    public String toString(){
        return "Smash\n"
                + super.toString() + "\n"
                + "Personaje: " + personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}
