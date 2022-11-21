package Vista;

import Controlador.control_Materia;
import Controlador.control_Producto;
import Modelo.Inventario_Materia;
import Modelo.Inventario_Producto;
import java.awt.Dimension;
import java.util.List;

public class Inventarios extends javax.swing.JPanel {

    public Inventarios() {
        initComponents();
        Enable(false, false);
        this.setSize(new Dimension(1018, 571));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inventarios = new javax.swing.JTable();
        Radio_prod = new javax.swing.JRadioButton();
        Radio_mat = new javax.swing.JRadioButton();
        Entradas = new javax.swing.JButton();
        Salidas = new javax.swing.JButton();
        Entrada_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Producto_e = new javax.swing.JLabel();
        Stock_e = new javax.swing.JComboBox<>();
        Actual_e = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Factura = new javax.swing.JTextField();
        Fecha_e = new com.toedter.calendar.JDateChooser();
        Cantidad_e = new javax.swing.JTextField();
        Precio_e = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Salida_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Producto_s = new javax.swing.JLabel();
        Stock_s = new javax.swing.JComboBox<>();
        Actual_s = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Fecha_s = new com.toedter.calendar.JDateChooser();
        Cantidad_s = new javax.swing.JTextField();
        Concepto_s = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Title = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Inventarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 1250, 150));

        buttonGroup1.add(Radio_prod);
        Radio_prod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Radio_prod.setText("Inventario de Productos");
        Radio_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_prodActionPerformed(evt);
            }
        });
        add(Radio_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        buttonGroup1.add(Radio_mat);
        Radio_mat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Radio_mat.setText("Inventario de Materia Prima");
        Radio_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_matActionPerformed(evt);
            }
        });
        add(Radio_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        Entradas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Entradas.setText("Añadir entradas");
        Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradasActionPerformed(evt);
            }
        });
        add(Entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        Salidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salidas.setText("Añadir salidas");
        Salidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidasActionPerformed(evt);
            }
        });
        add(Salidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, -1, -1));

        Entrada_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrada Stock");

        Producto_e.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Producto_e.setText(":");

        Stock_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_eActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad actual:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Folio de la factura:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de compra:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad adquirida:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Precio de compra:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Actualizar");

        javax.swing.GroupLayout Entrada_panelLayout = new javax.swing.GroupLayout(Entrada_panel);
        Entrada_panel.setLayout(Entrada_panelLayout);
        Entrada_panelLayout.setHorizontalGroup(
            Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entrada_panelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Entrada_panelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Entrada_panelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Entrada_panelLayout.createSequentialGroup()
                        .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(Producto_e)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidad_e, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Factura)
                                .addComponent(Stock_e, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Actual_e)
                                .addComponent(Fecha_e, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Precio_e, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        Entrada_panelLayout.setVerticalGroup(
            Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entrada_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto_e)
                    .addComponent(Stock_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actual_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fecha_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Cantidad_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Precio_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(Entrada_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 430, 380));

        Salida_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salida Stock");

        Producto_s.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Producto_s.setText(":");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad actual:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de salida:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Cantidad adquirida:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Concepto:");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Actualizar");

        javax.swing.GroupLayout Salida_panelLayout = new javax.swing.GroupLayout(Salida_panel);
        Salida_panel.setLayout(Salida_panelLayout);
        Salida_panelLayout.setHorizontalGroup(
            Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Salida_panelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Salida_panelLayout.createSequentialGroup()
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Salida_panelLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(Cantidad_s))
                    .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Salida_panelLayout.createSequentialGroup()
                            .addGap(201, 201, 201)
                            .addComponent(jButton4))
                        .addGroup(Salida_panelLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(Producto_s)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGap(44, 44, 44)
                            .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Fecha_s, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(Actual_s)
                                .addComponent(Stock_s, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Concepto_s)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Salida_panelLayout.setVerticalGroup(
            Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Salida_panelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto_s)
                    .addComponent(Stock_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actual_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fecha_s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Concepto_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(Salida_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, -1, 380));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Inventario");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void Radio_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_prodActionPerformed
        limpiar();
        Enable(false, false);
        Cargar_Inventario_Pro();
    }//GEN-LAST:event_Radio_prodActionPerformed

    private void Radio_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_matActionPerformed
        limpiar();
        Enable(false, false);
        Cargar_Inventario_Mat();
    }//GEN-LAST:event_Radio_matActionPerformed

    private void EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradasActionPerformed
        if (Radio_prod.isSelected()) {
            Enable(true, false);
            Producto_e.setText("Producto:");
        }
        if (Radio_mat.isSelected()) {
            Enable(true, false);
            Producto_e.setText("Materia:");
        }
    }//GEN-LAST:event_EntradasActionPerformed

    private void Stock_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_eActionPerformed

    }//GEN-LAST:event_Stock_eActionPerformed

    private void SalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidasActionPerformed
        if (Radio_prod.isSelected()) {
            Enable(false, true);
            Producto_s.setText("Producto:");
        }
        if (Radio_mat.isSelected()) {
            Enable(false, true);
            Producto_s.setText("Materia:");
        }
    }//GEN-LAST:event_SalidasActionPerformed
    private void limpiar() {
        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
    }

    private void Enable(boolean status_prod, boolean status_mat) {
        Stock_e.setEnabled(status_prod);
        Actual_e.setEnabled(status_prod);
        Factura.setEnabled(status_prod);
        Fecha_e.setEnabled(status_prod);
        Cantidad_e.setEnabled(status_prod);
        Precio_e.setEnabled(status_prod);

        Stock_s.setEnabled(status_mat);
        Actual_s.setEnabled(status_mat);
        Fecha_s.setEnabled(status_mat);
        Cantidad_s.setEnabled(status_mat);
        Concepto_s.setEnabled(status_mat);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actual_e;
    private javax.swing.JTextField Actual_s;
    private javax.swing.JTextField Cantidad_e;
    private javax.swing.JTextField Cantidad_s;
    private javax.swing.JTextField Concepto_s;
    private javax.swing.JPanel Entrada_panel;
    private javax.swing.JButton Entradas;
    private javax.swing.JTextField Factura;
    private com.toedter.calendar.JDateChooser Fecha_e;
    private com.toedter.calendar.JDateChooser Fecha_s;
    public static javax.swing.JTable Inventarios;
    private javax.swing.JTextField Precio_e;
    private javax.swing.JLabel Producto_e;
    private javax.swing.JLabel Producto_s;
    private javax.swing.JRadioButton Radio_mat;
    private javax.swing.JRadioButton Radio_prod;
    private javax.swing.JPanel Salida_panel;
    private javax.swing.JButton Salidas;
    private javax.swing.JComboBox<String> Stock_e;
    private javax.swing.JComboBox<String> Stock_s;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Cargar_Inventario_Mat() {
        control_Materia cm = new control_Materia();
        List<Inventario_Materia> lista = cm.Mostrar_Inventario_Materia();
        int tam = lista.size();
        String list[][] = new String[tam][5];
        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getInv_prod_codigo());
            list[i][1] = lista.get(i).getInv_name();
            list[i][2] = String.valueOf(lista.get(i).getInv_entradas());
            list[i][3] = String.valueOf(lista.get(i).getInv_salidas());
            list[i][4] = String.valueOf(lista.get(i).getInv_stock());
        }
        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Id", "Descripcion", "Entradas", "Salidas", "Stock"
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

    private void Cargar_Inventario_Pro() {
        control_Producto cp = new control_Producto();
        List<Inventario_Producto> lista = cp.Mostrar_Inventario_Productos();
        int tam = lista.size();
        Stock_e.addItem("Selecciona un producto");
        Stock_s.addItem("Selecciona un producto");
        String list[][] = new String[tam][5];
        for (int i = 0; i < tam; i++) {
            Stock_e.addItem(lista.get(i).getInv_name());
            Stock_s.addItem(lista.get(i).getInv_name());
            Actual_e.setText(String.valueOf(lista.get(i).getInv_stock()));
            Actual_s.setText(String.valueOf(lista.get(i).getInv_stock()));
            list[i][0] = String.valueOf(lista.get(i).getInv_id_producto());
            list[i][1] = lista.get(i).getInv_name();
            list[i][2] = String.valueOf(lista.get(i).getInv_entradas());
            list[i][3] = String.valueOf(lista.get(i).getInv_salidas());
            list[i][4] = String.valueOf(lista.get(i).getInv_stock());
        }
        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Id", "Descripcion", "Entradas", "Salidas", "Stock"
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

}
