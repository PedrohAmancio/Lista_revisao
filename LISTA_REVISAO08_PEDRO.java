/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao08_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO08_PEDRO {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num_mini; int num_max; int x; int soma =0;
        int verdadeiro; int y=0; int corret=0;
        
        System.out.println("Digite o valor minimo que sera aceitado");
        num_mini=ler.nextInt();
        System.out.println("Digite o valor maximo que sera aceitado");
        num_max=ler.nextInt();
        while(num_mini>num_max){
            System.out.println("Valores trocados. Valor minimo maior que o maximo");
        System.out.println("Digite o valor minimo que sera aceitado");
        num_mini=ler.nextInt();
        System.out.println("Digite o valor maximo que sera aceitado");
        num_max=ler.nextInt();
        }
        while(true){
            System.out.println("Digite um numero");
            x=ler.nextInt();
            if(x == 0){
                break;
            }
            ++corret;
            if((x>num_max)|| (x<num_mini)){
                --corret;
                System.out.println("Numero fora da contagem, não sera contabilizado"); 
                x=0;
            }
            soma+=x;
            
        }
        System.out.println("A soma é " + (soma - y));
        System.out.println("A quantidade de tentativas corretas foi de" + corret);
    }
}
