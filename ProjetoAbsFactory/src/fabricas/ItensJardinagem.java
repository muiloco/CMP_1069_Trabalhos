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
        categoria = "ItensJardinagem";
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
             case "TerraOrganica":
                 return new TerraOrganica();
             case "TerraVegetal":
                 return new TerraVegetal();
             case "KitJardinagem":
                 return new KitJardinagem();
             default:
                 return null;
         }
    }
}
    
