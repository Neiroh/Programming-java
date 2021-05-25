/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Animal;

/**
 *
 * @author Neiroh
 */
public class Animal {

    private int id;
    private String nombre;
    private String especie;
    private String raza;
    
    public Animal(){
        
    }
    
    public Animal(int id, String nombre, String especie, String raza){
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
    }
    
    public Animal(String nombre, String especie, String raza){
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", raza=" + raza + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
