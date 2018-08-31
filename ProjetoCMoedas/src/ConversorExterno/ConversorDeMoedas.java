/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversorExterno;

import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author Fernando R
 */
public class ConversorDeMoedas {

    //atributos
    Persistencia dados = new Persistencia();
    
    public ConversorDeMoedas() {
    }
  
    //metodos
    public float procurarMoeda(String Pais) throws IOException{
        for (Iterator<Moedas> dadoMoeda = this.dados.lerArquivo(); dadoMoeda.hasNext();){
            Moedas objMoedas = dadoMoeda.next();
            System.out.println(objMoedas.getPaisMoeda());
            if(objMoedas.getPaisMoeda().equals(Pais)){
                return objMoedas.getValorMoeda();
            }
        }
        return 0;
    }
    public float converterRealParaOutraMoeda(String pais, float valor) throws IOException{
        ConversorDeMoedas c = new ConversorDeMoedas();
        float valorEstrangeira = c.procurarMoeda(pais);
        return valor/valorEstrangeira;
        
    }
}
