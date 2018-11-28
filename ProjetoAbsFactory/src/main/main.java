/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fernando R
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Connection ConnectDB = JavaConnection.ConnectDB();
        JavaConnection conex = new JavaConnection();
        boolean ConnectDB = conex.ConnectDB();
        
        ResultSet resultSet = null;
        Statement statement = null;
        
        String query = "SELECT * FROM TableFlores";
        
       statement = conex.criarStatement();
        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println("Dados das Flores:");
                System.out.println(resultSet.getString("FlorNome"));
            }
        } catch (SQLException e) {
            System.out.println("Erro desconhecido");
        } finally {
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Erro desconhecido");
            }
        }
        
    }
    
}
