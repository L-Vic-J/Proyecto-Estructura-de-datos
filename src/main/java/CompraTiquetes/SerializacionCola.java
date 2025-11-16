
package CompraTiquetes;

import Configuracion.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;







public class SerializacionCola {
    
    //Pila+nombre de archivo
    //Equivalente a guardar en el JSON
    
    
    
    
     public SerializacionCola(){
    }

    public void serializarPila(ColaPrioridades tiqueteAlmacenados, String archivo) {
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            
            GestorDeCompras tiquetes= new GestorDeCompras(tiqueteAlmacenados);
            gson.toJson(tiquetes,writer);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Cargar desde el JSON
    public GestorDeCompras desseralizarPila(String archivo){
        Gson gson = new GsonBuilder().create();
        try (FileReader reader = new FileReader(archivo)) {   
            return gson.fromJson(reader, GestorDeCompras.class);            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
