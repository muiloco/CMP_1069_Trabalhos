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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computador computador = new ComputadorAnubis();
        System.out.println(computador.descricao()+"\n"+"Valor: R$ "+computador.getValor());
        
        computador = new ComputadorAddWaterCooler(computador);
        System.out.println(computador.descricao()+"\n"+"Valor: R$ "+computador.getValor());
        InterfaceGrafica.main(null);
    }
    
}
