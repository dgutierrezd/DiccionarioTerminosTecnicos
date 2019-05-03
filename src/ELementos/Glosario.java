/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ELementos;

import GUI.Agregar;
import GUI.Editar;
import GUI.PrincipalView;
import GUI.Ver;
import IOElements.Escritor;
import IOElements.EscritorGlosarioSerializado;
import IOElements.Lector;
import IOElements.LectorGlosarioSerializado;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dgutierrezd
 */
public class Glosario implements Serializable{
    
    private ArrayList<Termino> terminos = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        Lector lectorGlosarioSerializado = new LectorGlosarioSerializado();
        Glosario glosario = lectorGlosarioSerializado.leerObjetos();
//        Glosario glosario = new Glosario();
        PrincipalView vistaPrincipal = new PrincipalView(glosario);
    }
    
    public void determinarOpcionesVista(PrincipalView vistaPrincipal,int opcion) {
        
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
                try{
                    escribirSerializable(this);;
                    System.exit(0);
                }catch(IOException ioe){
                    System.out.println("error io");
                }catch(ClassNotFoundException cllas){
                    System.out.println("error classmNotFound");
                }
                
            break;
        }
    }
    
    public void determinarOpcionesAgregar(JDialog dialogo,int opcion,String expresion,String significado,String categoria) throws IOException, ClassNotFoundException{
        switch(opcion){
            case 1:
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
    
    public void determinarOpcionesVer(JDialog dialog, int opcion, JTable tabla) throws IOException, FileNotFoundException, ClassNotFoundException {

        String[][] matrix = new String[terminos.size()][1];
        for (int i = 0; i < terminos.size(); i++) {
            matrix[i][0] = terminos.get(i).obtExpresion();
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            matrix,
            new String [] {
                "Nombre termino:"
            }
        ));
    
//        switch(opcion) {
//            case 1:
//                
//            break;
//        }
    }
    
    public void escribirSerializable(Glosario glosario) throws IOException, ClassNotFoundException {
        Escritor escritorGlosarioSerializado = new EscritorGlosarioSerializado();
        escritorGlosarioSerializado.escribirObjetos(glosario);
    }

    public ArrayList<Termino> getTerminos() {
        return terminos;
    }
    
}
