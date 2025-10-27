package Configuracion.Estructuras;

import Configuracion.clases.Tiquetes;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ColaPrioridades {

    private Tiquetes tiqueteInicio;
    private Tiquetes tiqueteFin;

    public ColaPrioridades() {
        this.tiqueteInicio = null;
        this.tiqueteFin = null;
    }

    //  Encolar con prioridad y hora automática
    public void Encolar(String nombre, int id, int edad, double moneda, String servicio, String tipoBus, String prioridad) {

        // Generar hora actual del sistema
        String horaActual = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        // Crear nuevo tiquete con hora de compra actual
        Tiquetes nuevo = new Tiquetes(null, nombre, id, edad, moneda, horaActual, "Pendiente", servicio, tipoBus, prioridad);

        // Si la cola está vacía
        if (tiqueteInicio == null) {
            tiqueteInicio = nuevo;
            tiqueteFin = nuevo;
            return;
        }

        // Insertar según prioridad simple (Alta,  Media,  Baja)
        if (prioridad.equalsIgnoreCase("Alta")) {
            // Insertar al inicio
            nuevo.setSiguiente(tiqueteInicio);
            tiqueteInicio = nuevo;
        } else if (prioridad.equalsIgnoreCase("Media")) {
            // Insertar después del último "Alta"
            Tiquetes actual = tiqueteInicio;
            Tiquetes anterior = null;
            while (actual != null && actual.getPrioridad().equalsIgnoreCase("Alta")) {
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if (anterior == null) {
                nuevo.setSiguiente(tiqueteInicio);
                tiqueteInicio = nuevo;
            } else {
                anterior.setSiguiente(nuevo);
                nuevo.setSiguiente(actual);
            }
        } else {
            // Insertar al final (Baja)
            tiqueteFin.setSiguiente(nuevo);
            tiqueteFin = nuevo;
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
