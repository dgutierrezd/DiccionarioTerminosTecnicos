/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOElements;

import java.io.IOException;

/**
 *
 * @author dgutierrezd
 */
public interface Escritor {
    public void escribirObjetos(String categoria, String expresion, String significado) throws IOException, ClassNotFoundException ;
}
