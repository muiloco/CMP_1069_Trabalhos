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
public class ComputadorAnubis extends ComputadorDecorator{
    
    public ComputadorAnubis(Computador computador) {
        super(computador);
        Nome = "Computador Gamer Anubis";
        Gabinete = "Pichau AeroCool Si-5100";
        PlacaMae = "H110M DDR4";
        MemoriaRam = "Crucial 8GB DDR4 2400Mhz";
        PlacaGrafica = "Galax GeForce GTX1060 6GB OC";
        Processador = "Intel Core i5-7400";
        Fonte = "Aero Kcas 500W 80 Plus White";
        Valor = "R$ 3.803,64";
    }
    
}
