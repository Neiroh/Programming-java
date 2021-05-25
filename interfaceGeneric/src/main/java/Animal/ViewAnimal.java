/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import Empleado.*;
import java.util.List;
import Empleado.Empleado;

/**
 *
 * @author jose
 */
public class ViewAnimal {

    public void verAnimal(Animal animal) {
        System.out.println("Datos del Animal: " + animal);
    }

    public void verAnimales(List<Animal> animales) {
        for (Animal animal : animales) {
            System.out.println("Datos del Animal: " + animales);
        }
    }
}
