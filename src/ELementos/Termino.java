/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ELementos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Termino implements Serializable{
    private String expresion;
    private String significado;
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
