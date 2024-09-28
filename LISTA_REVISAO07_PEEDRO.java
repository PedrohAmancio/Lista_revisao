/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao07_peedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO07_PEEDRO {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x=1; int maior_num=0;int menor_num=0;int soma=0;
        int tentativas=1;
        while(true){
            System.out.println("Digite um valor");
            x=ler.nextInt();
            if(x<=0){
                break;
            }
            
            soma+=x;
            tentativas++;
            
            if(x < maior_num){
                maior_num=x;
            }
            else if(x > maior_num){
                menor_num=x;
            }
        }
        if(tentativas > 0){
            int media = (int) soma/tentativas;
            System.out.println("Menor valor é" + maior_num);
            System.out.println("Maior valor é" + menor_num);
            System.out.println("Tentativas " + tentativas);
            System.out.println("Soma dos valores" + soma);
            System.out.println("Media das tentativas" + media);
        }
        else{
            System.out.println("Nenhum valor valido foi digitado");
        }
    }
}
