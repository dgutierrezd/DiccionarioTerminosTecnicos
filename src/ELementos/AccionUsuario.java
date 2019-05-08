/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ELementos;

import java.util.ArrayList;

/**
 * Clase abstracta de las acciones que desea realizar el usario.
 * @author Daniel Gutiérrez 
 * @author Sebastián Cordero
 * @since 1.0
 */

public abstract class AccionUsuario {
    
    /**
     * Se realiza la acción determinada por el usuario.
     * @param expresion Palabra o término guardado.
     * @param descripcion significado del término.
     * @param categoria Categoría a la cual pertenece el término.
     * @param terminos ArrayList con los términos guardados.
     */
    public abstract void ejecutar(String expresion,String descripcion,String categoria,ArrayList terminos);
}
