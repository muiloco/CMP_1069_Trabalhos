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
public abstract class Computador {
    String Descricao;
    double Valor;

    public abstract String descricao();

    public double getValor() {
        return Valor;
    }
}
