/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao12_pedro;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO12_PEDRO {

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
        ArrayList<Integer> V = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            V.add(random.nextInt(100)); // Gera números aleatórios entre 0 e 99
        }
        
        // Exibe o vetor gerado
        System.out.print("Vetor gerado: ");
        for (int num : V) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Início do laço de busca e remoção
        while (true) {
            System.out.print("Digite um número X para buscar e remover no vetor (-1 para sair): ");
            int X = scanner.nextInt();
            
            if (X == -1) {
                System.out.println("Encerrando o programa...");
                break;
            }
            
            // Remove todas as ocorrências de X no vetor
            boolean removed = V.removeIf(num -> num == X);
            
            if (removed) {
                System.out.println("Número " + X + " removido.");
            } else {
                System.out.println("Número " + X + " não encontrado no vetor.");
            }
            
            // Exibe o vetor atualizado
            System.out.print("Vetor atualizado: ");
            for (int num : V) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
