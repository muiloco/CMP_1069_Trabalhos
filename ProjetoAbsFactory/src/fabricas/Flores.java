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
    public Produto getProduto(String item) {
       if(null == item)
            return null;
        else switch (item) {
             case "Lirio":
                 return new Lirio();
             case "Margarida":
                 return new Margarida();
             case "Orquidea":
                 return new Orquidea();
             default:
                 return null;
         }
    }
    
    

    

   
    
}
