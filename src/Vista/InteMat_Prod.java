package Vista;

import Controlador.control_Materia;
import Controlador.control_Producto;
import Controlador.control_Proveedor;
import Modelo.Materia_prima;
import Modelo.Producto;
import Modelo.Proveedor;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;

public class InteMat_Prod extends javax.swing.JInternalFrame {

    int id_proveedor = 0;
    boolean materia = false;
    boolean productos = false;
    boolean status = false;

    public InteMat_Prod(String opcion) {
        initComponents();
        Proveedores_carga();
        this.setSize(new Dimension(419, 290));
        if (opcion.equals("Producto")) {
            this.setTitle("Producto");
            productos = true;
            Titulo.setText("Nuevo Producto");
        }
        if (opcion.equals("Materia Prima")) {
            this.setTitle("Materia prima");
            materia = true;
            Titulo.setText("Nueva Materia");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        Proveedores_cbx = new javax.swing.JComboBox<>();
        btnguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Titulo.setText("Nuevo Producto");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Proveedor:");

        Descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(Titulo))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(btnguardar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Proveedores_cbx, 0, 201, Short.MAX_VALUE)
                                .addComponent(Descripcion)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Proveedores_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnguardar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionActionPerformed

    }//GEN-LAST:event_DescripcionActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!Nombre.getText().isEmpty()) {
            if (!Descripcion.getText().isEmpty()) {
                if (!Proveedores_cbx.getSelectedItem().equals("Selecciona una opción")) {
                    for (String[] Proveedore : Proveedores) {
                        if (Proveedore[1].equals(Proveedores_cbx.getSelectedItem())) {
                            id_proveedor = Integer.parseInt(Proveedore[0]);
                        }
                    }

                    Insertar(id_proveedor, Nombre.getText(), Descripcion.getText());

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
            Nombre.requestFocus();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void Proveedores_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proveedores_cbxActionPerformed

    }//GEN-LAST:event_Proveedores_cbxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField Nombre;
    private javax.swing.JComboBox<String> Proveedores_cbx;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    int tam_proveedores;
    String[][] Proveedores;

    private void Proveedores_carga() {
        control_Proveedor cp = new control_Proveedor();
        List<Proveedor> lista = cp.Mostrar_proveedores();
        tam_proveedores = lista.size();
        Proveedores_cbx.addItem("Selecciona una opción");
        Proveedores = new String[tam_proveedores][2];
        for (int i = 0; i < tam_proveedores; i++) {
            Proveedores[i][0] = String.valueOf(lista.get(i).getId_proveedor());
            Proveedores[i][1] = lista.get(i).getRazon_social();
            Proveedores_cbx.addItem(lista.get(i).getRazon_social());
        }
    }

    private void Insertar(int id_proveedor, String Nombre, String Descripcion) {
        if (productos) {
            control_Producto cp = new control_Producto();
            Producto p = new Producto(id_proveedor, Nombre, Descripcion);
            status = cp.Insertar_Productos(p);
            if (status) {
                JOptionPane.showMessageDialog(null, "Producto Registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
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
        Menu_custom.eventos.post(Titulo.getText());
        this.dispose();
    }
}
