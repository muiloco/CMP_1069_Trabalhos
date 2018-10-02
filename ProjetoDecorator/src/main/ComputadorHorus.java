package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fernando R
 */
public class ComputadorHorus extends ComputadorDecorator {
    
    public ComputadorHorus(Computador computador) {
        super(computador);
        Nome = "Computador Gamer Horus";
        Gabinete = "NZXT S340";
        PlacaMae = "H110M DDR4";
        MemoriaRam = "Crucial 8GB DDR4 2400Mhz";
        PlacaGrafica = "Galax GeForce GTX1060 6GB OC";
        Processador = "Intel Core i5-7400";
        Fonte = "Aero Kcas 500W 80 Plus White";
        Valor = "R$ 3.984,60";
    }
    
}
