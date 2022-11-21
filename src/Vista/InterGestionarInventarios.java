package Vista;

import Controlador.control_Materia;
import Controlador.control_Producto;
import Modelo.Inventario_Materia;
import Modelo.Inventario_Producto;
import java.awt.Component;
import java.awt.Dimension;
import java.util.List;

public class InterGestionarInventarios extends javax.swing.JInternalFrame {
    
    public InterGestionarInventarios() {
        initComponents();
        this.setSize(new Dimension(1018, 571));
        this.setTitle("Inventarios");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Title = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inventarios = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Inventarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 910, 280));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setText("Inventario de Productos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setText("Inventario de Materia Prima");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Añadir entradas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Añadir salidas");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        limpiar();
        Cargar_Inventario_Pro();
        Title.setText("Inventario de Productos");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        limpiar();
        Cargar_Inventario_Mat();
        Title.setText("Inventario de Materia Prima");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterActualizarStock interactStock = new InterActualizarStock();
        showInterlanFrame(interactStock);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void showInterlanFrame(Component com) {
        jDesktopPane_menu.add(com);
        Dimension desktopSize = jDesktopPane_menu.getSize();
        Dimension FrameSize = com.getSize();
        com.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        com.setVisible(true);
    }
    private void limpiar(){
        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Inventarios;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

//Cargar tabla inventarios
    private void Cargar_Inventario_Mat(){
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
        String list[][] = new String[tam][5];
        for (int i = 0; i < tam; i++) {
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
