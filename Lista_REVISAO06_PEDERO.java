/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao06_pedero;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class Lista_REVISAO06_PEDERO {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero");
        x=ler.nextInt();
        if(x > 0){
            System.out.println("O valor é positivo");
        }
        else if(x < 0){
            System.out.println("O numero digitado é negativo");
        }
        while(x!=0){
             System.out.println("Digite um numero");
        x=ler.nextInt();
        if(x > 0){
            System.out.println("O valor é positivo");
        }
        else if(x < 0){
            System.out.println("O numero digitado é negativo");
        }
        }
         if(x==0){
            System.out.println("O valor digitado é o esperado, fim do programa");
        }
    }
}
