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
public class ParticipanteFamNum extends Participante{

    protected int numLibro;
    protected double tarifaNum = 2.5;
    
    public ParticipanteFamNum(){
        
    }
    
    public ParticipanteFamNum(int numLibro, String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa);
        this.numLibro = numLibro;
    }
    
    public ParticipanteFamNum(int numLibro, String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa, boolean justificantePadre){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa, justificantePadre);
        this.numLibro = numLibro;
    }
    
    @Override
    public double pago(){
        return 1.5*tarifaNum;
    }
    
    public boolean equals(ParticipanteFamNum other){
        return dni.equals(other.dni);
    }
    
    @Override
    public String toString(){
        return "Participante Familia Numerosa{\n"
                + "Número de Libro de Familia Numerosa: " + numLibro + "\n"
                + super.toString();
    }

    public int getNumLibro() {
        return numLibro;
    }

    public void setNumLibro(int numLibro) {
        this.numLibro = numLibro;
    }

    public double getTarifaNum() {
        return tarifaNum;
    }

    public void setTarifaNum(double tarifaNum) {
        this.tarifaNum = tarifaNum;
    }
    
    
}
