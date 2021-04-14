/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Equipo;

import Juego.Juego;
import Participante.Participante;
import java.util.Arrays;

/**
 *
 * @author Neiroh
 */
public class Equipo {

    protected int id;
    protected String nombre;
    protected String color;
    protected Juego[] juegos;
    protected Participante[] participantes;
    protected Participante capitan;
    
    public Equipo(){
        
    }
    
    public Equipo(int id, String nombre, String color, Juego[] juegos, Participante[] participantes, Participante capitan){
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.juegos = juegos;
        this.participantes = participantes;
        this.capitan = capitan;
    }
    
    public boolean equals(Equipo other){
        return id == other.id;
    }
    
    @Override
    public String toString(){
        return "Equipo{\n"
                + "ID: " + id + "\n"
                + "Nombre: " + nombre + "\n"
                + "Color: " + color + "\n"
                + "Juegos: " + Arrays.toString(juegos) + "\n"
                + "Participantes: " + Arrays.toString(participantes) + "\n"
                + "Capitan: " + capitan;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Juego[] getJuegos() {
        return juegos;
    }

    public void setJuegos(Juego[] juegos) {
        this.juegos = juegos;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participante[] participantes) {
        this.participantes = participantes;
    }

    public Participante getCapitan() {
        return capitan;
    }

    public void setCapitan(Participante capitan) {
        this.capitan = capitan;
    }
    
    
}
