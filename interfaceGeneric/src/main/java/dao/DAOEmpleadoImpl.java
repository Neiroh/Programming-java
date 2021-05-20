/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;

/**
 *
 * @author jose
 */
public class DAOEmpleadoImpl implements DAOEmpleado{

    @Override
    public boolean registrar(Empleado empleado) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO empleado values (NULL,'" + empleado.getNombre()+ "','" + empleado.getApellidos()+ "','" + empleado.getDni()+ "')";

        try {
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Empleado> obtener() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM empleado ORDER BY id";

        List<Empleado> listaEmpleado = new ArrayList<Empleado>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Empleado c = new Empleado();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setDni(rs.getString(4));
                listaEmpleado.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método obtener");
            e.printStackTrace();
        }

        return listaEmpleado;
    }

    @Override
    public boolean actualizar(Empleado empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE empleado SET nombre='" + empleado.getNombre() + "', apellidos='" + empleado.getApellidos()+ "', dni='" + empleado.getDni()+ "'" + " WHERE ID=" + empleado.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(Empleado empleado) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM empleado WHERE ID=" + empleado.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase EmpleadoDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
}
