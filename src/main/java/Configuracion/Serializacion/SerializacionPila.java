
package Configuracion.Serializacion;

import Configuracion.Estructuras.PilaConfiguracion;
import Configuracion.clases.Configuracion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;


public class SerializacionPila {
    //Pila+nombre de archivo
    //Equivalente a guardar en el JSON
     public void serializarPila(PilaConfiguracion pilaTerminal,PilaConfiguracion pilaUsuarios, String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            
            Configuracion configuracion= new Configuracion(pilaTerminal,pilaUsuarios);
            gson.toJson(configuracion,writer);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    //Cargar desde el JSON
    public Configuracion desseralizarPila(String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileReader reader = new FileReader(archivo)) {   
            return gson.fromJson(reader, Configuracion.class);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
