/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factura;

import java.util.Date;

/**
 *
 * @author Neiroh
 */
public class FacCliente extends Factura{

    //Atributos
    double tarifaCliente;
    
    @Override
    public double importeFactura(){
        return consumo*tarifaCliente + tarifaBasura;
    }
    
    public FacCliente(){
        
    }
    
    public FacCliente(Date fecha, double consumo, double tarifaBasura, double tarifaCliente){
        super(fecha, consumo, tarifaBasura);
        this.tarifaCliente = tarifaCliente;
    }
    
    public boolean equals(FacCliente other){
        if(fecha == other.getFecha() && consumo == other.getConsumo() && tarifaBasura == other.getTarifaBasura()&& tarifaCliente == other.getTarifaCliente()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Factura Cliente{\nTarifa Cliente: " + tarifaCliente + this + "\n}";
    }

    public double getTarifaCliente() {
        return tarifaCliente;
    }

    public void setTarifaCliente(double tarifaCliente) {
        this.tarifaCliente = tarifaCliente;
    }
}
