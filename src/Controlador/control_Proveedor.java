package Controlador;

import Conexion.ConexionBD;
import Modelo.Proveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_Proveedor {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean Insertar_proveedor(Proveedor proveedor) {
        boolean status = false;

        String sql = "insert into proveedores (razon_social, telefono, email, direccion, categoria) values (?,?,?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setString(1, proveedor.getRazon_social());
            comando.setString(2, proveedor.getTelefono());
            comando.setString(3, proveedor.getEmail());
            comando.setString(4, proveedor.getDireccion());
            comando.setString(5, proveedor.getCategoria());

            comando.executeUpdate();

            status = true;

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public List<Proveedor> Mostrar_proveedores() {
        List<Proveedor> Pv = new ArrayList<>();

        String sql = "select id_proveedor,razon_social from proveedores";
        PreparedStatement comando = null;

        try {

            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Proveedor pv = new Proveedor(Resultado.getInt("id_proveedor"),
                        Resultado.getString("razon_social"));
                Pv.add(pv);
            }

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {

            Logger.getLogger(control_Proveedor.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Pv;
    }

}
