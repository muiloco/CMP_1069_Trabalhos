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
public class ComputadorAddSsd extends ComputadorDecorator{
    
    public ComputadorAddSsd(Computador computador) {
        super(computador);
        Descricao = "SSD SATA 500GB Kingston";
        Valor = 450.99;
    }
    
}
