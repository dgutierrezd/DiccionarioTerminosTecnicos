/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * Clase de excepción cuando hay una categoría que no existe.
 * @author Daniel Gutiérrez Duque
 * @author Sebastian Cordero Ramírez
 * @since 1.0
 */
public class CategoriaInexistenteException extends RuntimeException {
    
    public CategoriaInexistenteException(String mensaje) {
        super(mensaje);
    }
    
    public CategoriaInexistenteException() {
        
    }
}
