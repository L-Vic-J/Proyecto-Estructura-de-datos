package Configuracion;

public class Bus {
    
    
    //Atributos de clase
     
    String tipo;
    Bus bus;
    ColaTiquetes colaTiquetes= new ColaTiquetes();
    
  
    public Bus(String tipo) {
        this.tipo = tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setSiguiente(Bus bus) {
        this.bus = bus;
    }

    public Bus getSiguiente() {
        return bus;
    }

    @Override
    public String toString() {
        return "Tipos de bus:"+tipo;
    }
    
    
    
    
}
