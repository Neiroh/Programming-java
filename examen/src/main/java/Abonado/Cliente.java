/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abonado;

import Factura.Factura;

/**
 *
 * @author Neiroh
 */
public class Cliente extends Abonado{

    //Atributos
    String dni;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, String direccion, Factura[] facturas, String dni){
        super(nombre, direccion, facturas);
        this.dni = dni;
    }
    
    public boolean equals(Cliente other){
        if(dni.equals(other.getDni()) && nombre.equals(other.getNombre()) && direccion.equals(other.getDireccion()) && facturas.equals(other.getFacturas())){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Cliente{\n"
                + "DNI: " + dni + "\n}";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
