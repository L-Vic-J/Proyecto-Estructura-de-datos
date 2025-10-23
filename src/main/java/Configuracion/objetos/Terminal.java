
package Configuracion.objetos;

import Configuracion.objetos.Bus;
import Configuracion.Estructuras.ColaBus;

public class Terminal {
    String nombre;
    int cantidadBuses;
    Bus busPreferencial;
    Bus busDirecto;
    ColaBus cola= new ColaBus();

  

    public Terminal(String nombre,int cantidad) {
        ColaBus cola= new ColaBus();
        this.nombre = nombre;
        this.cantidadBuses=cantidad;
        this.busPreferencial= new Bus ("Preferencial");
        this.busDirecto= new Bus ("Directo");
      
        cola.Encolar(busPreferencial);
        cola.Encolar(busDirecto);
        
        for (int i=2;i<=cantidadBuses;i++){
            Bus busNormal= new Bus ("Normal");  
            cola.Encolar(busNormal);
        }
        
        this.cola=cola;
    }

    @Override
    public String toString() {
        return "Nombre:"+ nombre+"\n"+
               cola.Desencolar();
    }
     
    
    
    
}
