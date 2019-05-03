/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOElements;

import ELementos.Categoria;
import ELementos.Termino;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import ELementos.Glosario;

/**
 *
 * @author dgutierrezd
 */
public class LectorGlosarioSerializado implements Lector {

    @Override
    public Glosario leerObjetos() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("salida.datos");
 
        // Sobre él se construye un flujo de entrada de objetos

        ObjectInputStream ois = new ObjectInputStream(fis);


        return (Glosario) ois.readObject();        
    }
    
    
    
    
}
