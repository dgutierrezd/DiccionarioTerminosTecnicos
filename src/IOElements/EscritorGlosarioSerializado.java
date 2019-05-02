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
 *
 * @author dgutierrezd
 */
public class EscritorGlosarioSerializado implements Escritor {
    
    Glosario  glosario = new Glosario();
    
//    // Este método va en la vista.
//    public void determinarCategoria() throws IOException, FileNotFoundException, ClassNotFoundException {
//        escribirObjetos("Sistemas Distribuidos", nu);
//    }

    @Override
    public void escribirObjetos(String categoria, String expresion, String significado) throws IOException, ClassNotFoundException  {
        Termino termino = new Termino(expresion, significado);
        
        FileOutputStream fos = new FileOutputStream(expresion + ".datos");
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(termino);
    }
}
