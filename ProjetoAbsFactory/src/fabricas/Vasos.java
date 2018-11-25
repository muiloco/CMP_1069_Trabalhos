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
       Object[] lista = {"TerraOrganica","TerraVegetal","KitJardinagem"};
       return lista;
    }

    @Override
    public Produto getProduto(String item) {
       if(null == item)
            return null;
        else switch (item) {
             case "VasoDeBarro":
                 return new VasoDeBarro();
             case "VasoDeCeramica":
                 return new VasoDeCeramica();
             case "VasoDePlastico":
                 return new VasoDePlastico();
             default:
                 return null;
         }
    }
}