/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Participante;

import java.util.Arrays;
import Equipo.Equipo;
import Juego.Juego;
import Mesa.Mesa;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class ParticipanteVacio extends Participante{
    
    protected double tarifaParticipante = 5;

    public ParticipanteVacio(){
        
    }
    
    public ParticipanteVacio(String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa);
    }
    
    public ParticipanteVacio(String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa, boolean justificantePadre){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa, justificantePadre);
    }
    
    @Override
    public double pago(){
        return 1.5*tarifaParticipante;
    }
    
    public boolean equals(ParticipanteVacio other){
        return dni.equals(other.dni);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }

    public double getTarifaParticipante() {
        return tarifaParticipante;
    }

    public void setTarifaParticipante(double tarifaParticipante) {
        this.tarifaParticipante = tarifaParticipante;
    }
    
    
}
