/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import interfaces.Produto;

/**
 *
 * @author Fernando R
 */
public class VasoDeBarro implements Produto{
    
    String nome;
    String descricao;
    float valor;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public float getPreco() {
        return valor;
    }
}