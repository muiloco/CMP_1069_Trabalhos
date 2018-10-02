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
public class ComputadorSavage extends ComputadorDecorator{
    
    public ComputadorSavage(Computador computador) {
        super(computador);
        Nome = "Computador Gamer Savage";
        Gabinete = "Elysium G503X";
        PlacaMae = "H110M DDR4";
        MemoriaRam = "Crucial 8GB DDR4 2400Mhz";
        PlacaGrafica = "GeForce GTX 1060 3GB";
        Processador = "Intel Core i5-7400";
        Fonte = "Aero Kcas 500W 80 Plus White";
        Valor = "R$ 3.630,80";
    }
    
}
