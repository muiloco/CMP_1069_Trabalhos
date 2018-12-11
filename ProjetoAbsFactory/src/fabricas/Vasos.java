/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import interfaces.Produto;
import main.FabricaAbs;
import produtos.VasoDeBarro;
import produtos.VasoDeCeramica;
import produtos.VasoDePlastico;

/**
 *
 * @author Fernando R
 */
public class Vasos extends FabricaAbs{

     public Vasos() {
        categoria = "Vasos";
    }
    
    @Override
    public Object[] getListaProdutod() {
       Object[] lista = {"Vaso Barro Tipo Bacia","Vaso Jelling","Vaso De Plástico N°10- Preto"};
       return lista;
    }

    @Override
    public Produto getProduto(String nome, String descricao, float valor) {
       if(null == nome)
            return null;
        else switch (nome) {
             case "Vaso Barro Tipo Bacia":
                 return new VasoDeBarro(nome,descricao,valor);
             case "Vaso Jelling":
                 return new VasoDeCeramica(nome,descricao,valor);
             case "Vaso De Plástico N°10- Preto":
                 return new VasoDePlastico(nome,descricao,valor);
             default:
                 return null;
         }
    }
}