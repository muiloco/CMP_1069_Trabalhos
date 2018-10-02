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
public abstract class ComputadorDecorator extends Computador{
    Computador computador;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    }
    
    @Override
    public String getNome() {
        return this.computador.getNome() ;
    }

    @Override
    public String getGabinete() {
        return this.computador.getGabinete() + " + " + Gabinete;
    }

    @Override
    public String getPlacaMae() {
        return this.computador.getPlacaMae() + " + " + PlacaMae;
    }

    @Override
    public String getMemoriaRam() {
        return this.computador.getMemoriaRam() + " + " + MemoriaRam;
    }

    @Override
    public String getPlacaGrafica() {
        return this.computador.getPlacaGrafica() + " + " + PlacaGrafica;
    }

    @Override
    public String getProcessador() {
        return this.computador.getProcessador() + " + " + Processador;
    }

    @Override
    public String getFonte() {
        return this.computador.getFonte()+ " + " + Fonte;
    }

    @Override
    public String getValor() {
        return this.computador.getValor() + " + " + Valor;
    }
    
    
}
