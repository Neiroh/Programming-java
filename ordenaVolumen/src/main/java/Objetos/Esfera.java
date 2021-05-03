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
public class Esfera extends Objeto{

    public Esfera(){
        
    }
    
    public Esfera(double radio){
        
        super(radio);
        
    }
    
    @Override
    public double CalculaVolumen(){
        return 4/3*(pi*Math.pow(radio,3));
    }
    
    public boolean equals(Esfera other){
        
        return super.equals(other);
        
    }
}
