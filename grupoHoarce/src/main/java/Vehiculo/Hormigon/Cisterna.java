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
public class Cisterna extends Vehiculo.Vehiculo {

    public Cisterna() {

    }

    @Override
    public void trabaja(Material material) {
        System.out.println("Transportando " + material.getClass().getSimpleName() + "...");
    }

}
