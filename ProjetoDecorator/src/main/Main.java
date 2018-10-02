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
        Computador computador = null;
        computador = new ComputadorAnubis(computador);
        System.out.println("Nome:"+computador.getNome()+"\n"+
                "Placa Mãe:"+computador.getPlacaMae()+"\n"+
                "Ram:"+computador.getMemoriaRam()+"\n"+
                "Valor:"+computador.getValor());
    }
    
}
