/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Participante;

import Equipo.Equipo;
import Juego.Juego;
import Mesa.Mesa;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class ParticipanteJoven extends Participante{

    protected int numCarnet;
    protected double tarifaJoven = 3;
    
    public ParticipanteJoven(){
        
    }
    
    public ParticipanteJoven(int numCarnet, String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa);
        this.numCarnet = numCarnet;
    }
    
    public ParticipanteJoven(int numCarnet, String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa, boolean justificantePadre){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa, justificantePadre);
        this.numCarnet = numCarnet;
    }
    
    @Override
    public double pago(){
        return 1.5*tarifaJoven;
    }
    
    public boolean equals(ParticipanteJoven other){
        return dni.equals(other.dni);
    }
    
    @Override
    public String toString(){
        return "Participante Carnet Joven{\n"
                + "Número de Carnet Joven: " + numCarnet + "\n"
                + super.toString();
    }

    public int getNumCarnet() {
        return numCarnet;
    }

    public void setNumCarnet(int numCarnet) {
        this.numCarnet = numCarnet;
    }

    public double getTarifaJoven() {
        return tarifaJoven;
    }

    public void setTarifaJoven(double tarifaJoven) {
        this.tarifaJoven = tarifaJoven;
    }
    
    
}
