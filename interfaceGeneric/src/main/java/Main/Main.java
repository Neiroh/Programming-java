/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Animal.Animal;
import Animal.ControladorAnimal;
import Empleado.ControladorEmpleado;
import Empleado.Empleado;

/**
 *
 * @author jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado("Raúl", "Fernández");
        Animal animal = new Animal("Stil", "Tigretón", "De Bengala");

        // controlador
        ControladorEmpleado controller = new ControladorEmpleado();
        ControladorAnimal controllerA = new ControladorAnimal();

        // guarda un empleado a través del controlador
        controller.registrar(empleado);
        controllerA.registrar(animal);

        // ver empleados
        controller.verEmpleados();
        controllerA.verAnimales();

        // editar un empleado por medio del id
        empleado.setId(1);
        empleado.setNombre("OSCAR");
        controller.actualizar(empleado);
        
        animal.setId(1);
        animal.setNombre("Stul");
        controllerA.actualizar(animal);

        // eliminar un empleado por medio del id
        //empleado.setId(1);
        controller.eliminar(empleado);
        controllerA.eliminar(animal);
        
    }

}
