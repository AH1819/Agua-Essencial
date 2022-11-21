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

public class Materia_Productos extends javax.swing.JPanel {

    boolean productos = false;
    boolean materia = false;
    String eliminar = "";
    String mensaje = "";
    int id_proveedor = 0;
    boolean status = false;

    public Materia_Productos(String opcion) {
        initComponents();
        this.setSize(new Dimension(1370, 679));
        initComponents();
        Panel_Actualizar.setVisible(false);
        Proveedores_carga();
        Panel_Añadir.setVisible(false);
        if (opcion.equals("Materia Prima")) {
            jLabel7.setText("Elegir Materia:");
            mensaje = "Materia Prima";
            Añadir.setText("Añadir Materia");
            materia = true;
            Titulo.setText("Nueva Materia");
            Materia_Productos();
        }
        if (opcion.equals("Productos")) {
            jLabel7.setText("Elegir Producto:");
            mensaje = "Producto";
            Añadir.setText("Añadir Producto");
            productos = true;
            Titulo.setText("Nuevo Producto");
            Materia_Productos();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Inventario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Actualizar_btn = new javax.swing.JButton();
        Eliminar_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Id_buscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        Panel_Actualizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        proveedor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Nombre_act = new javax.swing.JTextField();
        Añadir = new javax.swing.JButton();
        Panel_Añadir = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre_ins = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Proveedores_cbx = new javax.swing.JComboBox<>();
        btnguardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 900, 250));

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
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Actualizar_btn)
                        .addGap(45, 45, 45)
                        .addComponent(Eliminar_btn)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnbuscar)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_btn)
                    .addComponent(Eliminar_btn))
                .addGap(40, 40, 40))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 250, 250));

        Panel_Actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Id producto:");

        Id.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Proveedor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout Panel_ActualizarLayout = new javax.swing.GroupLayout(Panel_Actualizar);
        Panel_Actualizar.setLayout(Panel_ActualizarLayout);
        Panel_ActualizarLayout.setHorizontalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Nombre_act, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27))
        );
        Panel_ActualizarLayout.setVerticalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        add(Panel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 620, 90));

        Añadir.setText("Añadir Materia");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, -1));

        Panel_Añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Nuevo Producto");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Descripcion:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Proveedor:");

        Proveedores_cbx.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Proveedores_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proveedores_cbxActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        Descripcion.setColumns(20);
        Descripcion.setLineWrap(true);
        Descripcion.setRows(5);
        Descripcion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Descripcion);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Limpiar");

        javax.swing.GroupLayout Panel_AñadirLayout = new javax.swing.GroupLayout(Panel_Añadir);
        Panel_Añadir.setLayout(Panel_AñadirLayout);
        Panel_AñadirLayout.setHorizontalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(39, 39, 39)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Nombre_ins, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(Proveedores_cbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnguardar)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Panel_AñadirLayout.setVerticalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(28, 28, 28)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Nombre_ins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Proveedores_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
        );

        add(Panel_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 400, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void InventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioMouseClicked

    }//GEN-LAST:event_InventarioMouseClicked

    private void Actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_btnActionPerformed
        if (!Nombre_act.getText().isEmpty()) {
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
                Panel_Actualizar.setVisible(true);
                jLabel2.setText("Id producto");
            }
            if (materia) {
                Search(Integer.parseInt(Id_buscar.getText()));
                Panel_Actualizar.setVisible(true);
                jLabel2.setText("Id materia");
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        Panel_Añadir.setVisible(true);
    }//GEN-LAST:event_AñadirActionPerformed

    private void Proveedores_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedores_cbxActionPerformed

    }//GEN-LAST:event_Proveedores_cbxActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!Nombre_ins.getText().isEmpty()) {
            if (!Descripcion.getText().isEmpty()) {
                if (!Proveedores_cbx.getSelectedItem().equals("Selecciona una opción")) {
                    for (String[] Proveedore : Proveedores) {
                        if (Proveedore[1].equals(Proveedores_cbx.getSelectedItem())) {
                            id_proveedor = Integer.parseInt(Proveedore[0]);
                        }
                    }

                    Insertar(id_proveedor, Nombre_act.getText(), Descripcion.getText());

                    id_proveedor = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Campo vacio: Proveedor", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    Proveedores_cbx.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campo vacio: Descripcion", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                Descripcion.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo vacio: Nombre", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            Nombre_act.requestFocus();
        }
    }//GEN-LAST:event_btnguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_btn;
    private javax.swing.JButton Añadir;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JButton Eliminar_btn;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Id_buscar;
    private javax.swing.JTable Inventario;
    private javax.swing.JTextField Nombre_act;
    private javax.swing.JTextField Nombre_ins;
    private javax.swing.JPanel Panel_Actualizar;
    private javax.swing.JPanel Panel_Añadir;
    private javax.swing.JComboBox<String> Proveedores_cbx;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> proveedor;
    // End of variables declaration//GEN-END:variables
private void Eliminar(int id) {
        control_Producto cp = new control_Producto();
        status = cp.Eliminar_producto(id);
        if (status) {
            JOptionPane.showMessageDialog(null, "Eliminado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No pudo ser eliminado", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Actualizar(int id, int proveedor, String nombre, String descripcion) {
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
                    Nombre_act.setText(lista.get(i).getNombre());
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
            Proveedores_cbx.addItem(lista.get(i).getRazon_social());
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

    private void Insertar(int id_proveedor, String Nombre, String Descripcion) {
        if (productos) {
            control_Producto cp = new control_Producto();
            Producto p = new Producto(id_proveedor, Nombre, Descripcion);
            status = cp.Insertar_Productos(p);
            if (status) {
                JOptionPane.showMessageDialog(null, "Producto Registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                Panel_Añadir.setVisible(false);
                Materia_Productos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el producto", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if (materia) {
            control_Materia Mp = new control_Materia();
            Materia_prima MP = new Materia_prima(id_proveedor, Nombre, Descripcion);
            status = Mp.Insertar_Materias(MP);
            if (status) {
                JOptionPane.showMessageDialog(null, "Materia Registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la materia", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
