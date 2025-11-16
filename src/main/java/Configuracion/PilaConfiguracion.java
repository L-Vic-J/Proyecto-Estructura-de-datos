package Configuracion;

import CompraTiquetes.NodoGenerico;
import CompraTiquetes.NodoGenerico;


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

    public NodoGenerico <Terminal> buscarDato(String nombre) {

        if (cima == null) {
            System.out.println("La pila esta vacia");
            return null;
        } else{
            NodoGenerico <Terminal> actual= (NodoGenerico <Terminal>)cima;
            while (actual!=null && !actual.getDato().getNombre().equals(nombre)){
                actual= actual.getSiguiente();
            }
             
            return actual;
            
        }

    }
    
      public NodoGenerico <Terminal> buscarTipoBus(String nombre) {
          

        if (cima == null) {
            System.out.println("La pila esta vacia");
            return null;
        } else{
            NodoGenerico <Terminal> actual= (NodoGenerico <Terminal>)cima;
            while (actual!=null && !actual.getDato().getNombre().equals(nombre)){
                actual= actual.getSiguiente();
            }
             
            return actual;
            
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
    
    
    //Cambio: Se crea metodo para calcular el tamaño de la pila
   public int pilaSize (){
        int contador=0;
        if (cima==null){
            System.out.println("La pila esta vacia");
            contador=-1;
            return contador;
        }else{
            NodoGenerico <T> actual= cima;
            while (actual!=null){
                contador++;
                actual=actual.getSiguiente();
            }
            
            return contador;
        }
    
    }
    
   
   //Cambio: Se crea metodo para almacenar en arreglo ya sea terminales o usuarios
    public NodoGenerico<T>[] almacedarDatos (){
        
        if (cima==null){
            System.out.println("La pila esta vacia");
        }else{
            int indice=0;
            NodoGenerico <T> actual= cima;
            NodoGenerico<T>[] listaGenerica= new NodoGenerico [pilaSize()];
            while (actual!=null){
                listaGenerica [indice]=actual;
                indice++;
                actual= actual.getSiguiente();
            }
            return listaGenerica;
            
        }
        
        return null;
    }
    
    

    }
    

     

