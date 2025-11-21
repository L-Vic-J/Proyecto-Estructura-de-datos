package CompraTiquetes;

public class Pasajero {

    private String nombre;
    private String tipoServicio;
    private double pesoCarga; // solo si es tipo "Carga"

    public Pasajero(String nombre, String tipoServicio, double pesoCarga) {
        this.nombre = nombre;
        this.tipoServicio = tipoServicio;
        this.pesoCarga = pesoCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }
}
