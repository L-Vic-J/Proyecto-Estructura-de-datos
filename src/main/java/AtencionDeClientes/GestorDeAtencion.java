
package AtencionDeClientes;

import Configuracion.Bus;
import Configuracion.Configuracion;
import Configuracion.PilaConfiguracion;
import Configuracion.Terminal;
import Tiquetes.NodoGenerico;


public class GestorDeAtencion {
    
 
 private String tipoBus;
 private String terminal;
 Configuracion configuracion;
 

    public GestorDeAtencion(String tipoBus, String terminal) {
        this.tipoBus = tipoBus;
        this.terminal = terminal;
    }
    
    
 
    public void buscarTerminal (String terminalNombre){
        
        PilaConfiguracion <Terminal> pila= configuracion.getPilaTerminal();
        
        NodoGenerico<Terminal> terminal= pila.buscarTerminal(terminalNombre);
        
       
        Bus [] colasBuses= new Bus[terminal.getDato().getCola().longitud()];
        
       
        
        
    }
    
    
    
    
    
}
