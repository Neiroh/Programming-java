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
public class ParticipanteMinusvalido extends Participante{

    protected int numMinusvalido;
    protected double tarifaMinus = 2;
    
    public ParticipanteMinusvalido(){
        
    }
    
    public ParticipanteMinusvalido(int numMinusvalido, String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa);
        this.numMinusvalido = numMinusvalido;
    }
    
    public ParticipanteMinusvalido(int numMinusvalido, String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Equipo equipo, Mesa mesa, boolean justificantePadre){
        super(dni, nombre, ap1, ap2, fechaNac, direccion, juegos, equipo, mesa, justificantePadre);
        this.numMinusvalido = numMinusvalido;
    }
    
    @Override
    public double pago(){
        return 1.5*tarifaMinus;
    }
    
    public boolean equals(ParticipanteMinusvalido other){
        return dni.equals(other.dni);
    }
    
    @Override
    public String toString(){
        return "Participante Minusválido{\n"
                + "Número de Minusvalía: " + numMinusvalido + "\n"
                + super.toString();
    }

    public int getNumMinusvalido() {
        return numMinusvalido;
    }

    public void setNumMinusvalido(int numMinusvalido) {
        this.numMinusvalido = numMinusvalido;
    }

    public double getTarifaMinus() {
        return tarifaMinus;
    }

    public void setTarifaMinus(double tarifaMinus) {
        this.tarifaMinus = tarifaMinus;
    }
    
    
}
