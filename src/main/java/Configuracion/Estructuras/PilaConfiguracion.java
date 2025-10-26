package Configuracion.Estructuras;

import Configuracion.Estructuras.NodoGenerico;


public class PilaConfiguracion <T> {
    
    
    private NodoGenerico <T> cima;

    public PilaConfiguracion () {
        this.cima = null;
    }
    
    public void push (T newDato){
            NodoGenerico<T> nuevoNodo= new NodoGenerico (newDato);
            nuevoNodo.setSiguiente(cima);
            cima=nuevoNodo;    
    }
    
    public T peek (){
        T dato=null;
        if(cima==null){
            System.out.println("La pila esta vacia");
            return dato;
        }else{
           dato= cima.getDato();
           return dato;
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
    
    
    public String Mostrar (){
        
        StringBuilder sb= new StringBuilder ();
        NodoGenerico <T> actual= cima;
        while (actual!=null){
            sb.append(actual.getDato()).append(",");
            actual= actual.getSiguiente();   
        }
     
        return sb.toString();
        
        
        
    }
    
    
}
