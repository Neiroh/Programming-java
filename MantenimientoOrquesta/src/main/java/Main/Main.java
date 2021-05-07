/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Instrumento.Cuerda;
import Instrumento.Instrumento;
import Instrumento.Percu;
import Instrumento.Viento;
import MantenimientoOrquesta.MantenimientoOrquesta;

/**
 *
 * @author Raul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Instrumento[] instrumentos = new Instrumento[3];
        instrumentos[0] = new Cuerda();
        instrumentos[1] = new Viento();
        instrumentos[2] = new Percu();
        
        MantenimientoOrquesta mo = new MantenimientoOrquesta();
        
        mo.mantenimientoOrquesta(instrumentos);
    }
    
}
