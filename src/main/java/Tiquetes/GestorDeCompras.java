
package Tiquetes;


public class GestorDeCompras {
    
    private ColaPrioridades colaTiquetes = new ColaPrioridades();
    SerializacionCola serializacion = new SerializacionCola();

    public GestorDeCompras() {
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
    
    
    
 
  
  
  
}
