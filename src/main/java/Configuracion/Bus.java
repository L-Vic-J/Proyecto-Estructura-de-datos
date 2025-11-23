package Configuracion;

import CompraTiquetes.Pasajero;

public class Bus {
    
    
    //Atributos de clase
     
    String tipo;
    Bus bus;
    ColaTiquetes colaTiquetes;

    public Bus() {
    }


    public Bus(String tipo) {
        this.tipo = tipo;
        this.bus = null;
        this.colaTiquetes= new ColaTiquetes();
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

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setColaTiquetes(ColaTiquetes colaTiquetes) {
        this.colaTiquetes = colaTiquetes;
    }

    public Bus getBus() {
        return bus;
    }

    public ColaTiquetes getColaTiquetes() {
        return colaTiquetes;
    }
    
    

    @Override
    public String toString() {
        return "Tipos de bus:"+tipo;
    }

    public void subirPasajero(Pasajero actual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
  
    
  
    
    
    
    
}
