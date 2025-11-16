
package Configuracion;

import CompraTiquetes.NodoGenerico;
import Main.Menu;
import javax.swing.JOptionPane;


public class InterfazConfiguracion extends javax.swing.JFrame {


    public InterfazConfiguracion(Menu menu) {
        initComponents();
        setLocationRelativeTo(null);
        
        
        this.menu=menu;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonTerminales = new javax.swing.JButton();
        buttonUsuarios = new javax.swing.JButton();
        buttonVolver = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonRegistrarTerminal = new javax.swing.JButton();
        textFieldNombreTerminal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldUsuario = new javax.swing.JTextField();
        textFieldContraseña = new javax.swing.JTextField();
        buttonAlmacenar = new javax.swing.JButton();
        buttonRegistrarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        buttonTerminales.setText("Terminales");

        buttonUsuarios.setText("Usuarios");

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
                    .addComponent(buttonTerminales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(buttonTerminales)
                .addGap(36, 36, 36)
                .addComponent(buttonUsuarios)
                .addGap(35, 35, 35)
                .addComponent(buttonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 460));

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuración del sistema");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 730, 100));

        jLabel2.setText("Cantidad de buses:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        jPanel1.add(textFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 180, -1));

        jLabel3.setText("Usuarios");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        buttonRegistrarTerminal.setText("Registrar terminal");
        buttonRegistrarTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarTerminalActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegistrarTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));
        jPanel1.add(textFieldNombreTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 180, -1));

        jLabel4.setText("Nombre terminal:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel5.setText("Terminales");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel6.setText("Usuario:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));
        jPanel1.add(textFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 180, -1));
        jPanel1.add(textFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 180, -1));

        buttonAlmacenar.setText("Almacenar configuración");
        buttonAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlmacenarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAlmacenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        buttonRegistrarUsuario.setText("Registrar usuario");
        buttonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, -1));

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

    private void buttonRegistrarTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarTerminalActionPerformed
        crearTerminal ();
        limpiarRegistroTerminal ();
    }//GEN-LAST:event_buttonRegistrarTerminalActionPerformed

    private void buttonAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlmacenarActionPerformed
        almacenarPilas ();
       
    }//GEN-LAST:event_buttonAlmacenarActionPerformed

    private void buttonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarUsuarioActionPerformed
        crearUsuario ();
        limpiarRegistroUsuario ();
    }//GEN-LAST:event_buttonRegistrarUsuarioActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed


       public void crearUsuario (){
   
        String nombre=textFieldUsuario.getText();
        String password= textFieldContraseña.getText();
       
        Usuario nuevoUsuario =new Usuario (nombre,password);
        configuracion.agregarNodoUsuario(nuevoUsuario);
       
        
    }
       
     
    public void crearTerminal (){
        
        try {
     
        String nombre=textFieldNombreTerminal.getText();
        int cantidad=Integer.parseInt(textFieldCantidad.getText ());
       
        Terminal nuevaTerminal =new Terminal (nombre,cantidad);
        configuracion.agregarNodoTerminal(nuevaTerminal);
        
        
        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Solo se puede ingresar numeros");
        }
             
    }
    
    
    
    public void almacenarPilas (){
        
        configuracion.Serializar(); 
    }
            
    
    
    
   public void limpiarRegistroTerminal (){
       textFieldNombreTerminal.setText("");
       textFieldCantidad.setText("");
   }
     
   public void limpiarRegistroUsuario (){
       textFieldUsuario.setText("");
       textFieldContraseña.setText("");
   }
    
    
    
    
    private Menu menu= new Menu ();
    private Configuracion configuracion= new Configuracion ();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlmacenar;
    private javax.swing.JButton buttonRegistrarTerminal;
    private javax.swing.JButton buttonRegistrarUsuario;
    private javax.swing.JButton buttonTerminales;
    private javax.swing.JButton buttonUsuarios;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField textFieldCantidad;
    private javax.swing.JTextField textFieldContraseña;
    private javax.swing.JTextField textFieldNombreTerminal;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
