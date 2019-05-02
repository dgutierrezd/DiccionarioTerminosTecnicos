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
    public void leerObjetos(String categoria) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(glosario.determinarRuta(categoria));
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Termino recuperada1 = (Termino) ois.readObject();
        Termino recuperada2 = (Termino) ois.readObject();
        
        System.out.println("Palabra: " + recuperada1.obtExpresion() + "; Significado: " + recuperada1.obtSignificado());
        System.out.println("Palabra: " + recuperada2.obtExpresion() + "; Significado: " + recuperada2.obtSignificado());
    }
    
    // Éste método va en la vista.
    public void conocerCategoria() throws IOException, FileNotFoundException, ClassNotFoundException {
        leerObjetos("Sistemas Distribuidos");
    }
    
}
