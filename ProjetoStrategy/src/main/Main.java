/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Dados.Moedas;
import java.text.DecimalFormat;


/**
 *
 * @author Fernando R
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        Moedas dolar = new Moedas("EUA", (float)3.94);
        Moedas euro = new Moedas("UE", (float)4.47);
        Moedas iene = new Moedas("JAP", (float)0.035);
        
        float real = (float) 35.84;
        DecimalFormat df = new DecimalFormat("0.00");
        
        String saida1 = "Valor em Dolar=" + df.format(dolar.converterMoeda(real));
        String saida2 = "Valor em Euro=" + df.format(euro.converterMoeda(real));
        String saida3 = "Valor em Iene=" + df.format(iene.converterMoeda(real));
        
        System.out.println(saida1);
        System.out.println(saida2);
        System.out.println(saida3);
    }
    
}
