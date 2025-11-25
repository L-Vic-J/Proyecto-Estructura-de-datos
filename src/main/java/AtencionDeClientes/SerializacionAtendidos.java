
package AtencionDeClientes;

import CompraTiquetes.ColaPrioridades;
import CompraTiquetes.GestorDeCompras;
import CompraTiquetes.Tiquetes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;

public class SerializacionAtendidos {
    

     public SerializacionAtendidos(){
    }

    public void serializarTiquete(Tiquetes tiquete, String archivo) {
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter(archivo)) {
            
            Tiquetes tiqueteSerializar= tiquete;
            gson.toJson(tiqueteSerializar,writer);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
}
