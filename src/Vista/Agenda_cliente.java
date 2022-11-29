package Vista;

import Controlador.control_Agenda;
import Controlador.control_Cliente;
import Modelo.Agenda;
import Modelo.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Agenda_cliente extends javax.swing.JPanel {

    int fila;
    int id;
    int tam_cl;
    String[][] cliente;
    String[][] Clientes_s;
    Object[] filas;
    DefaultTableModel model = new DefaultTableModel();

    public Agenda_cliente() {
        initComponents();
        Cargar_Agenda();
        Clientes_c();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Agenda = new javax.swing.JTable();
        Panel_Añadir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Clientes = new javax.swing.JComboBox<>();
        Lunes = new javax.swing.JCheckBox();
        Martes = new javax.swing.JCheckBox();
        Miercoles = new javax.swing.JCheckBox();
        Jueves = new javax.swing.JCheckBox();
        Viernes = new javax.swing.JCheckBox();
        Sabado = new javax.swing.JCheckBox();
        Guardar = new javax.swing.JButton();
        Panel_Actualizar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Agenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cliente", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Agenda);
        if (Agenda.getColumnModel().getColumnCount() > 0) {
            Agenda.getColumnModel().getColumn(0).setResizable(false);
            Agenda.getColumnModel().getColumn(1).setResizable(false);
            Agenda.getColumnModel().getColumn(2).setResizable(false);
            Agenda.getColumnModel().getColumn(3).setResizable(false);
            Agenda.getColumnModel().getColumn(4).setResizable(false);
            Agenda.getColumnModel().getColumn(5).setResizable(false);
            Agenda.getColumnModel().getColumn(6).setResizable(false);
            Agenda.getColumnModel().getColumn(7).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 51, 917, 373));

        Panel_Añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agendar nuevo dia");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        Lunes.setText("Lunes");

        Martes.setText("Martes");

        Miercoles.setText("Miercoles");

        Jueves.setText("Jueves");

        Viernes.setText("Viernes");

        Sabado.setText("Sabado");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_AñadirLayout = new javax.swing.GroupLayout(Panel_Añadir);
        Panel_Añadir.setLayout(Panel_AñadirLayout);
        Panel_AñadirLayout.setHorizontalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Guardar)
                    .addComponent(Sabado)
                    .addComponent(Viernes)
                    .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Lunes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Martes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Miercoles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jueves, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        Panel_AñadirLayout.setVerticalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Lunes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Martes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Miercoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jueves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Viernes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sabado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Guardar)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        add(Panel_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, -1, -1));

        Panel_Actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Panel_ActualizarLayout = new javax.swing.GroupLayout(Panel_Actualizar);
        Panel_Actualizar.setLayout(Panel_ActualizarLayout);
        Panel_ActualizarLayout.setHorizontalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        Panel_ActualizarLayout.setVerticalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        add(Panel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 560, 170));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 320, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        int cl = 0;

        control_Agenda ca = new control_Agenda();
        int mes = ca.Extraer_mes();

        for (String[] Cl : Clientes_s) {
            if (Cl[1].equals(Clientes.getSelectedItem())) {
                cl = Integer.parseInt(Cl[0]);
            }
        }
        if (mes != 0) {
            boolean status = false;

            if (Lunes.isSelected()) {
                Agenda ag = new Agenda(1, mes, cl);
                status = ca.Insertar(ag);
            }
            if (Martes.isSelected()) {
                Agenda ag = new Agenda(2, mes, cl);
                status = ca.Insertar(ag);
            }
            if (Miercoles.isSelected()) {
                Agenda ag = new Agenda(3, mes, cl);
                status = ca.Insertar(ag);
            }
            if (Jueves.isSelected()) {
                Agenda ag = new Agenda(4, mes, cl);
                status = ca.Insertar(ag);
            }
            if (Viernes.isSelected()) {
                Agenda ag = new Agenda(5, mes, cl);
                status = ca.Insertar(ag);
            }
            if (Sabado.isSelected()) {
                Agenda ag = new Agenda(6, mes, cl);
                status = ca.Insertar(ag);
            }

            if (status) {
                JOptionPane.showMessageDialog(null, "Se actualizo la agenda", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                Cargar_Agenda();
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void limpiar() {
        Agenda.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
    }

    private void Clientes_c() {
        Clientes.addItem("Selecciona una opcion");
        control_Cliente cc = new control_Cliente();
        List<Cliente> lista = cc.Mostrar_Clientes();

        int tam = lista.size();
        Clientes_s = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Clientes_s[i][0] = String.valueOf(lista.get(i).getIdCliente());
            Clientes_s[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
            Clientes.addItem(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
        }
    }

    private void Cargar_Agenda() {

        control_Cliente cc = new control_Cliente();
        List<Cliente> Cliente = cc.Mostrar_Clientes_Agenda();

        tam_cl = Cliente.size();
        filas = new Object[2];
        for (int i = 0; i < tam_cl; i++) {
            filas[0] = String.valueOf(Cliente.get(i).getIdCliente());
            filas[1] = Cliente.get(i).getNombre() + " " + Cliente.get(i).getApellido_p() + " " + Cliente.get(i).getApellido_m();
            model.addRow(filas);
        }

        Agenda.setModel((model));
        
        if (Agenda.getColumnModel().getColumnCount() > 0) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) Agenda.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            Agenda.getColumnModel().getColumn(0).setPreferredWidth(30);
            Agenda.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Agenda.getColumnModel().getColumn(1).setPreferredWidth(200);
            Agenda.getColumnModel().getColumn(2).setPreferredWidth(50);
            Agenda.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Agenda.getColumnModel().getColumn(3).setPreferredWidth(50);
            Agenda.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Agenda.getColumnModel().getColumn(4).setPreferredWidth(50);
            Agenda.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Agenda.getColumnModel().getColumn(5).setPreferredWidth(50);
            Agenda.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Agenda.getColumnModel().getColumn(6).setPreferredWidth(50);
            Agenda.getColumnModel().getColumn(6).setCellRenderer(tcr);
            Agenda.getColumnModel().getColumn(7).setPreferredWidth(50);
            Agenda.getColumnModel().getColumn(7).setCellRenderer(tcr);
        }
        BuscarCliente();
    }

    private void BuscarCliente() {
        control_Agenda ca = new control_Agenda();
        List<Agenda> listg = ca.Agenda_cl();
        cliente = new String[listg.size()][3];
        for (int i = 0; i < listg.size(); i++) {
            cliente[i][0] = String.valueOf(listg.get(i).getId_cliente());
            cliente[i][1] = listg.get(i).getNombre();
            cliente[i][2] = listg.get(i).getDia();
        }
        for (fila = 0; fila < tam_cl; fila++) {
            String xs = Agenda.getValueAt(fila, 0).toString();
            for (String[] Cl : cliente) {
                if (Cl[0].equals(xs)) {
                    int registros = ca.Buscar(Integer.parseInt(xs));
                    for (int i = 0; i < registros; i++) {
                        String opcion = Cl[2];
                        switch (opcion) {
                            case "Lunes":
                                Agenda.setValueAt("X", fila, 2);
                                break;
                            case "Martes":
                                Agenda.setValueAt("X", fila, 3);
                                break;
                            case "Miercoles":
                                Agenda.setValueAt("X", fila, 4);
                                break;
                            case "Jueves":
                                Agenda.setValueAt("X", fila, 5);
                                break;
                            case "Viernes":
                                Agenda.setValueAt("X", fila, 6);
                                break;
                            case "Sabado":
                                Agenda.setValueAt("X", fila, 7);
                                break;
                        }
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Agenda;
    private javax.swing.JComboBox<String> Clientes;
    private javax.swing.JButton Guardar;
    private javax.swing.JCheckBox Jueves;
    private javax.swing.JCheckBox Lunes;
    private javax.swing.JCheckBox Martes;
    private javax.swing.JCheckBox Miercoles;
    private javax.swing.JPanel Panel_Actualizar;
    private javax.swing.JPanel Panel_Añadir;
    private javax.swing.JCheckBox Sabado;
    private javax.swing.JCheckBox Viernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
