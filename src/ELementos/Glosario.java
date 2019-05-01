/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ELementos;

import GUI.Agregar;
import GUI.Editar;
import GUI.PrincipalView;
import GUI.Remover;
import GUI.Ver;
import IOElements.EscritorGlosarioSerializado;
import IOElements.LectorGlosarioSerializado;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JDialog;

/**
 *
 * @author dgutierrezd
 */
public class Glosario {
    
    private String rutaArchivo;
    private ArrayList<Termino> terminos = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Glosario glosario = new Glosario();
        PrincipalView vistaPrincipal = new PrincipalView(glosario);
        
//        EscritorGlosarioSerializado escritorGlosarioSerializado = new EscritorGlosarioSerializado();
//        LectorGlosarioSerializado lectorGlosarioSerializado = new LectorGlosarioSerializado();
//        
//        escritorGlosarioSerializado.determinarCategoria();
//        lectorGlosarioSerializado.conocerCategoria();
        
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
    
    
    public void determinarOpcionesVista(PrincipalView vistaPrincipal,int opcion){
        
        switch(opcion){
            case 1:
                JDialog dialogoVer = new Ver(vistaPrincipal, true);
            break;
            case 2:
                JDialog dialogoAgregar = new Agregar(vistaPrincipal, true);
            break;
            case 3:
                JDialog dialogoEditar = new Editar(vistaPrincipal, true);
            break;
            case 4:
                JDialog dialogoRemover = new Remover(vistaPrincipal, true);
            break;
            
            
        }
    }
}
