/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioVehiculo;

import Vehiculo.Hormigon.Bañera;
import Vehiculo.IEspecialidad;
import Vehiculo.Maquinaria.PalaCargadora;
import Vehiculo.Maquinaria.RetroExcavadora;

/**
 *
 * @author Neiroh
 */
public class ServicioVehiculo {

    public ServicioVehiculo() {

    }

    public void recorreEspecialidad(IEspecialidad[] trabajos) {
        for(int i = 0; i < 9; i++){
           for(int j = 0; i < trabajos.length; i++){
               
           }
        }
        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < trabajos.length; j++) {
                if (trabajos[i] instanceof RetroExcavadora) {
                    trabajos[i].trabaja();

                    if (trabajos[i] instanceof PalaCargadora) {
                        trabajos[i].trabaja();

                        if (trabajos[i] instanceof Bañera) {
                            trabajos[i].trabaja();

                        }
                    }
                }
            }
        }*/
    }
}
