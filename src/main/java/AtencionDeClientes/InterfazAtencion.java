
package AtencionDeClientes;

import Configuracion.*;
import CompraTiquetes.NodoGenerico;
import CompraTiquetes.Tiquetes;
import Main.Menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InterfazAtencion extends javax.swing.JFrame {


    public InterfazAtencion(Menu menu,String nombreTerminal,GestorDeAtencion gestorDeAtencion) {
        
        initComponents();
        
        this.nombreTerminal=nombreTerminal;
        this.gestorDeAtencion=gestorDeAtencion;
      
        this.terminales= gestorDeAtencion.getPilaTerminales();
        cargarBuses (nombreTerminal);
        
        setLocationRelativeTo(null);
        
        DefaultTableModel modelo = new DefaultTableModel ();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Servicio");
        modelo.addColumn("Tipo de bus");
        modelo.addColumn("Terminal");
        
        tablaTiquetes.setModel(modelo);
        
        this.menu=menu;
    }

    
    
    public void cargarBuses (String nombre){
        

        Bus [] buses= gestorDeAtencion.cargarBuses(nombre);
        
        
        for (int i=0; i<buses.length;i++) {
           comboBoxBuses.addItem(buses[i].getTipo());
        }
        
    }
    
    
    public DefaultTableModel cargarTiquetes (){
        
        String tipoDeBus= String.valueOf(comboBoxBuses.getSelectedItem());
        NodoGenerico <Terminal> terminal=terminales.buscarDato(this.nombreTerminal);
        System.out.println(terminal.getDato().getNombre());
        ColaBus buses= terminal.getDato().getCola();
        System.out.println(buses.Mostrar());
        Bus bus= buses.buscarBus(tipoDeBus);
        
        
        Tiquetes [] tiquetes=bus.getColaTiquetes().recorrer();
        
        
        DefaultTableModel modelo = new DefaultTableModel ();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Servicio");
        modelo.addColumn("Tipo de bus");
        modelo.addColumn("Terminal");
        
        for (int i=0;i<tiquetes.length;i++){
            
            modelo.addRow(new Object[]{
                
                tiquetes[i].getId(),
                tiquetes[i].getNombre(),
                tiquetes[i].getServicio(),
                tiquetes[i].getTipoBus(),
                tiquetes[i].getTerminal(),
            });
        }
       
        return modelo;
            
    }
    
    
    public void Abordar (){
        
        
        
 
        
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonAbordar = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTiquetes = new javax.swing.JTable();
        comboBoxBuses = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        buttonAbordar.setText("Abordar");
        buttonAbordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbordarActionPerformed(evt);
            }
        });

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
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAbordar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(buttonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(buttonAbordar)
                .addGap(35, 35, 35)
                .addComponent(buttonVolver)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 460));

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Atención de tiquetes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(295, 295, 295))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 730, 100));

        tablaTiquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTiquetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaTiquetesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTiquetes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 280, 730, 180));

        comboBoxBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBusesActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 150, -1));

        jLabel2.setText("Elija el bus");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jButton1.setText("Ver tiquetes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

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
    }//GEN-LAST:event_buttonVolverActionPerformed

    private void comboBoxBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBusesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxBusesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo=cargarTiquetes();
        tablaTiquetes.setModel(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonAbordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbordarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAbordarActionPerformed

    private void tablaTiquetesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTiquetesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaTiquetesMousePressed



       

       

    
    private String nombreTerminal;
    private PilaConfiguracion <Terminal> terminales= new PilaConfiguracion<>();
    private GestorDeAtencion gestorDeAtencion= new GestorDeAtencion();
    private Menu menu= new Menu ();
    private Configuracion configuracion= new Configuracion ();
    private int fila=0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbordar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboBoxBuses;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTiquetes;
    // End of variables declaration//GEN-END:variables
}
