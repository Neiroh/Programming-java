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
import Material.*;

/**
 *
 * @author arce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Material[] m = new Material[4];
        m[0] = new Cemento();
        m[1] = new Grava();
        m[2] = new Arena();
        m[3] = new Hormigon();

        Vehiculo[] v = new Vehiculo[5];
        v[0] = new PalaCargadora();
        v[1] = new RetroExcavadora();
        v[2] = new Bañera();
        v[3] = new Cisterna();
        v[4] = new Hormigonera();

        ServicioVehiculo sv = new ServicioVehiculo();

        /*
            Este método recorre todos los trabajos que realizan los vehículos en orden
         */
        //@param v almacena los vehículos de tipo Vehiculo[]
        //@param m almacena los materiales de tipo Material[]
        //@param parteCemento almacena cuántas partes de cemento se van a usar (int)
        //@param parteArena almacena cuántas partes de arena se van a usar (int)
        //@param parteGrava almacena cuántas partes de grava se van a usar (int)
        sv.recorreEspecialidad(v, m, 1, 2, 3);
    }

}
