
package Configuracion;

import Configuracion.Bus;
import javax.swing.JOptionPane;


public class ColaBus {
    
    Bus busInicial;
    Bus busFinal;
 
    public ColaBus() {
        this.busInicial = null;
        this.busFinal = null;
    }

    public ColaBus(Bus busInicial, Bus busFinal) {
        this.busInicial = busInicial;
        this.busFinal = busFinal;
    }
    
    
    
    
    public void Encolar (Bus bus){
        
        Bus nuevoBus= bus;
        if (busFinal!=null){
            busFinal.setSiguiente(nuevoBus);
        }
        busFinal=nuevoBus;
        
        if (busInicial==null){
            busInicial=nuevoBus;
        }
        
    }
    
    public Bus Desencolar (){
        Bus bus;
        if (busInicial==null){
            System.out.println("La cola esta vacia");
            bus=null;
            return bus;
        }else{
            bus= busInicial;
            busInicial=busInicial.getSiguiente();
            return bus;
        }
    }
    
    public String Mostrar (){
        
        Bus busActual= busInicial;
        StringBuilder sb= new StringBuilder ();
        while (busActual!=null){
            sb.append(busActual.getTipo()).append("--->");
            busActual=busActual.getSiguiente();
        }
        
        return sb.toString();
        
    }
    
    
    public Bus [] almacenarBuses (){
        
        if (busInicial==null){
            System.out.println("La cola esta vacia");
            
        }else{
            Bus actual= busInicial;
            Bus [] buses= new Bus [longitud ()];
            int indice = 0;
            while (actual!=null){
                buses [indice]= actual;
                actual=actual.getSiguiente();
                indice++;
            }
                return buses;
        }
        
       return null;
        
    }
    
    
    
    // Cambio: Se agrego metodo para retornar bus
    
  public Bus buscarBus (String tipoDeBus){
       if (busInicial==null){
            System.out.println("La cola esta vacia");
            return null;
            
        }else{
           Bus actual= busInicial;
           while (actual!=null  && !actual.getTipo().equals(tipoDeBus)){
            actual= actual.getSiguiente();
        }
           
           return actual;
       }
      
      
      
  }
  

    
  public int longitud (){
        
        
        if (busInicial==null){
            System.out.println("La cola esta vacia");
            return -1;
        }else{
            int contador=0;
            Bus actual= busInicial;
            
            while (actual!=null){
                contador++;
                actual=actual.getSiguiente();
            }
            
            
        return contador;
            
        }
        
    }
    
    
    
}
