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
public class ComputadorDonkor extends ComputadorDecorator{
    
    public ComputadorDonkor(Computador computador) {
        super(computador);
        Nome = "Computador Gamer Donkor";
        Gabinete = "AeroCool AERO 500 Black Edition Window";
        PlacaMae = "78LMT-S2";
        MemoriaRam = "Crucial 8GB DDR3 1600Mhz";
        PlacaGrafica = "GeForce GTX1050 2GB";
        Processador = "AMD FX-6300 3,5GHz";
        Fonte = "Aero Kcas 400W 80 Plus White";
        Valor = "R$ 2.742,26";
    }
    
}
