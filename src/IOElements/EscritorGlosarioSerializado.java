/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOElements;

import ELementos.Termino;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import ELementos.Glosario;

/**
 * Escribir objetos serializables.
 * @author Daniel Gutiérrez Duque
 * @author Sebastian Cordero Ramírez
 * @since 1.0
 */
public class EscritorGlosarioSerializado implements Escritor {
    
    
    @Override
    public void escribirObjetos(Glosario glosario) throws IOException, ClassNotFoundException  {
        
        FileOutputStream fos = new FileOutputStream("salida.datos");
 
        // Sobre él se construye un flujo de salida de objetos

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Se escriben los objetos (serializados) al disco a través del flujo anterior

        oos.writeObject(glosario);
    }
}
