/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientoOrquesta;

import Interface.IMantenimiento;

/**
 *
 * @author Raul
 */
public class MantenimientoOrquesta {
    
    public void mantenimientoOrquesta(IMantenimiento[] instrumentos){
        for(int i = 0; i < instrumentos.length; i++){
            instrumentos[i].afinar();
            instrumentos[i].limpiar();
            instrumentos[i].testear();
        }
    }
}
