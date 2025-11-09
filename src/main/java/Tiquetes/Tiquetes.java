package Tiquetes;

public class Tiquetes {

    
    // Cambio: Se incluye atributo terminal
    private Tiquetes siguiente;
    private String nombre;
    //Cambio: El id se pone auto incremental, se agrega atributo precio
    private int id=0;
    private int edad;
    private String moneda;
    private String horaCompra;
    private String horaAbordaje;
    private String servicio = "NA";
    private String tipoBus;
    private String terminal;
    private String estado;
    private double precio;

    
    
    //Cambio: Se pone siguiente como null, se reemplaza prioridad por el tipo de bus, ID se pone autoincremental
    public Tiquetes(String nombre, int edad, String moneda,
            String horaCompra, String servicio, String tipoBus,String terminal) {
        this.siguiente = null;
        this.nombre = nombre;
        this.id = id++;
        this.edad = edad;
        this.moneda = moneda;
        this.horaCompra = horaCompra;
        this.horaAbordaje = horaAbordaje;
        this.servicio = servicio;
        this.tipoBus=tipoBus;
        this.terminal=terminal;
        this.precio=0.0;
        this.estado="Pendiente";
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

    public String getTerminal() {
        return terminal;
    }

    public String getPrioridad() {
        return tipoBus;
    }

    public double getPrecio() {
        return precio;
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

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(String horaCompra) {
        this.horaCompra = horaCompra;
    }

    public void setPrioridad(String prioridad) {
        this.tipoBus = prioridad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    
    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
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
