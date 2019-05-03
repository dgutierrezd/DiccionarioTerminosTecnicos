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
 *
 * @author dgutierrezd
 */
public interface Lector {
    public Glosario leerObjetos() throws FileNotFoundException, IOException, ClassNotFoundException;
}
