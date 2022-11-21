package Controlador;

import Conexion.ConexionBD;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class control_Cliente {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public List<Cliente> Mostrar_Clientes() {
        List<Cliente> C = new ArrayList<>();

        String sql = "select * from clientes";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Cliente c = new Cliente(Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"),
                        Resultado.getString("apellido_p"),
                        Resultado.getString("apellido_m"),
                        Resultado.getString("telefono"),
                        Resultado.getString("residencia"),
                        Resultado.getString("calle"),
                        Resultado.getString("manzana"),
                        Resultado.getString("lote"));
                C.add(c);
            }

            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(control_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return C;
    }

}
