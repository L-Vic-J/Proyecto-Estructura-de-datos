
package Configuracion;

import Tiquetes.Tiquetes;


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

        if (inspectorDisponible && tiqueteInicial == null) {
            tiquete.setEstado("Atendido");

        }

        tiquete.setEstado("En espera");

        if (tiqueteFinal != null) {
            tiqueteFinal.setSiguiente(tiquete);
        }

        tiqueteFinal = tiquete;

        if (tiqueteInicial == null) {
            tiqueteInicial = tiquete;
        }

    }
    
    
 
    
}
