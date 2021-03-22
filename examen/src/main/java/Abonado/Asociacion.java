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
public class Asociacion extends Abonado{

    //Atributos
    String ca;
    
    public Asociacion(){
        
    }
    
    public Asociacion(String nombre, String direccion, Factura[] facturas, String ca){
        super(nombre, direccion, facturas);
        this.ca = ca;
    }
    
    public boolean equals(Asociacion other){
        if(ca.equals(other.getCa()) && nombre.equals(other.getNombre()) && direccion.equals(other.getDireccion()) && facturas.equals(other.getFacturas())){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Asociacion{\n"
                + "CA: " + ca + "\n}";
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }
}
