/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_02_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class PROJETO_02_PEDRO {

    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
          int num1; int num2; int result=0;
       
       System.out.println("Digite um numero ");
       num1=ler.nextInt();
       System.out.println("Digite outro numero a ser somado");
       num2=ler.nextInt();
       
       if((num1 > 0) && (num2 > 0)){
       result=num1+num2;
       }
       else if((num1 < 0) && (num2 < 0)){
       System.out.println("Os dados de entrada são invalios");
        }
       
       System.out.println("Soma de "+num1 +" com "+num2+" = "+result);
    }
}
