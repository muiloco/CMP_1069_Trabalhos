/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.Produto;
import java.util.ArrayList;

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
//        JavaConnection conex = new JavaConnection();
//        boolean ConnectDB = conex.ConnectDB();
//        
//        ResultSet resultSet = null;
//        Statement statement = null;
//        
//        String query = "SELECT * FROM TableFlores";
//        
//       statement = conex.criarStatement();
//        try {
//            resultSet = statement.executeQuery(query);
//            while(resultSet.next()){
//                System.out.println("Dados das Flores:");
//                System.out.println(resultSet.getString("FlorNome"));
//            }
//        } catch (SQLException e) {
//            System.out.println("Erro desconhecido");
//        } finally {
//            try {
//                resultSet.close();
//                statement.close();
//            } catch (SQLException ex) {
//                System.out.println("Erro desconhecido");
//            }
//        }
//        FabricaAbs teste = null;

         ArrayList<Produto> test = Persistencia.carregaDados("TableFlores", "Flores");
//          Produto teste;
//          int cont =0;
//          int t= test.size();
//          while(cont <= t){
//              teste = test.get(cont);
//              System.out.println(teste.getNome());
//              cont++;
//          }
      
    }
    
}
