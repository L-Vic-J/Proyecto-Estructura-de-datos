package Configuracion;

import CompraTiquetes.Tiquetes;
import javax.swing.JOptionPane;

public class ColaTiquetes {

    // Atributos de cada cola
    Tiquetes tiqueteInicial;
    Tiquetes tiqueteFinal;
    Boolean inspectorDisponible;

    // El inspector esta en true
    public ColaTiquetes() {
        this.tiqueteInicial = null;
        this.tiqueteFinal = null;
        this.inspectorDisponible = true;
    }

    //Si el inspector esta disponible y la cola esta vacia se atiende directamente el cliente
    public void encolar(Tiquetes tiquete) {


        tiquete.setEstado("En espera");

        if (tiqueteFinal != null) {
            tiqueteFinal.setSiguiente(tiquete);
        }

        tiqueteFinal = tiquete;

        if (tiqueteInicial == null) {
            tiqueteInicial = tiquete;
        }

    }

    public Tiquetes[] recorrer() {

        if (tiqueteInicial == null) {
            JOptionPane.showMessageDialog(null, "No hay tiquetes pendientes de atender", "Cola del bus", JOptionPane.INFORMATION_MESSAGE);
        } else {

            Tiquetes[] tiquetes = new Tiquetes [longitud()];
            int contador=0;
            Tiquetes actual = tiqueteInicial;

            while (actual != null) {
                tiquetes [contador]=actual;
                contador++;
                actual = actual.getSiguiente();
            }
            return tiquetes;
        }
        return new Tiquetes[0];
    }

    
    public int longitud() {

        if (tiqueteInicial == null) {
            return 0;
        } else {
             Tiquetes actual = tiqueteInicial;
             int contador=0;

            while (actual != null) {
                actual = actual.getSiguiente();
                contador++;

            }
         return contador;
        }
        
        
        }
    
    
    public Tiquetes Desencolar (int id){
         if (tiqueteInicial == null) {
          JOptionPane.showMessageDialog(null, "No hay tiquetes pendientes de atender", "Cola del bus", JOptionPane.INFORMATION_MESSAGE);
        } else {
             Tiquetes actual=tiqueteInicial;
             while (actual!=null && actual.getId()!=id){
                 actual=actual.getSiguiente();
             }
             Tiquetes tiqueteDesencolar= actual;
             tiqueteInicial=actual.getSiguiente();
              JOptionPane.showMessageDialog(null, "Tiquete atendido con exito", "Cola del bus", JOptionPane.INFORMATION_MESSAGE);
             return tiqueteDesencolar;
             

            }
         
         return null;
       
        }
       

    }
