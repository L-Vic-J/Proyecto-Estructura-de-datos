package AtencionDeClientes;

import CompraTiquetes.NodoGenerico;
import CompraTiquetes.Tiquetes;
import CompraTiquetes.Pasajero;
import Configuracion.Bus;
import Configuracion.ColaBus;
import Configuracion.ColaTiquetes;
import Configuracion.Configuracion;
import Configuracion.PilaConfiguracion;
import Configuracion.SerializacionPila;
import Configuracion.Terminal;
import javax.swing.JOptionPane;

public class GestorDeAtencion {
    private ColaPasajeros fila;
    private Inspector inspector;
    private Bus bus;

    SerializacionPila serializacion;
    Configuracion configuracion = new Configuracion();
    PilaConfiguracion<Terminal> pilaTerminales;

    public GestorDeAtencion() {
        
        this.configuracion = configuracion.deserializar();
        this.pilaTerminales = configuracion.getPilaTerminal();
    }
    
    public GestorDeAtencion(Bus bus){
        this.bus = bus;
        this.fila = new ColaPasajeros();
        this.inspector = new Inspector();
    }
    
    public void agregarPasajeroAfila(Pasajero p ){
        fila.encolar(p);
    }
    
    public void procesarFila(){
        while(!fila.estaVacia()){
            Pasajero actual = fila.desencolar();
            
            boolean paga = inspector.revisarPasajero(actual);
            
            if (paga){
                actual.setEstado("Atendido");
                bus.subirPasajero(actual);
                System.out.println("Subio al bus: " + actual.getNombre());
            }else{
                System.out.println("Rechazo el pago y fue elimando: " + actual.getNombre());
            }
        }
    }

    public void encolarEnBus(Tiquetes tiquete) {

        String nombreTerminal = tiquete.getTerminal();
        String tipoBus = tiquete.getTipoBus();

        NodoGenerico<Terminal> terminal = pilaTerminales.buscarDato(nombreTerminal);
        ColaBus colaBus = terminal.getDato().getCola();

        Bus bus = colaBus.buscarBus(tipoBus);

        bus.getColaTiquetes().encolar(tiquete);

        
       

        JOptionPane.showMessageDialog(null, "Pasajero agregado a cola del bus " + bus.getTipo() + " de la terminal " + terminal.getDato().getNombre(), "Cola actualizada", JOptionPane.INFORMATION_MESSAGE);

    }

    public Bus[] cargarBuses(String nombreTerminal) {

        NodoGenerico<Terminal> terminal = pilaTerminales.buscarDato(nombreTerminal);
        ColaBus colaBus = terminal.getDato().getCola();

        Bus[] buses = new Bus[colaBus.longitud()];
        buses = colaBus.almacenarBuses();

        return buses;
    }

    public Configuracion getConfiguracion() {
        return configuracion;
    }

    public PilaConfiguracion<Terminal> getPilaTerminales() {
        return pilaTerminales;
    }

    public void setConfiguracion(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void setPilaTerminales(PilaConfiguracion<Terminal> pilaTerminales) {
        this.pilaTerminales = pilaTerminales;
    }

}
