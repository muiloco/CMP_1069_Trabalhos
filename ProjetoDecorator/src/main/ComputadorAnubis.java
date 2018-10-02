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
public class ComputadorAnubis extends Computador{

    public ComputadorAnubis() {
        Valor = 3658.60;
    }
    @Override
    public String descricaoComputador() {
        Descricao = "Nome: "+ "Computador Gamer Anubis"+"\n";
        Descricao+= "Gabinete: "+"Pichau AeroCool Si-5100"+"\n";
        Descricao+= "Placa Mãe: "+"H110M DDR4"+"\n";
        Descricao+= "MemoriaRam: "+"Crucial 8GB DDR4 2400Mhz"+"\n";
        Descricao+= "PlacaGrafica: "+"Galax GeForce GTX1060 6GB OC"+"\n";
        Descricao+= "Processador: "+"Intel Core i5-7400"+"\n";
        Descricao+= "Fonte: "+"Aero Kcas 500W 80 Plus White";
        return Descricao;
    }

    @Override
    public double getValor() {
        return Valor;
    }
    
}
