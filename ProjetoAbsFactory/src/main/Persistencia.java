/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Fernando R
 */
public class Persistencia {
    
    public static Iterator<Produto> carregaDados (String nomeTabela, String categoria)
    {
        ArrayList<Produto> objetos = new ArrayList();
        JavaConnection conex = new JavaConnection();
        boolean ConnectDB = conex.ConnectDB();
        ResultSet resultSet = null;
        Statement statement = null;
        
        String query = "SELECT * FROM " + nomeTabela;
        FabricaAbs objFabricaAbs = FabricaAbs.getInstance(categoria); 
        statement = conex.criarStatement();

        try {
            resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                objetos.add(objFabricaAbs.getProduto(resultSet.getString(2), resultSet.getString(4), resultSet.getFloat(3)));
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
        
        return objetos.iterator();
    }
    
}
