package Vista;

import Controlador.control_Materia;
import Controlador.control_Producto;
import Controlador.control_Proveedor;
import Modelo.Materia_prima;
import Modelo.Producto;
import Modelo.Proveedor;
//import static Vista.Menu_custom.jDesktopPane_menu;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;
import org.greenrobot.eventbus.Subscribe;

public class InterGestionarMat_Prod extends javax.swing.JInternalFrame {

    boolean productos = false;
    boolean materia = false;
    String eliminar = "";
    String mensaje = "";

    public InterGestionarMat_Prod(String opcion) {
        this.setSize(new Dimension(1366, 728));
        initComponents();
        jPanel3.setVisible(false);
        Proveedores_carga();
        if (opcion.equals("Materia Prima")) {
            this.setTitle("Materia Prima");
            jLabel7.setText("Elegir Materia:");
            mensaje = "Materia Prima";
            Añadir.setText("Añadir Materia");
            materia = true;
            Materia_Productos();
        }
        if (opcion.equals("Productos")) {
            this.setTitle("Productos");
            jLabel7.setText("Elegir Producto:");
            mensaje = "Producto";
            Añadir.setText("Añadir Producto");
            productos = true;
            Materia_Productos();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Inventario = new javax.swing.JTable();
        Añadir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Actualizar_btn = new javax.swing.JButton();
        Eliminar_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Id_buscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        proveedor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/layer.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Inventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 630, 250));

        Añadir.setText("Añadir Materia");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        getContentPane().add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Actualizar_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actualizar_btn.setText("Actualizar");
        Actualizar_btn.setEnabled(false);
        Actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_btnActionPerformed(evt);
            }
        });

        Eliminar_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Eliminar_btn.setText("Eliminar");
        Eliminar_btn.setEnabled(false);
        Eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Elegir Materia:");

        btnbuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbuscar.setText("Elegir");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Actualizar_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminar_btn)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnbuscar)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_btn)
                    .addComponent(Eliminar_btn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, 250, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id producto:");

        Id.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Proveedor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 620, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_btnActionPerformed
        if (!Nombre.getText().isEmpty()) {
            if (!descripcion.getText().isEmpty()) {

            } else {

            }
        } else {

        }
    }//GEN-LAST:event_Actualizar_btnActionPerformed

    private void Eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_btnActionPerformed
        String[] arreglo = {"Si", "No"};
        int opcionp = JOptionPane.showOptionDialog(null, "¿Esta seguro de eliminar " + eliminar + " ?", mensaje, 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "No");
        if (arreglo[opcionp].equals("Si")) {
            Eliminar(Integer.parseInt(Id_buscar.getText()));
        }
    }//GEN-LAST:event_Eliminar_btnActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if (!Id_buscar.getText().isEmpty()) {
            if (productos) {
                Search(Integer.parseInt(Id_buscar.getText()));
                jPanel3.setVisible(true);
                jLabel2.setText("Id producto");
            }
            if (materia) {
                Search(Integer.parseInt(Id_buscar.getText()));
                jPanel3.setVisible(true);
                jLabel2.setText("Id materia");
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        InteMat_Prod intMat_prod = new InteMat_Prod(mensaje);
        showInterlanFrame(intMat_prod);
    }//GEN-LAST:event_AñadirActionPerformed

    private void InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioMouseClicked

    }//GEN-LAST:event_InventarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_btn;
    private javax.swing.JButton Añadir;
    private javax.swing.JButton Eliminar_btn;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Id_buscar;
    private javax.swing.JTable Inventario;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> proveedor;
    // End of variables declaration//GEN-END:variables
    private void Eliminar(int id) {
        boolean status;
        control_Producto cp = new control_Producto();
        status = cp.Eliminar_producto(id);
        if (status) {
            JOptionPane.showMessageDialog(null, "Eliminado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No pudo ser eliminado", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Actualizar(int id, int proveedor, String nombre, String descripcion) {
        boolean status;
        if (materia) {
            control_Materia cm = new control_Materia();
            Materia_prima mp = new Materia_prima(id, proveedor, nombre, descripcion);
            status = cm.Actualizar(mp);
            if (status) {
                JOptionPane.showMessageDialog(null, "Actualizado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No pudo ser actualizado", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (productos) {
            control_Producto cm = new control_Producto();
            Producto pd = new Producto(id, proveedor, nombre, descripcion);
            status = cm.Actualizar(pd);
            if (status) {
                JOptionPane.showMessageDialog(null, "Actualizado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No pudo ser actualizado", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    private void Search(int id) {
        if (productos) {
            control_Producto cm = new control_Producto();
            List<Producto> lista = cm.Search_Producto(id);
            int tam = lista.size();
            String id_prov;
            if (tam != 0) {
                for (int i = 0; i < tam; i++) {
                    Id.setText(String.valueOf(lista.get(i).getId_producto()));
                    Nombre.setText(lista.get(i).getNombre());
                    descripcion.setText(lista.get(i).getDescripcion());
                    eliminar = lista.get(i).getDescripcion();
                    id_prov = String.valueOf(lista.get(i).getId_proveedor());
                    for (String[] Proveedore : Proveedores) {
                        if (Proveedore[0].equals(id_prov)) {
                            proveedor.setSelectedItem(Proveedore[1]);
                            break;
                        }
                    }
                }
                Actualizar_btn.setVisible(true);
                Eliminar_btn.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no registrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (materia) {
            control_Materia cm = new control_Materia();
            List<Materia_prima> lista = cm.Search_Producto(id);
            int tam = lista.size();
            String id_prov;
            if (tam != 0) {
                for (int i = 0; i < tam; i++) {
                    Id.setText(String.valueOf(lista.get(i).getId_materia()));
                    descripcion.setText(lista.get(i).getDescripcion());
                    id_prov = String.valueOf(lista.get(i).getId_proveedor());
                    for (String[] Proveedore : Proveedores) {
                        if (Proveedore[0].equals(id_prov)) {
                            proveedor.setSelectedItem(Proveedore[1]);
                            break;
                        }
                    }
                }
                Actualizar_btn.setVisible(true);
                Eliminar_btn.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Materia prima no registrada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    int tam_proveedores;
    String[][] Proveedores;

    private void Proveedores_carga() {
        control_Proveedor cp = new control_Proveedor();
        List<Proveedor> lista = cp.Mostrar_proveedores();
        tam_proveedores = lista.size();
        Proveedores = new String[tam_proveedores][2];
        for (int i = 0; i < tam_proveedores; i++) {
            Proveedores[i][0] = String.valueOf(lista.get(i).getId_proveedor());
            Proveedores[i][1] = lista.get(i).getRazon_social();
            proveedor.addItem(lista.get(i).getRazon_social());
        }
    }

    private void Materia_Productos() {
        String list[][] = null;
        if (materia) {
            control_Materia cm = new control_Materia();
            List<Materia_prima> lista = cm.Mostrar_Materia();
            int tam = lista.size();
            list = new String[tam][5];
            for (int i = 0; i < tam; i++) {
                list[i][0] = String.valueOf(lista.get(i).getId_materia());
                list[i][1] = lista.get(i).getProveedor();
                list[i][2] = lista.get(i).getNombre();
                list[i][3] = String.valueOf(lista.get(i).getDescripcion());
                list[i][4] = String.valueOf(lista.get(i).getEstado());
            }
        }
        if (productos) {
            control_Producto cm = new control_Producto();
            List<Producto> lista = cm.Mostrar_Productos();
            int tam = lista.size();
            list = new String[tam][5];
            for (int i = 0; i < tam; i++) {
                list[i][0] = String.valueOf(lista.get(i).getId_producto());
                list[i][1] = lista.get(i).getProveedor();
                list[i][2] = lista.get(i).getNombre();
                list[i][3] = String.valueOf(lista.get(i).getDescripcion());
                list[i][4] = String.valueOf(lista.get(i).getEstado());
            }
        }
        Inventario.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "N°", "Proveedor", "Nombre", "Descripcion", "Estado"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    private void showInterlanFrame(Component com) {
       // jDesktopPane_menu.add(com);
      //  Dimension desktopSize = jDesktopPane_menu.getSize();
      //  Dimension FrameSize = com.getSize();
      //  com.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
      //  com.setVisible(true);
    }

    @Subscribe
    public void Transporte(String ex) {
        Materia_Productos();
    }
}
