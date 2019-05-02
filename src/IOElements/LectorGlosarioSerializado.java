/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOElements;

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
    
    Glosario  glosario = new Glosario();
    
    // La categoría se lee en la Vista.
    @Override
    public void leerObjetos(String expresion) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("TerminosGuardados/" + expresion + ".datos");
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Termino termino = (Termino) ois.readObject();
        
        System.out.println("Palabra: " + termino.obtExpresion() + "; Significado: " + termino.obtSignificado() + " Categoria: " + termino.getCategorias());
    }
    
}
