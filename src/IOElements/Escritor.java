/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOElements;

import ELementos.Glosario;
import ELementos.Termino;
import java.io.IOException;

/**
 * Interface que se encarga de escribir en archivos de texto.s
 * @author Daniel Gutiérrez Duque
 * @author Sebastian Cordero Ramírez
 * @since 1.0
 */
public interface Escritor {
    
    /**
     * Se escribe objetos serializables.
     * @param glosario Clase control.
     */
    public void escribirObjetos(Glosario glosario) throws IOException, ClassNotFoundException ;
}
