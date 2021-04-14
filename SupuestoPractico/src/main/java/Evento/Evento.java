/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Evento;

import Equipo.Equipo;
import Juego.Juego;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class Evento {

    protected Date fecha;
    protected Juego juego;
    protected Equipo[] equipos;
    protected Equipo ganador;
    
    public Evento(){
        
    }
    
    public Evento(Date fecha, Juego juego, Equipo[] equipos, Equipo ganador){
        this.fecha = fecha;
        this.juego = juego;
        this.equipos = equipos;
        this.ganador = ganador;
    }
    
    public boolean equals(Evento other){
        return fecha == other.fecha;
    }
    
    @Override
    public String toString(){
        return "Evento{\n"
                + "Fecha: " + fecha + "\n"
                + "Juego: " + juego + "\n"
                + "Equipos: " + equipos + "\n"
                + "Ganador: " + ganador;
    }
}
