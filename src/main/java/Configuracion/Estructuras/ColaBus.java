
package Configuracion.Estructuras;

import Configuracion.objetos.Bus;


public class ColaBus {
    
    Bus busInicial;
    Bus busFinal;

    public ColaBus() {
        this.busInicial = busInicial;
        this.busFinal = busFinal;
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
    
    
    
}
