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
 *
 * @author dgutierrezd
 */
public interface Escritor {
    public void escribirObjetos(Glosario glosario) throws IOException, ClassNotFoundException ;
}
