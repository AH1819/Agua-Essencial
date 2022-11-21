package Conexion;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection conectar() {
      try {

            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/agua", "postgres", "AH18192001");
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



