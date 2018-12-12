/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando R
 */



public class JavaConnection {
    
   
    private Connection conex;
    public boolean ConnectDB(){
        try {
            this.conex = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Pichau\\Desktop\\Coisa faculdade\\TCS\\CMP_1069_Trabalhos\\ProjetoAbsFactory\\BancoJardinagem.sqlite"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
        System.out.println("Conex!!");
        return true;
    }
    
    public Statement criarStatement(){
        try {
            return this.conex.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection getConex() {
        return conex;
    }
}
