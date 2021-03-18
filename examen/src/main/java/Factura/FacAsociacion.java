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
public class FacAsociacion extends Factura{

    double tarifaAsoc;
    
    @Override
    public double importeFactura(){
        return consumo*tarifaAsoc + tarifaBasura;
    }
    
    public FacAsociacion(){
        
    }
    
    public FacAsociacion(Date fecha, double consumo, double tarifaBasura, double tarifaAsoc){
        super(fecha, consumo, tarifaBasura);
        this.tarifaAsoc = tarifaAsoc;
    }
    
    public boolean equals(FacAsociacion other){
        if(fecha == other.getFecha() && consumo == other.getConsumo() && tarifaBasura == other.getTarifaBasura()&& tarifaAsoc == other.getTarifaCliente()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Factura Cliente{\nTarifa Cliente: " + tarifaAsoc + this + "\n}";
    }

    public double getTarifaCliente() {
        return tarifaAsoc;
    }

    public void setTarifaCliente(double tarifaAsoc) {
        this.tarifaAsoc = tarifaAsoc;
    }
}
