/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class ControladorEmpleado {

    private ViewEmpleado vista = new ViewEmpleado();

    public ControladorEmpleado() {
    }

    //llama al DAO para guardar un empleado
    public void registrar(Empleado empleado) {
        DAOEmpleado dao = new DAOEmpleadoImpl();
        dao.registrar(empleado);
    }

    //llama al DAO para actualizar un empleado
    public void actualizar(Empleado empleado) {
        DAOEmpleado dao = new DAOEmpleadoImpl();
        dao.actualizar(empleado);
    }

    //llama al DAO para eliminar un empleado
    public void eliminar(Empleado empleado) {
        DAOEmpleado dao = new DAOEmpleadoImpl();
        dao.eliminar(empleado);
    }

    //llama al DAO para obtener todos los empleados y luego los muestra en la vista
    public void verEmpleados() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        DAOEmpleado dao = new DAOEmpleadoImpl();
        empleados = dao.obtener();
        vista.verEmpleados(empleados);
    }
}
