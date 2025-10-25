
package Configuracion.clases;

import Configuracion.clases.Bus;
import Configuracion.Estructuras.ColaBus;

public class Terminal {
    String nombre;
    int cantidadBuses;
    ColaBus cola= new ColaBus();

  

    public Terminal(String nombre,int cantidad) {
        this.cola= new ColaBus();
        this.nombre = nombre;
        this.cantidadBuses=cantidad;
        
        Bus busPreferencial;
        Bus busDirecto;
       
        cola.Encolar(busPreferencial=new Bus ("Preferencial"));
        
        cola.Encolar(busDirecto=new Bus ("Directo"));
        
        for (int i=2;i<=cantidadBuses-1;i++){
            Bus busNormal= new Bus ("Normal");  
            cola.Encolar(busNormal);
        }  

         
    }

    @Override
    public String toString() {
        return "Nombre:"+ nombre+"\n"+
                "Buses:"+cola.Mostrar();
    }
     
    
  
    
    
}
