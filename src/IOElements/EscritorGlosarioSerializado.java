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
    
    @Override
    public void escribirObjetos(Termino termino) throws IOException, ClassNotFoundException  {
        // Termino termino = new Termino(expresion, significado);
        
        FileOutputStream fos = new FileOutputStream("TerminosGuardados/" + termino.obtExpresion() + ".datos");
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(termino);
    }
}
