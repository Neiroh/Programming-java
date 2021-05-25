/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

import Animal.*;
import connection.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Animal.Animal;

/**
 *
 * @author jose
 */
public class DAOAnimalImpl implements DAOAnimal{

    @Override
    public boolean registrar(Animal animal) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO animal values (NULL,'" + animal.getNombre()+ "','" + animal.getEspecie() + "','" + animal.getRaza() + "')";

        try {
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase AnimalDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public List<Animal> obtener() {
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM animal ORDER BY id";

        List<Animal> listaAnimal = new ArrayList<Animal>();

        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Animal c = new Animal();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setEspecie(rs.getString(3));
                c.setRaza(rs.getString(4));
                listaAnimal.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase AnimalDaoImple, método obtener");
            e.printStackTrace();
        }

        return listaAnimal;
    }

    @Override
    public boolean actualizar(Animal animal) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE animal SET nombre='" + animal.getNombre() + "', especie='" + animal.getEspecie()+ "', raza='" + animal.getRaza()+ "', id='" + animal.getId()+ "'" + " WHERE id=" + animal.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase AnimalDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(Animal animal) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM animal WHERE ID=" + animal.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase AnimalDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }
}
