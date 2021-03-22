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
public class FacEmpresa extends Factura{

    double tarifaEmpresa;
    
    @Override
    public double importeFactura(){
        return consumo*tarifaEmpresa + tarifaBasura;
    }
    
    public FacEmpresa(){
        
    }
    
    public FacEmpresa(Date fecha, double consumo, double tarifaBasura, double tarifaEmpresa){
        super(fecha, consumo, tarifaBasura);
        this.tarifaEmpresa = tarifaEmpresa;
    }
    
    public boolean equals(FacCliente other){
        if(fecha == other.getFecha() && consumo == other.getConsumo() && tarifaBasura == other.getTarifaBasura()&& tarifaEmpresa == other.getTarifaCliente()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Factura Cliente{\nTarifa Empresa: " + tarifaEmpresa + "\n" + super.toString() + "\n}";
    }

    public double getTarifaEmpresa() {
        return tarifaEmpresa;
    }

    public void setTarifaCliente(double tarifaEmpresa) {
        this.tarifaEmpresa = tarifaEmpresa;
    }
}
