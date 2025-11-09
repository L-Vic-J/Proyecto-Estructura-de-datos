package Tiquetes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ColaPrioridades {

    private Tiquetes tiqueteInicio;
    private Tiquetes tiqueteFin;

    public ColaPrioridades() {
        this.tiqueteInicio = null;
        this.tiqueteFin = null;
    }

    
   
    //String nombre, int edad, String moneda,
    //String horaCompra, String servicio, String tipoBus,String terminal, double precio
    
    
    // Cambio: Como parametro se pasa un objeto de tipo tiquete
    public void Encolar(Tiquetes nuevo) {

       

        if (tiqueteInicio == null) {
            // El nuevo tiquete se convierte tanto en el inicio como en el fin de la cola
            tiqueteInicio = nuevo;
            tiqueteFin = nuevo;
            return; // Termina el método aquí
        }
        
        // Cambio: Se accede a los atributos del tiquete por sus getters

        if (nuevo.getTipoBus().equalsIgnoreCase("Preferencial")) {
            // Se inserta al inicio de la cola
            // El nuevo tiquete apunta al que actualmente está de primero
            nuevo.setSiguiente(tiqueteInicio);
            // Ahora el nuevo tiquete pasa a ser el primero
            tiqueteInicio = nuevo;
        } else if (nuevo.getTipoBus().equalsIgnoreCase("Directo")) {
            // Se debe insertar despues de los de prioridad "Alta", pero antes de los "Baja"

            // Se recorren los tiquetes desde el inicio
            Tiquetes actual = tiqueteInicio;   // Apunta al primer nodo
            Tiquetes anterior = null;          // Mantiene referencia al nodo anterior

            // Mientras haya tiquetes y su prioridad sea "Alta", seguimos avanzando
            while (actual != null && actual.getPrioridad().equalsIgnoreCase("Alta")) {
                anterior = actual;
                actual = actual.getSiguiente(); // Avanza al siguiente nodo
            }

            
            // Si 'anterior' sigue siendo null, significa que no había tiquetes "Alta"
            // Entonces el nuevo se inserta al inicio
            if (anterior == null) {
                nuevo.setSiguiente(tiqueteInicio);
                tiqueteInicio = nuevo;
            } // Si no, se inserta entre el último "Alta" y el siguiente (que puede ser Media o Baja)
            else {
                anterior.setSiguiente(nuevo);
                nuevo.setSiguiente(actual);
            }
        } //  Prioridad "Baja"
        else {
            // Se inserta al final de la cola, ya que los de prioridad baja van de últimos
            tiqueteFin.setSiguiente(nuevo); // El último tiquete actual apunta al nuevo
            tiqueteFin = nuevo;              // El nuevo pasa a ser el nuevo "final" de la cola
        }
    }

    // Desencolar (sacar el primero en la cola)
    public Tiquetes Desencolar() {
        if (tiqueteInicio == null) {
            System.out.println("La cola está vacía");
            return null;
        } else {
            Tiquetes temp = tiqueteInicio;
            tiqueteInicio = tiqueteInicio.getSiguiente();
            return temp;
        }
    }

    //  Mostrar contenido de la cola
    public String Mostrar() {
        if (tiqueteInicio == null) {
            return "Cola vacía";
        }

        Tiquetes actual = tiqueteInicio;
        StringBuilder sb = new StringBuilder();
        while (actual != null) {
            sb.append("[").append(actual.getNombre())
                    .append(" | Prioridad: ").append(actual.getPrioridad())
                    .append(" | HoraCompra: ").append(actual.getHoraCompra())
                    .append("]").append(" ---> ");
            actual = actual.getSiguiente();
        }
        sb.append("null");
        return sb.toString();
    }
    
    
    
    
    
}
