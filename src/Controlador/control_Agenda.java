package Controlador;

import Conexion.ConexionBD;
import Modelo.Agenda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitler
 */
public class control_Agenda {

    private final ConexionBD conexion = ConexionBD.getInstance();
    private static ResultSet Resultado;

    public boolean Insertar(Agenda ag) {
        boolean status = false;

        String sql = "insert into agenda (id_cliente,id_dia,id_mes) values (?,?,?)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, ag.getId_cliente());
            comando.setInt(2, ag.getId_dia());
            comando.setInt(3, ag.getId_mes());

            comando.executeUpdate();
            status = true;
        } catch (SQLException ex) {
            status = false;
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public int Buscar(int id) {
        int registros = 0;

        String sql = "select * from agenda where id_cliente = ?";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            comando.setInt(1, id);
            
            Resultado = comando.executeQuery();
            
            while(Resultado.next()){
                    registros++;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        return registros;
    }

    public int Extraer_mes() {
        int mes = 0;

        String sql = "select extract(month from current_date)";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            if (Resultado.next()) {
                mes = (int) Resultado.getDouble(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(control_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        return mes;
    }

    public List<Agenda> Agenda_cl() {
        List<Agenda> AG = new ArrayList<>();

        String sql = "select ag.id_agenda,d.id_dia,d.dia,cl.id_cliente,(cl.nombre ||' '||cl.apellido_p||' '||cl.apellido_m) as nombre "
                + "from agenda ag "
                + "inner join clientes cl "
                + "on cl.id_cliente = ag.id_cliente "
                + "inner join dias d "
                + "on d.id_dia = ag.id_dia";
        PreparedStatement comando = null;

        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();

            while (Resultado.next()) {
                Agenda ag = new Agenda(Resultado.getInt("id_agenda"),
                        Resultado.getInt("id_dia"),
                        Resultado.getString("dia"),
                        Resultado.getInt("id_cliente"),
                        Resultado.getString("nombre"));
                AG.add(ag);
            }

            conexion.conectar().close();
            comando.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex, "Mensaje", JOptionPane.ERROR_MESSAGE);

        }

        return AG;
    }

}
