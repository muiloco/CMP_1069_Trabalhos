/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fabricas.Flores;
import interfaces.Produto;
import java.util.ArrayList;
import java.util.Iterator;
import produtos.Lirio;

/**
 *
 * @author Fernando R
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Iterator<Produto> test = Persistencia.carregaDados("TableVasos", "Vasos");
          for (Iterator<Produto> i = test; i.hasNext();){
              Produto x = i.next();
              System.out.println(x.getNome());
              System.out.println(x.getDescricao());
              System.out.println(x.getPreco());
          }
      
    }
    
}
