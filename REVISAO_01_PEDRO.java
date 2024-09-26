/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revisao_01_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class REVISAO_01_PEDRO {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       int num1; int num2; int result;
       
       System.out.println("Digite um numero ");
       num1=ler.nextInt();
       System.out.println("Digite outro numero a ser somado");
       num2=ler.nextInt();
       
       result=num1+num2;
       System.out.println("Soma de "+num1 +" com "+num2+" = "+result);
    }
}
