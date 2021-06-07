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
public class Hormigonera extends Vehiculo.Vehiculo {

    int ejes;
    int capacidad;

    public Hormigonera() {

    }

    public Hormigonera(int ejes, int capacidad) {
        this.ejes = ejes;
        this.capacidad = capacidad;
    }

    @Override
    public void trabaja(Material material) {
        System.out.println("Mezclando " + material.getClass().getSimpleName() + "...");
    }

    @Override
    public String toString() {
        return "Hormigonera{" + "ejes=" + ejes + ", capacidad=" + capacidad + '}';
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
