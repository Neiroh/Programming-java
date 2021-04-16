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
public class JuegoLol extends Juego{

    protected String rol;
    
    public JuegoLol(){
        
    }
    
    public JuegoLol(String nombre, String genero, String rol){
        super(nombre, genero);
        this.rol = rol;
    }
    
    public boolean equals(JuegoLol other){
        return super.equals(other) && rol.equals(other.rol);
    }
    
    @Override
    public String toString(){
        return "LOL{\n"
                + super.toString() + "\n"
                + "Rol: " + rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
