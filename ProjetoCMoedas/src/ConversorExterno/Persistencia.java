/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversorExterno;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Fernando R
 */
public class Persistencia {
    
    public Persistencia() {}
    
    //metodos
    public Iterator<Moedas> lerArquivo() throws FileNotFoundException, IOException
    {
        //String url = "/home/puc/Área de Trabalho/CMP_1069_Trabalhos/ProjetoCMoedas/moedas.txt";
        String url = "C:\\Users\\Pichau\\Desktop\\Coisa faculdade\\TCS\\CMP_1069_Trabalhos\\ProjetoCMoedas\\moedas.txt";
        List<Moedas> listaMoedas = new ArrayList<>();
        FileReader arquivo = new FileReader(url);
        BufferedReader arquivoLer = new BufferedReader(arquivo);
        String linha;
        while((linha = arquivoLer.readLine()) != null)
        {
            String Dados[] = linha.split("-");
            Moedas moeda = new Moedas(Dados[0], Float.parseFloat(Dados[1]));
            listaMoedas.add(moeda);
        }
        return listaMoedas.iterator();
    }
}
