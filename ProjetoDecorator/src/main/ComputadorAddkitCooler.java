/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author puc
 */
public class ComputadorAddkitCooler extends ComputadorDecorator{
    
    public ComputadorAddkitCooler(Computador computador) {
        super(computador);
        Valor = 129;
    }
    
    @Override
    public String descricaoComputador() {
        Descricao = "Nome: " + "Kit Ventoinha + Fita LED Alseye SoonCool 2x120mm Rainbow RGB Com Controle";
        return Descricao;
    }

    @Override
    public double getValor() {
        return Valor;
    }
}
