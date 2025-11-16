
package AtencionDeClientes;

import Configuracion.*;
import CompraTiquetes.NodoGenerico;
import CompraTiquetes.Tiquetes;
import Main.Menu;
import javax.swing.JOptionPane;


public class InterfazSeleccion extends javax.swing.JFrame {


    public InterfazSeleccion(Menu menu,GestorDeAtencion gestorDeAtencion) {
        initComponents();
        setLocationRelativeTo(null);
        this.gestorAtencion=gestorDeAtencion;
        
        this.menu=menu;
        
        
        configuracion=serilizacion.desseralizarPila("config");
        NodoGenerico<Terminal>[] listaTerminales=configuracion.getPilaTerminal().almacedarDatos();
        String [] nombresTerminales= new String [listaTerminales.length];
        
        for (int i=0; i<listaTerminales.length;i++) {
           ElegirTerminal.addItem(listaTerminales[i].getDato().getNombre());
        }
        
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonVolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ElegirTerminal = new javax.swing.JComboBox<>();
        buttonAtender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        buttonVolver.setText("Volver");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(buttonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(buttonVolver)
                .addGap(158, 158, 158))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 460));

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atención de clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 730, 100));

        jLabel8.setText("Eliga la terminal");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        ElegirTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirTerminalActionPerformed(evt);
            }
        });
        jPanel1.add(ElegirTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 200, -1));

        buttonAtender.setText("Atender");
        buttonAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtenderActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
       menu.setVisible(true);
       this.dispose();
       
       initComponents();
       
       
       
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void ElegirTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirTerminalActionPerformed
       
    }//GEN-LAST:event_ElegirTerminalActionPerformed

    private void buttonAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtenderActionPerformed
       String nombre= ElegirTerminal.getSelectedItem().toString();
       InterfazAtencion interfazAtencion= new InterfazAtencion(menu, nombre,gestorAtencion);
       interfazAtencion.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_buttonAtenderActionPerformed

    


    private Menu menu= new Menu ();
    private Configuracion configuracion= new Configuracion ();
    private SerializacionPila serilizacion= new SerializacionPila();
    private GestorDeAtencion gestorAtencion=new GestorDeAtencion();
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ElegirTerminal;
    private javax.swing.JButton buttonAtender;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
