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
public class Moedas {
    //Atributos
    private String paisMoeda;
    private float valorMoeda;
    protected InterfaceConversora estrategia = null;    
    //Metodos

    public Moedas(String paisMoeda, float valorMoeda) {
        this.valorMoeda = valorMoeda;
        switch (paisMoeda){
            case ("EUA"):
                estrategia = new ConverterRealParaDolar();
                this.paisMoeda = "EUA";
                break;
            case ("UE"):
                estrategia = new ConverterRealParaEuro();
                this.paisMoeda = "UE";
                break;
            case ("JAP"):
                estrategia = new ConverterRealParaIene();
                this.paisMoeda = "JAP";
                break;
            default:
                throw new RuntimeException("Moeda nao encontrata!!!");
        }
    }

    public String getPaisMoeda() {
        return paisMoeda;
    }

    public void setPaisMoeda(String paisMoeda) {
        this.paisMoeda = paisMoeda;
    }

    public float getValorMoeda() {
        return valorMoeda;
    }

    public void setValorMoeda(float valorMoeda) {
        this.valorMoeda = valorMoeda;
    }
    
    public double converterMoeda(float real){
        return this.estrategia.converterMoeda(this, real);
    }
}
