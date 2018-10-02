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
public class ComputadorSavage extends Computador{
    
    public ComputadorSavage() {
        Valor = 3630.80;
    }

    @Override
    public String descricaoComputador() {
        Descricao = "Nome: "+ "Computador Gamer Savage"+"\n";
        Descricao+= "Gabinete: "+"Elysium G503X"+"\n";
        Descricao+= "Placa Mãe: "+"H110M DDR4"+"\n";
        Descricao+= "MemoriaRam: "+"Crucial 8GB DDR4 2400Mhz"+"\n";
        Descricao+= "PlacaGrafica: "+"GeForce GTX 1060 3GB"+"\n";
        Descricao+= "Processador: "+"Intel Core i5-7400"+"\n";
        Descricao+= "Fonte: "+"Aero Kcas 500W 80 Plus White";
        return Descricao;
    }
    
    @Override
    public double getValor() {
        return Valor;
    }
    
}
