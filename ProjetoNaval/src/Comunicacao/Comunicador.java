/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comunicacao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Fernando R
 */
public class Comunicador {
    ServerSocket server;
    Socket soquete;
    DataInputStream entrada;
    DataOutputStream saida;
    
    // Seguemento Cliente

    public Comunicador(String ipServidor, int portServidor) throws IOException {
        this.soquete = new Socket(ipServidor, portServidor);
        this.entrada = new DataInputStream(soquete.getInputStream());
        this.saida = new DataOutputStream(soquete.getOutputStream());
    }
    
    // Modo do Server
    
    public Comunicador(int portServidor) throws IOException {
        server= new ServerSocket(portServidor);
        this.soquete = server.accept();
        this.entrada = new DataInputStream(soquete.getInputStream());
        this.saida = new DataOutputStream(soquete.getOutputStream());
    }
    
    //Comunicacao
    public void enviar(String dado1) throws IOException{
        saida.writeUTF(dado1);
        saida.flush();
    }
    
    public String saida() throws IOException{
        return entrada.readUTF();
    }
    
}
