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
public class ComputadorAddHd extends ComputadorDecorator{
    
    public ComputadorAddHd(Computador computador) {
        super(computador);
        Descricao = "HD SATA 1TB Toshiba";
        Valor = 256.25;
    }
    
}
