/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

/**
 *
 * @author Neiroh
 */
public class Cono extends Objeto{
    
    protected double altura;
    
    public Cono(){
        
    }
    
    public Cono(double radio, double altura){
        super(radio);
        this.altura = altura;
    }
    
    @Override
    public double CalculaVolumen(){
        return (altura*pi*Math.pow(radio, 2))/3;
    }
    
    public boolean equals(Cono other){
        return super.equals(other) && altura == other.altura;
    }

    @Override
    public String toString() {
        return "Cono{" + "altura=" + altura + '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
