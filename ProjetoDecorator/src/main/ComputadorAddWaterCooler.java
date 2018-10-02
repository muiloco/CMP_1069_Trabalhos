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
public class ComputadorAddWaterCooler extends ComputadorDecorator {
    
    public ComputadorAddWaterCooler(Computador computador) {
        super(computador);
        Valor = 429; 
    }

    @Override
    public String descricaoComputador() {
        Descricao = "Nome: " + "Water Cooler GamerStorm by DeepCool Captain 240 EX WHITE RGB";
        return Descricao;
    }

    @Override
    public double getValor() {
        return Valor;
    }
    
}
