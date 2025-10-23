
package Configuracion;

import Configuracion.Estructuras.PilaConfiguracion;
import Configuracion.objetos.Terminal; 
import Configuracion.objetos.Usuario;

public class ProyectoED {

    public static void main(String[] args) {
       
        Terminal terminal= new Terminal ("San Jose",5);
         
        
        Usuario usuario= new Usuario ("Victor","Hola");
        
        PilaConfiguracion <Terminal> pilaBus= new PilaConfiguracion <>();
        
        pilaBus.push(terminal);
        
        PilaConfiguracion <Usuario> pilaUsuario= new PilaConfiguracion <>();
       
        pilaUsuario.push(usuario);
       
         
         String pilaBusString=pilaBus.Mostrar();
         String pilaUsuarioString=pilaUsuario.Mostrar();
         
          System.out.println("Valore de la Pila terminal:"+pilaBusString);
          System.out.println("Valore de la Pila usuario:"+pilaUsuarioString);
        
 
        
    }
}
