/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao15_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO15_PEDRO {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     int nasc; int ano; int idade;
     
     System.out.println("Digite o ano do seu nascimento");
     nasc = ler.nextInt();
     System.out.println("Digite o ano em que esta");
     ano = ler.nextInt();
     idade=ano-nasc;
     System.out.println("A idade que vc nesse ano é " + idade);
     
    }
}
