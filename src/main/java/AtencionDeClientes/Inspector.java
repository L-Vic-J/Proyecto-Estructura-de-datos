/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtencionDeClientes;

import CompraTiquetes.Pasajero;
import javax.swing.JOptionPane;


public class Inspector {
    public boolean revisarPasajero (Pasajero p){
   // double monto = CalculadoraServicio.calcularTotal(p);

    int decision = JOptionPane.showConfirmDialog(
        null,
        "El pasajero: " + p.getNombre() +
        "\nServicio: " + p.getTipoServicio() +
      //  "\nMonto a pagar: $" + monto +
        "\n¿Acepta pagar?",
        "Inspector",
        JOptionPane.YES_NO_OPTION
        );
    return decision == JOptionPane.YES_OPTION;
    }
    
}
