/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import java.util.List;
import Empleado.Empleado;

/**
 *
 * @author jose
 */
public interface DAOEmpleado {

    public boolean registrar(Empleado empleado);

    public List<Empleado> obtener();

    public boolean actualizar(Empleado empleado);

    public boolean eliminar(Empleado empleado);
}
