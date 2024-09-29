/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao04_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO04_Pedro {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       double cateto1; double cateto2; double hip;
     
       System.out.println("Informe o valor do primeiro cateto");
       cateto1=ler.nextDouble();
        System.out.println("Informe o valor do segundo cateto");
       cateto2=ler.nextDouble();
        System.out.println("Informe o valor da hipotenusa");
       hip=ler.nextDouble();
      while(true){ 
       if((cateto1 <= hip) && (cateto2 <= hip)){
           break;
       }
           System.out.println("Vc escreveu um cateto maior que a hipotenusa ");
           
       System.out.println("Informe o valor do primeiro cateto");
       cateto1=ler.nextDouble();
        System.out.println("Informe o valor do segundo cateto");
       cateto2=ler.nextDouble();
        System.out.println("Informe o valor da hipotenusa");
       hip=ler.nextDouble();
       
      }
      if((cateto1 == cateto2)&&(cateto2 == hip)&& (cateto1 == hip)){
          System.out.println("É um triangulo equilatero");
      }
      else if((cateto1==cateto2)||(cateto2==hip)||(cateto1==hip)){
          System.out.println("Triangulo isosceles");
      }
      else if((cateto1!=cateto2)&&(cateto2!=hip)&&(cateto1!=hip)){
           System.out.println("Triangulo escaleneo");
      }
    }
}
