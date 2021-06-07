/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Maquinaria;

import Material.Material;

/**
 *
 * @author Neiroh
 */
public class PalaCargadora extends Vehiculo.Vehiculo {

    public PalaCargadora() {

    }

    @Override
    public void trabaja(Material material) {
        System.out.println("Recogiendo " + material.getClass().getSimpleName() + "...");
    }

}
