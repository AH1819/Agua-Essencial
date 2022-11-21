package Vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import org.greenrobot.eventbus.EventBus;

public class Menu_custom extends javax.swing.JFrame {

    String opcion = "";
    public static EventBus eventos = new EventBus();

    public Menu_custom() {
        initComponents();
        this.setSize(new Dimension(1366, 728));
        GradientDropdownMenu menu = new GradientDropdownMenu();
        menu.addItem(" Clientes ", "Gestionar Clientes", "Agenda Clientes");
        menu.addItem("  Ventas  ", "Historial de Ventas", "Reporte de Ventas");
        menu.addItem("Repartidor", "Gestionar Repartidores", "Registrar Repartidor");
        menu.addItem("   Stock  ", "Inventario", "Productos", "Materia Prima", "Proveedores");
        menu.addItem("  Sesión  ", "Gestionar Usuarios", "Cerrar Sesión", "Salir");
        menu.setFont(new java.awt.Font("sansserif", 1, 14));
        menu.applay(this);

        menu.addEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex, boolean menuItem) {

                if (menuItem) {

                    opcion = menu.getMenuNameAt(index, subIndex);

                    switch (opcion) {

                        case "Gestionar Clientes":
                            Administrar_Clientes AdminCl = new Administrar_Clientes();
                            showInterlanFrame(AdminCl);
                            break;
                        case "Registrar Cliente":
                            InterCliente interCl = new InterCliente();
                            showInterlanFrame(interCl);
                            break;
                        case "Agenda Clientes":
                            break;
                        case "Historial de Ventas":
                            break;
                        case "Reporte de Ventas":
                            break;
                        case "Inventario":
                            Inventarios intergesPro = new Inventarios();
                            showInterlanFrame(intergesPro);
                            break;
                        case "Productos":
                            Materia_Productos MP = new Materia_Productos(opcion);
                            showInterlanFrame(MP);
                            //eventos.register(MP);

                            //showInterlanFrame(intergesMa);
                            break;
                        case "Materia Prima":
                            InterGestionarMat_Prod intergesMat = new InterGestionarMat_Prod(opcion);
                            //eventos.register(intergesMat);
                            showInterlanFrame(intergesMat);
                            break;
                        case "Proveedores":
                            InterGestionarProveedor intProveedores = new InterGestionarProveedor();
                            showInterlanFrame(intProveedores);
                            break;
                        case "Nuevo Usuario":
                            InterUsuario interUsuario = new InterUsuario();
                            showInterlanFrame(interUsuario);
                            break;
                        case "Gestionar Usuarios":
                            InterGestionarUsu intergesUs = new InterGestionarUsu();
                            showInterlanFrame(intergesUs);
                            break;
                        case "Cerrar Sesión":
                            Login lg = new Login();
                            lg.setVisible(true);
                            dispose();
                            break;
                        case "Salir":
                            System.exit(0);
                            break;
                    }
                }
                opcion = "";
            }
        });
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Logo.jpg"));
        return retValue;
    }

    public void showInterlanFrame(Component com) {
        com.setSize(1370, 679);
        com.setLocation(0, 0);

        Contenedor.removeAll();
        Contenedor.add(com, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_desktop = new javax.swing.JDesktopPane();
        Contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        javax.swing.GroupLayout Menu_desktopLayout = new javax.swing.GroupLayout(Menu_desktop);
        Menu_desktop.setLayout(Menu_desktopLayout);
        Menu_desktopLayout.setHorizontalGroup(
            Menu_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
        );
        Menu_desktopLayout.setVerticalGroup(
            Menu_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Menu_desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(Menu_desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_custom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_custom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    public static javax.swing.JDesktopPane Menu_desktop;
    // End of variables declaration//GEN-END:variables
}
