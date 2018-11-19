/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fabricas.Flores;
import fabricas.ItensJardinagem;
import fabricas.Vasos;
import interfaces.Produto;

/**
 *
 * @author Fernando R
 */
public abstract class FabricaAbs {
    
    protected String categoria;
    
    public static Object[] getCategorias(){
        Object[] listaCategorias = {"Flores","Vasos","Itens de Jardinagem"};
        return listaCategorias;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public abstract Object[] getListaProdutod();
    public abstract Produto getProduto(String item);
    public static FabricaAbs getInstance(String categoria){
        if(categoria == null)
            return null;
        else if(categoria.equals("Flores"))
            return new Flores();
        else if(categoria.equals("Vasos"))
            return new Vasos();
        else if(categoria.equals("Itens de Jardinagem"))
            return new ItensJardinagem();
        else 
            return null;
    }
    
}
