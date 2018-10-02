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
        Descricao ="Water Cooler GamerStorm by DeepCool Captain 240 EX WHITE RGB";
        Valor = 429; 
    }

//    @Override
//    public String descricao() {
//        Descricao = "Nome: " + "Water Cooler GamerStorm by DeepCool Captain 240 EX WHITE RGB";
//        return Descricao;
//    }
//
//    @Override
//    public double getValor() {
//        return Valor;
//    }
    
}
