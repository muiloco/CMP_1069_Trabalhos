/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando R
 */



public class JavaConnection {
    
   
    Connection conex = null;
    public static Connection ConnectDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conex = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Pichau\\Desktop\\Coisa faculdade\\TCS\\CMP_1069_Trabalhos\\ProjetoAbsFactory\\BancoJardinagem.sqlite");
            return conex;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
