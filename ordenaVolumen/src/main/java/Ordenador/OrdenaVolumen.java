/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ordenador;

import Interfaces.IOrdena;
import Objetos.Objeto;

/**
 *
 * @author Neiroh
 */
public class OrdenaVolumen {
    
    

    public void OrdenaObjetos(IOrdena[] objetos){
        
        IOrdena[] array = new IOrdena[objetos.length];
        
        for(int i = 0; i < objetos.length; i++){
            for(int j = 0; j < objetos.length; j++){
                if(objetos[j].CalculaVolumen() > objetos[j+1].CalculaVolumen() && (j+1) <= objetos.length){
                    array[i] = objetos[i];
                } 
            }
        }
    }
}
