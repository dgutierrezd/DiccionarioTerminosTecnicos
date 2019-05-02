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
    
    public void determinarOpcionesDialogo(JDialog dialogo,int opcion,String expresion,String significado,String categoria) throws IOException, ClassNotFoundException{
        switch(opcion){
            case 1:
                EscritorGlosarioSerializado escritorGlosarioSerializado = new EscritorGlosarioSerializado();
                LectorGlosarioSerializado lectorGlosarioSerializado = new LectorGlosarioSerializado();
                Categoria newCategoria = null;
                Termino newTermino = new Termino(expresion, significado);
                switch(categoria){
                    case "Sistemas Distribuidos":
                        newCategoria = new SistemasDistribuidos();
                    break;
                    case "Sistemas Embebidos":
                        newCategoria = new SistemasEmbeidos();
                    break;
                    case "Bases de Datos":
                        newCategoria = new BasesDeDatos();
                    break;
                    case "Redes":
                        newCategoria = new Redes();
                    break;
                    case "Programación Orientada a Objetos":
                        newCategoria = new ProgramacionOrientadaAObjetos();
                    break;
                    case "Programación Móvil":
                        newCategoria = new ProgramacionMovil();
                    break;
                    case "Programación Web":
                        newCategoria = new ProgramacionWeb();
                    break;
                }
                newTermino.getCategorias().add(newCategoria);
                this.terminos.add(newTermino);
                escritorGlosarioSerializado.escribirObjetos(newTermino);
            break;
            case 2:
                dialogo.dispose();
            break;
        }
        for (int i = 0; i < terminos.size(); i++) {
            System.out.println(terminos.get(i).obtExpresion());
            System.out.println(terminos.get(i).obtSignificado());
            for (int j = 0; j < terminos.get(i).getCategorias().size(); j++) {
                System.out.println(terminos.get(i).getCategorias().get(j).getClass().getSimpleName());
            }
            
        }
    }
}
