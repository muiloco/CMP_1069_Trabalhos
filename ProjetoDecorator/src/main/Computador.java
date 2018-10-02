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
    String Nome;
    String Gabinete;
    String PlacaMae;
    String MemoriaRam;
    String PlacaGrafica;
    String Processador;
    String Fonte;
    String Valor;

    public String getNome() {
        return Nome;
    }

    public String getGabinete() {
        return Gabinete;
    }

    public String getPlacaMae() {
        return PlacaMae;
    }

    public String getMemoriaRam() {
        return MemoriaRam;
    }

    public String getPlacaGrafica() {
        return PlacaGrafica;
    }

    public String getProcessador() {
        return Processador;
    }

    public String getFonte() {
        return Fonte;
    }

    public String getValor() {
        return Valor;
    }
    
}
