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
public abstract class Factura {

    //Atributos
    protected Date fecha;
    protected double consumo;
    protected double tarifaBasura;
    
    public abstract double importeFactura();
    
    public Factura(){
        
    }
    
    public Factura(Date fecha, double consumo, double tarifaBasura){
        this.fecha = fecha;
        this.consumo = consumo;
        this.tarifaBasura = tarifaBasura;
    }
    
    public boolean equals(Factura other){
        if(fecha == other.getFecha() && consumo == other.getConsumo() && tarifaBasura == other.getTarifaBasura()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Factura{\nFecha de Emisión: " + fecha + "\nConsumo: " + consumo + "\nTarifa Basura: " + tarifaBasura + "\n}";
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getTarifaBasura() {
        return tarifaBasura;
    }

    public void setTarifaBasura(double tarifaBasura) {
        this.tarifaBasura = tarifaBasura;
    }
    
    
}
