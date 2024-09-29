/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao11_pedro;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO11_PEDRO {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Lê o valor de N (entre 0 e 50)
        int N;
        do {
            System.out.print("Digite um número N entre 0 e 50: ");
            N = scanner.nextInt();
        } while (N < 0 || N > 50);
        
        // Define e preenche o vetor V com N números aleatórios
        int[] V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = random.nextInt(100);   
            }
         // Exibe o vetor gerado
        System.out.print("Vetor gerado: ");
        for (int i = 0; i < N; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println();
        
        // Início do laço de busca
        while (true) {
            System.out.print("Digite um número X para buscar no vetor (-1 para sair): ");
            int X = scanner.nextInt();
            
            if (X == -1) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            // Lista para armazenar as posições onde X é encontrado
            ArrayList<Integer> posicoes = new ArrayList<>();
            
            // Pesquisa X no vetor V
            for (int i = 0; i < N; i++) {
                if (V[i] == X) {
                    posicoes.add(i);
                }
            }
            
            // Exibe as posições ou informa que o número não foi encontrado
            if (posicoes.size() > 0) {
                System.out.print("Número " + X + " encontrado nas posições: ");
                for (int pos : posicoes) {
                    System.out.print(pos + " ");
                }
                System.out.println();
            } else {
                System.out.println("Número " + X + " não encontrado no vetor.");
            }
        }
        
        scanner.close();
}
}
