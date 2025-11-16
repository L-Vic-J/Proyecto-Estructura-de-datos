
package Configuracion;

import Configuracion.Terminal;
import CompraTiquetes.NodoGenerico;
import Configuracion.SerializacionPila;


public class Configuracion {
    
    //Pilas 
    
    public PilaConfiguracion <Terminal> pilaTerminal = new PilaConfiguracion <> ();
    public PilaConfiguracion <Usuario> pilaUsuario= new PilaConfiguracion <> ();
    SerializacionPila serializacionPila= new SerializacionPila ();

    public Configuracion() {
    }
 

    //Constructor
    
    public Configuracion(PilaConfiguracion <Terminal> pilaTerminal , PilaConfiguracion <Usuario> pilaUsuario) {
        this.pilaTerminal = pilaTerminal;
        this.pilaUsuario = pilaUsuario;
    }

    
    //Metodos para agregar a pilas
    public void agregarNodoTerminal (Terminal nodo){
        pilaTerminal.push(nodo);     
    }
    
    public void agregarNodoUsuario (Usuario nodo){
        pilaUsuario.push(nodo);     
    }
    
    
    

     //Metodo para serializar
    
    public void Serializar (){
        

        serializacionPila.serializarPila(pilaTerminal, pilaUsuario, "config");
        
    }
    
    
    //Metodo para deserializar
    
    /*public void deserializar (){
        
        Configuracion configuracion= serializacionPila.desseralizarPila("config");
        
        pilaTerminal=configuracion.getPilaTerminal();
        pilaUsuario= configuracion.getPilaUsuario();
        
        System.out.println("El contenido de las pila terminal es:"+ pilaTerminal.Mostrar());
        System.out.println("El contenido de las pila usuario es:"+pilaUsuario.Mostrar());
    } */
    
    
    
    public Configuracion deserializar (){
        Configuracion configuracion= new Configuracion();
        configuracion= serializacionPila.desseralizarPila("config");
        
        return configuracion;
        
    }
    
    
    
    
    
    //Getters
        
    public PilaConfiguracion<Terminal> getPilaTerminal() {
        return pilaTerminal;
    }

    public PilaConfiguracion<Usuario> getPilaUsuario() {
        return pilaUsuario;
    }
    
}
