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
public class JuegoWow extends Juego{

    protected String clase;
    protected String rol;
    
    public JuegoWow(){
        
    }
    
    public JuegoWow(String nombre, String genero, String clase, String rol){
        super(nombre, genero);
        this.clase = clase;
        this.rol = rol;
    }
    
    public boolean equals(JuegoWow other){
        return super.equals(other) && clase.equals(other.clase) && rol.equals(other.rol);
    }
    
    @Override
    public String toString(){
        return "WOW{\n"
                + super.toString() + "\n"
                + "Rol: " + rol + "\n"
                + "Clase: " + clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
