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
public class Empresa extends Abonado{

    //Atributos
    String cif;
    
    public Empresa(){
        
    }
    
    public Empresa(String nombre, String direccion, Factura[] facturas, String cif){
        super(nombre, direccion, facturas);
        this.cif = cif;
    }
    
    public boolean equals(Empresa other){
        if(cif.equals(other.getCif()) && nombre.equals(other.getNombre()) && direccion.equals(other.getDireccion()) && facturas.equals(other.getFacturas())){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Empresa{\n"
                + "CIF: " + cif + "\n}";
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
}
