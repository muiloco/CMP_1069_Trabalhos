/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import interfaces.Produto;
import main.FabricaAbs;
import produtos.KitJardinagem;
import produtos.TerraOrganica;
import produtos.TerraVegetal;

/**
 *
 * @author Fernando R
 */
public class ItensJardinagem extends FabricaAbs{

     public ItensJardinagem() {
        categoria = "Itens de Jardinagem";
    }
    
    @Override
    public Object[] getListaProdutod() {
       Object[] lista = {"Terra Orgânica 10kg","Terra Vegetal Biomix - 10kg","Jogo para Jardim Azul"};
       return lista;
    }

    @Override
    public Produto getProduto(String nome, String descricao, float valor) {
       if(null == nome)
            return null;
        else switch (nome) {
             case "Terra Orgânica 10kg":
                 return new TerraOrganica(nome,descricao,valor);
             case "Terra Vegetal Biomix - 10kg":
                 return new TerraVegetal(nome,descricao,valor);
             case "Jogo para Jardim Azul":
                 return new KitJardinagem(nome,descricao,valor);
             default:
                 return null;
         }
    }
}
    
