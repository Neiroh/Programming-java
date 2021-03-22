/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abonado;

import Factura.Factura;
import java.util.Arrays;

/**
 *
 * @author Neiroh
 */
public class Abonado {

    //Atributos
    protected String nombre;
    protected String direccion;
    Factura[] facturas;
    
    public Abonado(){
        
    }
    
    public Abonado(String nombre, String direccion, Factura[] facturas){
        this.nombre = nombre;
        this.direccion = direccion;
        this.facturas = facturas;
    }
    
    public boolean equals(Abonado other){
        if(nombre.equals(other.getNombre()) && direccion.equals(other.getDireccion()) && facturas.equals(other.getFacturas())){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Abonado{\nNombre: " + nombre + "\nDirección: " + direccion + "\nFacturas: " + Arrays.toString(facturas) + "\n}";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }
    
    
}
