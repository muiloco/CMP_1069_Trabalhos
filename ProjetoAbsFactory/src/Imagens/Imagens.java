/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imagens;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Fernando R
 */
public class Imagens {

    
    private final ImageIcon orquidea = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Orquidea Portinara.jpg");
    private final ImageIcon lirio = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Lirio.jpg");
    private final ImageIcon margarida = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Margarida.jpg");
    private final ImageIcon terraOrganica = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Terra Orgânica 10kg.jpg");
    private final ImageIcon terraVegetal = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Terra Vegetal Biomix - 10kg.jpg");
    private final ImageIcon kitJardinagem = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Jogo para Jardim Azul.jpg");
    private final ImageIcon vasoPlastico = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Vaso De Plástico N°10- Preto.jpg");
    private final ImageIcon vasoCeramica = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Vaso Jelling.jpg");
    private final ImageIcon vasoBarro = new ImageIcon("src"+File.separator+"Imagens"+File.separator+"Vaso Barro Tipo Bacia.jpg");
    
    public Imagens() {
    }
    
    public ImageIcon getImagem(int width, int height, String nomedaimagem){
        Image i = null;
        switch (nomedaimagem) {
            case "Lirio":
                i = this.lirio.getImage();
                break;
            case "Orquidea Portinara":
                i = this.orquidea.getImage();
                break;
            case "Margarida":
                i = this.margarida.getImage();
                break;
            case "Terra Orgânica 10kg":
                i = this.terraOrganica.getImage();
                break;
            case "Terra Vegetal Biomix - 10kg":
                i = this.terraVegetal.getImage();
                break;
            case "Jogo para Jardim Azul":
                i = this.kitJardinagem.getImage();
                break;
            case "Vaso De Plástico N°10- Preto":
                i = this.vasoPlastico.getImage();
                break;
            case "Vaso Jelling":
                i = this.vasoCeramica.getImage();
                break;
            case "Vaso Barro Tipo Bacia":
                i = this.vasoBarro.getImage();
                break;
        }
        Image nova = i.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(nova);
    }
    
    
    public void mudaImagem(String ImagemQeuQuero, JLabel minhalabel){
        minhalabel.setIcon(this.getImagem(minhalabel.getWidth(), minhalabel.getHeight(), ImagemQeuQuero));
    }
    
}
