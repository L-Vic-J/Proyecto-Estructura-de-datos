
package CompraTiquetes;

import AtencionDeClientes.GestorDeAtencion;


public class GestorDeCompras {
    
    private ColaPrioridades colaTiquetes = new ColaPrioridades();
    private SerializacionCola serializacion = new SerializacionCola();
     private GestorDeAtencion gestorAtencion; 

    public GestorDeCompras(GestorDeAtencion gestorAtencion) {
       this.gestorAtencion=gestorAtencion;
    }
    
   
    public GestorDeCompras(ColaPrioridades colaTiquetes) {
        this.colaTiquetes=colaTiquetes;
    }

    
    
   
  public void agregarTiquete (Tiquetes tiquete){
      colaTiquetes.Encolar(tiquete);  
  }
    
    
  public void Serializar (){
      
      serializacion.serializarPila(colaTiquetes, "tiquetes");
      
      
  }
  
  
  public void enviarTiquete (Tiquetes tiquete){
      gestorAtencion.encolarEnBus(tiquete);  
  }
    
    
    
 
  
  
  
}
