/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversorDaEmpresa;
import ConversorExterno.ConversorDeMoedas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Fernando R
 */
public class ConversorAdapter extends InterfaceConversor{

    ConversorDeMoedas conversor = new ConversorDeMoedas();
    
    public ConversorAdapter() {
    }

    @Override
    public float converteParaDolar(float valor) {
        try { 
            return this.conversor.converterRealParaOutraMoeda("EUA", valor);
        } catch (IOException ex) {
            Logger.getLogger(ConversorAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public float converterParaEuro(float valor) {
        try {
            return this.conversor.converterRealParaOutraMoeda("UE", valor);
        } catch (IOException ex) {
            Logger.getLogger(ConversorAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
