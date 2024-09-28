/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao03_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO03_PEDRO {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int num1 ; int num2 ; int resultado;
     
     System.out.print("Digite um numero \n");
     num1=ler.nextInt();
     System.out.println("Digite um numero a seer somado(Deve ter o mesmo sinal que o numero anterior)");
     num2 = ler.nextInt();
     if((num1 > 0) && (num2>0)){
         resultado=num1 + num2;
         System.out.println(resultado);
     }
     else if((num1<0) && (num2<0)){
       resultado=num1 + num2;
       System.out.println(resultado);
     }
     else{
         System.out.println("Sinais diferentes, refaça a equação com sinais iguais");
     }
    }
}
