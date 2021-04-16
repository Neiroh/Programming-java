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
public class JuegoFifa extends Juego{

    protected String equipo;
    
    public JuegoFifa(){
        
    }
    
    public JuegoFifa(String nombre, String genero, String equipo){
        super(nombre, genero);
        this.equipo = equipo;
    }
    
    public boolean equals(JuegoFifa other){
        return super.equals(other) && equipo.equals(other.equipo);
    }
    
    @Override
    public String toString(){
        return "FIFA{\n"
                + super.toString() + "\n"
                + "Equipo: " + equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
}
