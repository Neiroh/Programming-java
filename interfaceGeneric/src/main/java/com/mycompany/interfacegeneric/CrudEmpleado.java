/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfacegeneric;

import controlador.ControladorEmpleado;
import modelo.Empleado;

/**
 *
 * @author jose
 */
public class CrudEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Empleado empleado = new Empleado("JOSÉ", "GONZÁLEZ GUTIÉRREZ", "00000000A");

        // controlador
        ControladorEmpleado controller = new ControladorEmpleado();

        // guarda un empleado a través del controlador
        controller.registrar(empleado);

        // ver empleados
        controller.verEmpleados();

        // editar un empleado por medio del id
        empleado.setId(1);
        empleado.setNombre("OSCAR");
        controller.actualizar(empleado);

        // eliminar un empleado por medio del id
        //empleado.setId(1);
        //controller.eliminar(empleado);*/
        
        System.out.println("¿Qué acción quieres realizar?\n"
                + "");
    }

}
