
package Configuracion;


public class NodoGenerico <T> {


private T dato;
private NodoGenerico <T> siguiente;

    public NodoGenerico(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSiguiente(NodoGenerico<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public NodoGenerico<T> getSiguiente() {
        return siguiente;
    }

    
    

    
}
