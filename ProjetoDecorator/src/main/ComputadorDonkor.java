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
public class ComputadorDonkor extends Computador{
    
    public ComputadorDonkor() {
        Valor = 2742.26;
    }

    @Override
    public String descricao() {
        Descricao = "Nome: "+ "Computador Gamer Donkor"+"\n";
        Descricao+= "Gabinete: "+"AeroCool AERO 500 Black Edition Window"+"\n";
        Descricao+= "Placa Mãe: "+"78LMT-S2"+"\n";
        Descricao+= "MemoriaRam: "+"Crucial 8GB DDR3 1600Mhz"+"\n";
        Descricao+= "PlacaGrafica: "+"GeForce GTX1050 2GB"+"\n";
        Descricao+= "Processador: "+"AMD FX-6300 3,5GHz"+"\n";
        Descricao+= "Fonte: "+"Aero Kcas 400W 80 Plus White";
        return Descricao;
    }
    
    @Override
    public double getValor() {
        return Valor;
    }
    
}
