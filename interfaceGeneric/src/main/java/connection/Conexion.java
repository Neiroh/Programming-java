/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jose
 */
public class Conexion {

    public static Connection conectar() {
        Connection con = null;

        String password = "Daw.2021";
        String usuario = "neiroh";
        String url = "jdbc:mysql://localhost:3306/zoo?user=" + usuario
                + "&password=" + password;
        try {
            con = DriverManager.getConnection(url);
            //con = DriverManager.getConnection(url, "root", "Daw.2021");
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
