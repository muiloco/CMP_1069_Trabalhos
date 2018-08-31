/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversorExterno;

/**
 *
 * @author Fernando R
 */
public class Moedas {
    //Atributos
    private String paisMoeda;
    private float valorMoeda;
    
    //Metodos

    public Moedas(String paisMoeda, float valorMoeda) {
        this.paisMoeda = paisMoeda;
        this.valorMoeda = valorMoeda;
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
    
}
