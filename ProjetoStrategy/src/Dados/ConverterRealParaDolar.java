/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import Interface.InterfaceConversora;

/**
 *
 * @author Fernando R
 */
public class ConverterRealParaDolar implements InterfaceConversora{

    
    @Override
    public double converterMoeda(Moedas Obj, float valorEmReal) {
        double valorConvertido = valorEmReal / Obj.getValorMoeda();
        return valorConvertido;
    }
    
}
