package CompraTiquetes;

import AtencionDeClientes.GestorDeAtencion;
import Configuracion.Configuracion;
import Configuracion.PilaConfiguracion;
import Configuracion.SerializacionPila;
import Configuracion.Terminal;
import Main.Menu;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class InterfazCompraTiquetes extends javax.swing.JFrame {

    public InterfazCompraTiquetes(Menu menu, GestorDeAtencion gestorAtencion) {

        initComponents();
        this.gestorAtencion = gestorAtencion;
        this.menu = menu;
        this.gestorDeCompras = new GestorDeCompras(gestorAtencion);

        // Se cargan los nombres de terminales registrados en el archivo config al combobox de terminales
        configuracion = serializacion.desseralizarPila("config");
        NodoGenerico<Terminal>[] listaTerminales = configuracion.getPilaTerminal().almacedarDatos();
        String[] nombresTerminales = new String[listaTerminales.length];

        for (int i = 0; i < listaTerminales.length; i++) {
            comboBoxTerminal.addItem(listaTerminales[i].getDato().getNombre());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textFieldCarga = new javax.swing.JTextField();
        comboBoxMoneda = new javax.swing.JComboBox<>();
        comboBoxTipoDeBus = new javax.swing.JComboBox<>();
        comboBoxServicio = new javax.swing.JComboBox<>();
        textFieldNombre = new javax.swing.JTextField();
        comboBoxTerminal = new javax.swing.JComboBox<>();
        Comprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textFieldEdad = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();

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
                .addGap(26, 26, 26)
                .addComponent(buttonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(buttonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 460));

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Compra de tiquetes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 730, 100));

        jLabel3.setText("Terminal:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel4.setText("Edad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jLabel5.setText("Modena:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jLabel6.setText("Servicio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel7.setText("Tipo de bus:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabel8.setText("Nombre:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        textFieldCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCargaActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 150, -1));

        comboBoxMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colones", "Dólares" }));
        jPanel1.add(comboBoxMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 150, -1));

        comboBoxTipoDeBus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preferencial", "Directo", "Normal" }));
        comboBoxTipoDeBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoDeBusActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxTipoDeBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 150, -1));

        comboBoxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Regular", "Carga", "Ejecutivo" }));
        comboBoxServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxServicioActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 150, -1));

        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 150, -1));

        jPanel1.add(comboBoxTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 150, -1));

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });
        jPanel1.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, -1, -1));

        jLabel2.setText("Carga:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        textFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEdadActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 150, -1));

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, -1, -1));

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

    private void textFieldCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCargaActionPerformed

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void textFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEdadActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed

        comprarTiquete();
        limpiar();

    }//GEN-LAST:event_ComprarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        gestorDeCompras.Serializar();
    }//GEN-LAST:event_RegistrarActionPerformed

    private void comboBoxTipoDeBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoDeBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTipoDeBusActionPerformed

    private void comboBoxServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxServicioActionPerformed

// Se genera el tiquete con sus atributos, Cambio: Aca se genera la hora de compra
    public void comprarTiquete() {
        try {
            String nombre = textFieldNombre.getText();
            int edad = Integer.parseInt(textFieldEdad.getText());
            String moneda = String.valueOf(comboBoxMoneda.getSelectedItem());
            String servicio = String.valueOf(comboBoxServicio.getSelectedItem());
            String tipoBus = String.valueOf(comboBoxTipoDeBus.getSelectedItem()).trim();
            String terminal = String.valueOf(comboBoxTerminal.getSelectedItem());
            String horaActual = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            Object terminalSeleccionado = comboBoxTerminal.getSelectedItem();
            if (terminalSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una terminal.");
                return;
            }

            // Calcular monto
            double monto = calcularMonto(servicio, tipoBus);
            if (monto < 0) {
                return; // Error en peso de carga
            }
            // Confirmar pago
            int respuesta = JOptionPane.showConfirmDialog(null,
                    "El monto a pagar es: $" + monto + "\n¿Acepta pagar al subir al bus?",
                    "Confirmar pago", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Pasajero rechazado. Reinicie el proceso.");
                return;
            }

            // Crear y registrar tiquete
            Tiquetes tiquete = new Tiquetes(nombre, edad, moneda, horaActual, servicio, tipoBus, terminal);
            gestorDeCompras.agregarTiquete(tiquete);
            gestorDeCompras.enviarTiquete(tiquete);

            JOptionPane.showMessageDialog(null, "Tiquete generado con éxito.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "En los campos de edad y carga solo debe ingresar números",
                    "Error al generar tiquete", JOptionPane.ERROR_MESSAGE);
        }
    }

    private double calcularMonto(String servicio, String tipoBus) {
        switch (servicio.toLowerCase()) {
            case "vip":
                return 100;
            case "regular":
                return 20;
            case "carga":
                try {
                    double peso = Double.parseDouble(textFieldCarga.getText());
                    return 20 + (10 * peso);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingrese un peso válido para la carga.");
                    return -1;
                }
            case "ejecutivo":
                return 100;
            default:
                return 0;
        }
    }

    public void limpiar() {

        textFieldNombre.setText("");
        textFieldEdad.setText("");
        comboBoxMoneda.setSelectedIndex(1);
        comboBoxServicio.setSelectedIndex(1);
        textFieldCarga.setText("");
        comboBoxTipoDeBus.setSelectedIndex(1);
        comboBoxTerminal.setSelectedIndex(1);
    }

    private Menu menu = new Menu();
    private Configuracion configuracion;
    private SerializacionPila serializacion = new SerializacionPila();
    private GestorDeAtencion gestorAtencion;
    private GestorDeCompras gestorDeCompras;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton buttonVolver;
    private javax.swing.JComboBox<String> comboBoxMoneda;
    private javax.swing.JComboBox<String> comboBoxServicio;
    private javax.swing.JComboBox<String> comboBoxTerminal;
    private javax.swing.JComboBox<String> comboBoxTipoDeBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField textFieldCarga;
    private javax.swing.JTextField textFieldEdad;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
