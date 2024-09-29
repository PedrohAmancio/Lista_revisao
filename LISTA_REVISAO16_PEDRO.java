/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao16_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO16_PEDRO {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int f=0; double media = 0;
       
       System.out.println("Informe o numero de funcionarios que possui");
       f=ler.nextInt();
       
       String nome[] = new String [f]; double sal[] = new double [f];
       for(int i = 0; i < f; ++i){
           System.out.println("Digite o nome do funconario");
           nome[i]=ler.next();
           System.out.println("Digite o salario do funconario");
           sal[i]=ler.nextDouble();
       }
        System.out.println("Essa e a sua tabela e funcionario \n");
       for(int i = 0; i < f; ++i){
           System.out.println("|" + nome[i] + "|" + sal[i] + "|");
           media = sal[i]/f;
       }
       for(int i = 0; i < f; ++i){
     if(sal[i] > media){
         System.out.println("O funcionario " + nome[i] + " tem um salario acima da media" + media + 
                 "o salario dele e" + sal[i]);
     }
     }
       
       
       
    }
}
