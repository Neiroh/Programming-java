/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;
import ServicioVehiculo.ServicioVehiculo;
import Vehiculo.Maquinaria.*;
import Vehiculo.Hormigon.*;
import Vehiculo.Vehiculo;

/**
 *
 * @author arce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo[] v = new Vehiculo[5];
        v[0] = new PalaCargadora();
        v[1] = new RetroExcavadora();
        v[2] = new Bañera();
        v[3] = new Cisterna();
        v[4] = new Hormigonera();
        
        ServicioVehiculo sv = new ServicioVehiculo();
        
        sv.recorreEspecialidad(v);
    }

}
