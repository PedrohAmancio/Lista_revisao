/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisa05_pedro;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISA05_PEDRO {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        double peso_L ; String nome_L = ""; String result = "";
         FileWriter arquivo;
        
        System.out.println("Informe o nome do lutador");
        nome_L = ler.next();
        
        System.out.println("Informe o peso do lutador");
        peso_L = ler.nextDouble();

       if(peso_L==65){
            result="Peso pena ";
           System.out.print(result);
       } 
       else if((peso_L >= 65)&&(peso_L < 72)){
           result="Peso Leve ";
           System.out.print(result);
       }
        else if((peso_L >= 72)&&(peso_L < 79)){
            result="Peso Ligeiro ";
           System.out.print(result);
       }
        else if((peso_L >= 79)&&(peso_L < 86)){
            result = "Peso meio medio ";
        System.out.print(result);   
       }
        else if((peso_L >= 86)&&(peso_L < 93)){
            result = "Peso medio";
           System.out.print(result);
       }
        else if((peso_L >= 93)&&(peso_L < 100)){
            result = "Peso meio pesado";
           System.out.print(result);
       }
        else if(peso_L >= 100){
            result = "Peso pesado";
           System.out.print(result);
       }
       
       arquivo = new FileWriter("C:\\Atv_DDS\\LUTADOR" + nome_L +".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf("--------------------------------------------\n");
            gravar.printf("O lutador "+nome_L+ " Peesa"+peso_L+ "e se enquadra na categoria"+ result +"\n");
            gravar.printf("--------------------------------------------\n");
            
            gravar.printf("--------------------------------------------\n");
            arquivo.close();

    }
    

    private static String correcao(String peso_L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
