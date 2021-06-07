/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo.Hormigon;

import Material.Material;

/**
 *
 * @author Neiroh
 */
public class Bañera extends Vehiculo.Vehiculo {

    public Bañera() {

    }

    @Override
    public void trabaja(Material material) {
        System.out.println("Llenando Bañera con " + material.getClass().getSimpleName() + "...");
    }

}
