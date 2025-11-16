
package Configuracion;

import Configuracion.Bus;
import java.util.Objects;

public class Terminal{
    String nombreTerminal;
    int cantidadBuses;
    ColaBus cola= new ColaBus();

  

    public Terminal(String nombre,int cantidad) {
        
        this.cola= new ColaBus();
        this.nombreTerminal = nombre;
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

    
    // Cambio: Se incorpora equals
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Terminal other = (Terminal) obj;
        return Objects.equals(this.nombreTerminal, other.nombreTerminal);
    }
    
    
    
    
    
    //  Cambio: Se incorporan setters y gettes

    public String getNombre() {
        return nombreTerminal;
    }

    public int getCantidadBuses() {
        return cantidadBuses;
    }

    public ColaBus getCola() {
        return cola;
    }

    public void setNombre(String nombre) {
        this.nombreTerminal = nombre;
    }

    public void setCantidadBuses(int cantidadBuses) {
        this.cantidadBuses = cantidadBuses;
    }

    public void setCola(ColaBus cola) {
        this.cola = cola;
    }
    
    

    
    

    @Override
    public String toString() {
        return "Nombre:"+ nombreTerminal+"\n"+
                "Buses:"+cola.Mostrar();
    }


     
    
  
    
    
}
