/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ELementos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Término a guardar en las distinas categorias.
 * @author Daniel Gutiérrez Duque
 * @author Sebastian Cordero Ramírez
 * @since 1.0
 */
public class Termino implements Serializable{
    
    /**
     * Expresión o palabra del término.
     */
    private String expresion;
    
    /**
     * Significado del término.
     */
    private String significado;
    
    /**
     * ArrayList de las Categorías a las cuales pertenece el término.
     */
    private ArrayList<Categoria> categorias = new ArrayList<>();

    public Termino(String expresion, String significado) {
        ponExpresion(expresion);
        ponSignificado(significado);
    }

    public Termino() {
       
    }
    
    public void ponExpresion(String expresion) {
            this.expresion = expresion;
    }

    public void ponSignificado(String significado) {
            this.significado = significado;
    }

    public String obtExpresion() {
            return this.expresion;
    }

    public String obtSignificado() {
            return this.significado;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

        
    
}
