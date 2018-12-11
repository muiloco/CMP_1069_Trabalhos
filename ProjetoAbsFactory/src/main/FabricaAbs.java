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
    public abstract Produto getProduto(String nome, String descricao, float valor);
    public static FabricaAbs getInstance(String categoria){
        if(null == categoria)
            return null;
        else switch (categoria) {
            case "Flores":
                return new Flores();
            case "Vasos":
                return new Vasos();
            case "Itens de Jardinagem":
                return new ItensJardinagem();
            default:
                return null;
        }
    }

    
    
}
