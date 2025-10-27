package Configuracion.clases;

public class Tiquetes {

    private Tiquetes siguiente;
    private String nombre;
    private int id;
    private int edad;
    private double moneda;
    private String horaCompra;
    private String horaAbordaje;
    private String servicio = "NA";
    private String tipoBus;
    private String prioridad;

    public Tiquetes(Tiquetes siguiente, String nombre, int id, int edad, double moneda,
            String horaCompra, String horaAbordaje, String servicio, String tipoBus, String prioridad) {
        this.siguiente = siguiente;
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.moneda = moneda;
        this.horaCompra = horaCompra;
        this.horaAbordaje = horaAbordaje;
        this.servicio = servicio;
        this.tipoBus = tipoBus;
        this.prioridad = prioridad;
    }

    // Getters y Setters
    public Tiquetes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tiquetes siguiente) {
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = horaCompra;
    }

    public String getHoraAbordaje() {
        return horaAbordaje;
    }

    public void setHoraAbordaje(String horaAbordaje) {
        this.horaAbordaje = horaAbordaje;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public enum prioridadBus {
        VIP,
        Regular,
        Carga,
        Ejecutivo,
    }
    
    public enum tipoBus {
        P,
        D,
        N
        
    } 

}
