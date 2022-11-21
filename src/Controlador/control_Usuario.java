package Controlador;

import Modelo.Usuario;
import Conexion.ConexionBD;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class control_Usuario {

    private final ConexionBD conexion = ConexionBD.getInstance();

    public boolean guardar(Usuario objeto) {
        boolean respuesta = false;

        try {

            PreparedStatement consulta = conexion.conectar().prepareStatement("insert into usuario(nombre,apellido_p,apellido_m,usuario,password,telefono,status) values(?,?,?,?,?,?,?)");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido_p());
            consulta.setString(3, objeto.getApellido_m());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());
            consulta.setString(7, objeto.getStatus());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            conexion.conectar().close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        return respuesta;
    }

    public boolean existeUsu(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from usuario where usuario='" + usuario + "';";
        Statement st;
        try {
            st = conexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return respuesta;
    }

    //Metodo de inicio de sesion
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;

        String sql = "select usuario, password from usuario where usuario= '" + objeto.getUsuario() + "' and password='" + objeto.getPassword() + "';";
        Statement st;
        try {

            st = conexion.conectar().createStatement();
            ResultSet rs = st.executeQuery(sql);
            //st.close();

            while (rs.next()) {
                respuesta = true;

            }
        } catch (Exception e) {

        }
        return respuesta;
    }

    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        try {
            PreparedStatement consulta = conexion.conectar().prepareStatement("update usuario set nombre=?, apellido_p=?, apellido_m=?, usuario=?, password=?, telefono=? where id_usuario='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido_p());
            consulta.setString(3, objeto.getApellido_m());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6, objeto.getTelefono());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            conexion.conectar().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar usuario" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return respuesta;
    }

    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        try {
            PreparedStatement consulta = conexion.conectar().prepareStatement("delete from usuario where id_usuario='" + idUsuario + "'");
            //consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
            conexion.conectar().close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);

        }
        return respuesta;
    }
}
