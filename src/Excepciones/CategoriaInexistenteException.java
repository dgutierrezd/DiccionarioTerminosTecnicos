/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author dgutierrezd
 */
public class CategoriaInexistenteException extends RuntimeException {
    
    public CategoriaInexistenteException(String mensaje) {
        super(mensaje);
    }
    
    public CategoriaInexistenteException() {
        
    }
}
