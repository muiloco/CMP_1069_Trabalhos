/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Fernando R
 */
public abstract class ComputadorDecorator extends Computador{
    Computador computador;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    } 

    @Override
    public String descricao() {
        return this.computador.descricao() + "\n" + "Adicional: " + Descricao;
    }
    
    @Override
    public double getValor() {
        return this.computador.getValor() + Valor;
    }
}
