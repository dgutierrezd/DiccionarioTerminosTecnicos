/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOElements;

import ELementos.Categoria;
import ELementos.Glosario;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Interface que se encarga de leer los archivos de texto.
 * @author Daniel Gutiérrez Duque
 * @author Sebastian Cordero Ramírez
 * @since 1.0
 */
public interface Lector {
    
    /**
     * Se leen objetos serializables.
     * @return Clase Glosario, control
     */
    public Glosario leerObjetos() throws FileNotFoundException, IOException, ClassNotFoundException;
}
