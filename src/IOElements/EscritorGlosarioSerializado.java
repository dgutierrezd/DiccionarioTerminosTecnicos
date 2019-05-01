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
public class EscritorGlosarioSerializado {
    
    Glosario  glosario = new Glosario();
    
    public void escribirObjetos(String categoria) throws IOException, ClassNotFoundException {
        Termino terminoUno = new Termino("POO", "Programcion Orientada a Objetos");
        Termino terminoDos = new Termino("MVC", "Modelo Vista Controlador");
        
        FileOutputStream fos = new FileOutputStream(glosario.determinarRuta(categoria));
        
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(terminoUno);
        oos.writeObject(terminoDos);
    }
    
    // Este método va en la vista.
    public void determinarCategoria() throws IOException, FileNotFoundException, ClassNotFoundException {
        escribirObjetos("Sistemas Distribuidos");
    }
}
