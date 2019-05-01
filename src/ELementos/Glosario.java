/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ELementos;

import IOElements.EscritorGlosarioSerializado;
import IOElements.LectorGlosarioSerializado;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author dgutierrezd
 */
public class Glosario {
    
    private String rutaArchivo;
    private ArrayList<String> terminos = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EscritorGlosarioSerializado escritorGlosarioSerializado = new EscritorGlosarioSerializado();
        LectorGlosarioSerializado lectorGlosarioSerializado = new LectorGlosarioSerializado();
        
        escritorGlosarioSerializado.determinarCategoria();
        lectorGlosarioSerializado.conocerCategoria();
        
    }
    
    public String determinarRuta(String categoria) {
        
        switch(categoria) {
            case "Sistemas Distribuidos":
                rutaArchivo = "distribuidos.datos";
            break;
            
            case "Sistemas Embebidos":
                rutaArchivo = "embeidos.datos";
            break;
            
            case "Bases de Datos":
                rutaArchivo = "basesDatos.datos";
            break;
            
            case "Redes":
                rutaArchivo = "redes.datos";
            break;
            
            case "Programación Orientada a Objetos":
                rutaArchivo = "poo.datos";
            break;
            
            case "Programación Móvil":
                rutaArchivo = "movil.datos";
            break;
            
            case "Programación Web":
                rutaArchivo = "web.datos";
            break;
            
            default:
                System.out.println("No existe el archivo.");
                // En este proyecto no he implementado excepciones.
                // throw new categoriaNoEncontrada
                
        }
        System.out.println(rutaArchivo);
        return rutaArchivo;
    }
}
