package Vista;

import Conexion.Conexion;
import Controlador.control_Usuario;
import Modelo.Usuario;
import static Vista.Menu_custom.jDesktopPane_menu;
import java.awt.Component;
import java.awt.Dimension;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class InterGestionarUsu extends javax.swing.JInternalFrame {

    private int idUsuario = 0;

    public InterGestionarUsu() {
        initComponents();
        this.setSize(new Dimension(1072, 488));
        this.setTitle("Gestionar Uusarios");
        this.CargarUsu();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableusuario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtapellido_p = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtapellido_m = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Administrar Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        tableusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Apellido", "Usuario", "Password", "Telefono", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableusuario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 770, 280));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel2.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btneliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 89, -1));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 160, 46, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Buscar Usuarios:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 23, -1, -1));
        jPanel2.add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 145, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Elegir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 105, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 190, 200));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Apellido Materno:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtapellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 990, 100));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Añadir Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 190, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        Usuario usuario = new Usuario();
        control_Usuario controlUsaurio = new control_Usuario();
        idUsuario=Integer.parseInt(txtbuscar.getText());
        if (idUsuario == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            if (txtnombre.getText().isEmpty() || txtapellido_p.getText().isEmpty() || txtusuario.getText().isEmpty() || txtpassword.getText().isEmpty() || txttelefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Compelte todos los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            } else {
                usuario.setNombre(txtnombre.getText().trim());
                usuario.setApellido_p(txtapellido_p.getText().trim());
                usuario.setApellido_m(txtapellido_m.getText().trim());
                usuario.setUsuario(txtusuario.getText().trim());
                usuario.setPassword(txtpassword.getText().trim());
                usuario.setTelefono(txttelefono.getText().trim());

                if (controlUsaurio.actualizar(usuario, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Actualizacion Exitosa", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiar();
                    this.CargarUsu();
                    idUsuario=0;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Actualizar", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        control_Usuario controlUsuario = new control_Usuario();
        idUsuario=Integer.parseInt(txtbuscar.getText());
        if (txtbuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!controlUsuario.eliminar(idUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.CargarUsu();
                this.limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar", "Mensaje", JOptionPane.ERROR_MESSAGE);
                this.limpiar();
            }
        }


    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a=Integer.parseInt(txtbuscar.getText());
        String datos[] = this.verUsuario(a);
        //this.verCliente(idCliente);
        txtnombre.setText(datos[0]);
        txtapellido_p.setText(datos[1]);
        txtusuario.setText(datos[2]);
        txtpassword.setText(datos[3]);
        txttelefono.setText(datos[4]);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    InterUsuario interUsuario = new InterUsuario();
        showInterlanFrame(interUsuario);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableusuario;
    private javax.swing.JTextField txtapellido_m;
    private javax.swing.JTextField txtapellido_p;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtnombre.setText("");
        txtapellido_p.setText("");
        txtusuario.setText("");
        txtpassword.setText("");
        txttelefono.setText("");
    }

    private void CargarUsu() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = (DefaultTableModel) this.tableusuario.getModel();
        String sql = "select*from usuario";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            /*InterGestionarUsu.tablecliente = new JTable(model);
            InterGestionarUsu.jScrollPane1.setViewportView(InterGestionarUsu.tablecliente);
            model.addColumn("N°");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("usuario");
            model.addColumn("password");
            model.addColumn("telefono");
            model.addColumn("estado");*/

            while (rs.next()) {
                Object fila[] = {
                rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)
                };
                model.addRow(fila);
                /*Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[1] = rs.getObject(i + 1);
                }
                model.addRow(fila);*/
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al llenar la tabla", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        /*tablecliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = tablecliente.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point > -1) {
                    idUsuario = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDato(idUsuario);
                }
            }
        });*/
    }

    private void EnviarDato(int idUsuario) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("select*from usuario where idUsuario='" + idUsuario + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtnombre.setText(rs.getString("nombre"));
                txtapellido_p.setText(rs.getString("apellido"));
                txtusuario.setText(rs.getString("usuario"));
                txtpassword.setText(rs.getString("password"));
                txttelefono.setText(rs.getString("telefono"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al seleccionar usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    public String[] verUsuario(int idUsuario) {
        Connection con = Conexion.conectar();
        Statement st;
        String sql = "select * from usuario where id_usuario= '" + idUsuario + "' ;";
        String[] x = new String[5];
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                x[0] = rs.getString("nombre");
                x[1] = rs.getString("apellido_p");
                x[2] = rs.getString("usuario");
                x[3] = rs.getString("password");
                x[4] = rs.getString("telefono");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return x;
    }
    
    private void showInterlanFrame(Component com) {
        jDesktopPane_menu.add(com);
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension FrameSize = com.getSize();
        com.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        com.setVisible(true);
    }
    
}
