package Configuracion;


public class PilaConfiguracion <T> {
    
    
    NodoGenerico <T> cima;

    public PilaConfiguracion(NodoGenerico cima) {
        this.cima = null;
    }
    
    public void push (T dato){
            NodoGenerico nuevoNodo= new NodoGenerico (dato);
            nuevoNodo.setSiguiente(cima);
            cima=nuevoNodo;    
    }
    
    public void peek (){
        if(cima==null){
            System.out.println("La pila esta vacia");
        }else{
            cima.getDato();
        }
    }
    
    public T pop (){
        if (cima==null){
            System.out.println("La pila esta vacia");
            return null;
        }else{
            T dato=cima.getDato();
            cima= cima.getSiguiente();
            return dato;  
        }
                
    }
    
    
}
