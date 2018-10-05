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
public class ComputadorFactory {

   public static Computador getComputador(int idEscolha){
       Computador obj = null;
       switch (idEscolha) {
           case 0:
               break;
           case 1:
               obj = new ComputadorAnubis();
               break;
           case 2:
               obj = new ComputadorDonkor();
               break;
           case 3:
               obj = new ComputadorSavage();
               break;
       }
       return obj;
   }
   
   public static Computador getAddRefrigeracao(int idEscolha, Computador obj)
   {
       switch(idEscolha){
           case 0:
               break;
           case 1:
               obj = new ComputadorAddWaterCooler(obj);
               break;
           case 2:
               obj = new ComputadorAddkitCooler(obj);
               break;
       }
       return obj;
   }
   
   public static Computador getAddArmazenamento(int idEscolha, Computador obj){
       switch(idEscolha){
           case 0:
               break;
           case 1:
               obj = new ComputadorAddHd(obj);
               break;
           case 2:
               obj = new ComputadorAddSsd(obj);
               break;
       }
       return obj;
   }
    
}
