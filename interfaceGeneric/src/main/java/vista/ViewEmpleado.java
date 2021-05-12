/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.List;
import modelo.Empleado;

/**
 *
 * @author jose
 */
public class ViewEmpleado {

    public void verEmpleado(Empleado empleado) {
        System.out.println("Datos del Cliente: " + empleado);
    }

    public void verEmpleados(List<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println("Datos del Cliente: " + empleado);
        }
    }
}
