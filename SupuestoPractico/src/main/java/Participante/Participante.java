/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Participante;

import Juego.Juego;
import Mesa.Mesa;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Neiroh
 */
public abstract class Participante {

    protected String dni;
    protected String nombre;
    protected String ap1;
    protected String ap2;
    protected Date fechaNac;
    protected String direccion;
    protected Juego[] juegos;
    protected Mesa mesa;
    protected boolean justificantePadre;
    
    public Participante(){
        
    }
    
    public Participante(String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Mesa mesa){
        this.dni = dni;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.juegos = juegos;
        this.mesa = mesa;
    }
    
    public Participante(String dni, String nombre, String ap1, String ap2, Date fechaNac, String direccion,
            Juego[] juegos, Mesa mesa, boolean justificantePadre){
        this.dni = dni;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.juegos = juegos;
        this.mesa = mesa;
        this.justificantePadre = justificantePadre;
    }
    
    public abstract double pago();
    
    public boolean equals(Participante other){
        return dni.equals(other.dni);
    }
    
    @Override
    public String toString(){
        return "Participante{\n"
                + "DNI: " + dni + "\n"
                + "Nombre: " + nombre + " " + ap1 + " " + ap2 + "\n"
                + "Fecha de Nacimiento: " + fechaNac + "\n"
                + "Dirección: " + direccion + "\n"
                + "Juegos: " + Arrays.toString(juegos) + "\n"
                + "Mesa: " + mesa + "\n"
                + "Justificante: " +justificantePadre;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Juego[] getJuegos() {
        return juegos;
    }

    public void setJuegos(Juego[] juegos) {
        this.juegos = juegos;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public boolean isJustificantePadre() {
        return justificantePadre;
    }

    public void setJustificantePadre(boolean justificantePadre) {
        this.justificantePadre = justificantePadre;
    }
    
    
}
