
package Configuracion;


public class Terminal {
    String nombre;
    int cantidadBuses;
    Bus busPreferencial;
    Bus busDirecto;
    Bus buses [];
  

    public Terminal(String nombre,int cantidad) {
        this.nombre = nombre;
        this.cantidadBuses=cantidad;
        this.buses = new Bus [cantidadBuses];
        this.busPreferencial= new Bus ("Preferencial");
        this.busDirecto= new Bus ("Directo");
        buses [0]=this.busPreferencial;
        buses [1]=this.busDirecto;        
        
        for (int i=2;i<=cantidadBuses;i++){
            buses [i]= new Bus ("Normal");  
        }
    }
       
    
}
