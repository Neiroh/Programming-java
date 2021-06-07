/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioVehiculo;

import Material.*;
import Vehiculo.Hormigon.*;
import Vehiculo.IEspecialidad;
import Vehiculo.Maquinaria.*;
import Vehiculo.Vehiculo;

/**
 *
 * @author Neiroh
 */
public class ServicioVehiculo {

    public ServicioVehiculo() {

    }

    public void recorreEspecialidad(IEspecialidad[] trabajos, Material[] mat, int parteCemento,
            int parteArena, int parteGrava) {

        //Serán variables auxiliares para facilitar la ordenación
        IEspecialidad[] recoge = new IEspecialidad[trabajos.length];
        Material[] material = new Material[mat.length];

        /*
            Primero se ordenan los trabajos para que sea más cómodo manipularlos
         */
        for (int i = 0; i < trabajos.length; i++) {
            for (int j = 0; j < recoge.length; j++) {
                if (trabajos[j] instanceof RetroExcavadora && i == 0) {
                    recoge[i] = trabajos[j];
                    //System.out.println(recoge[i]);
                    //recoge[i].trabaja();
                } else if (trabajos[j] instanceof PalaCargadora && i == 1) {
                    recoge[i] = trabajos[j];
                    //System.out.println(recoge[i]);
                    //recoge[i].trabaja();
                } else if (trabajos[j] instanceof Bañera && i == 2) {
                    recoge[i] = trabajos[j];
                    //System.out.println(recoge[i]);
                    //recoge[i].trabaja();
                } else if (trabajos[j] instanceof Cisterna && i == 3) {
                    recoge[i] = trabajos[j];
                    //System.out.println(recoge[i]);
                    //recoge[i].trabaja();
                } else if (trabajos[j] instanceof Hormigonera && i == 4) {
                    recoge[i] = trabajos[j];
                    //System.out.println(recoge[i]);
                    //recoge[i].trabaja();
                }
            }
        }
        /*
            Ordenamos los materiales
         */
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < material.length; j++) {
                if (mat[j] instanceof Arena && i == 0) {
                    material[i] = mat[j];
                } else if (mat[j] instanceof Grava && i == 1) {
                    material[i] = mat[j];
                } else if (mat[j] instanceof Cemento && i == 2) {
                    material[i] = mat[j];
                } else if (mat[j] instanceof Hormigon && i == 3) {
                    material[i] = mat[j];
                }
            }
        }

        /*
            Recorremos los trabajos en función de las partes de cada material
         */
        for (int i = 0; i < parteArena; i++) {
            for (int j = 0; j < 3; j++) {
                recoge[j].trabaja(material[0]);
            }
        }
        for (int i = 0; i < parteGrava; i++) {
            for (int j = 0; j < 3; j++) {
                recoge[j].trabaja(material[1]);
            }
        }
        for (int i = 0; i < parteCemento; i++) {
            recoge[3].trabaja(material[2]);
        }
        recoge[4].trabaja(material[3]);
    }
}
