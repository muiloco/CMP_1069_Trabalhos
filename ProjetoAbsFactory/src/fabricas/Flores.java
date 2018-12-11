/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import interfaces.Produto;
import main.FabricaAbs;
import produtos.Lirio;
import produtos.Margarida;
import produtos.Orquidea;

/**
 *
 * @author Fernando R
 */
public class Flores extends FabricaAbs{

     public Flores() {
        categoria = "Flores";
    }
    
    @Override
    public Object[] getListaProdutod() {
       Object[] lista = {"Lirio","Margarida","Orquidea"};
       return lista;
    }

    @Override
    public Produto getProduto(String nome, String descricao, float valor) {
       if(null == nome)
            return null;
        else switch (nome) {
             case "Lirio":
                 return new Lirio(nome,descricao,valor);
             case "Margarida":
                 return new Margarida(nome,descricao,valor);
             case "Orquidea":
                 return new Orquidea(nome,descricao,valor);
             default:
                 return null;
         }
    }
    
    

    

   
    
}
