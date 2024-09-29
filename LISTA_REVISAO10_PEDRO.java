/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao10_pedro;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO10_PEDRO {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);

        // Leitura do valor de N (entre 0 e 50)
        int N=0; int leitura[] = new int [N];
        int neg[] = new int [N];int pos[] = new int [N];
        int valor_V_N = 0;int valor_V_P=0;
        
        System.out.print("Digite um número N (entre 0 e 50): ");
        N = ler.nextInt();
        
        if((N == 0)||(N > 50)){
        while(true){
            System.out.print("Digite um número N (entre 0 e 50): ");
            N = ler.nextInt();
            if((N<=50)&&(N>0)){
                break;
            }
        }
        }
        for(int i = 0; i < N; ++i){
        System.out.println("Digite numeros");
        leitura[i]=ler.nextInt();
        }
        for(int i =0; i < N; ++i){
             if(leitura[i] >= 0){
           leitura[i]= pos[i];
           ++valor_V_P;
        }
        else if(leitura[i]<0){
            leitura[i]= neg[i];
            ++valor_V_N;
        }
        else{
            System.out.println("Recomece o codigo");
        }
        }
        for(int i = 0; i < 1; ++i){
            System.out.println("Esses sao os valores positivos "+ pos[i]);
            System.out.println("Esses sao os valores negativos"+neg[i]);
            System.out.println("Esses sao os valores contidos(vetor de negativos)" + valor_V_N);
            System.out.println("Esses sao os valores contidos(vetor de positivos) " + valor_V_P);
        }
        }
}

