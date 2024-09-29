/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_revisao14_pedro;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_REVISAO14_PEDRO {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       String nome=""; double sal=0; double res=0;
       double N_sal=0;
       
       while(true){
            System.out.println("Informe o nome do funcionaro");
       nome=ler.next();
           if(nome.equals("fim")){
               break;
           }
           System.out.println("Digite o salario do fucionario");
           sal=ler.nextDouble();
          
           if(sal<=150){
               res=sal*1.25;
               System.out.println("O funcionario" + nome +" recebia" + sal +
               " e agora ira receber" + res);
               N_sal=sal+sal;
                res+=res;
               sal+=sal;
           }
           else if((sal> 150) && (sal <=300)){
                res=sal*1.20;
               System.out.println("O funcionario" + nome +" recebia" + sal +
               " e agora ira receber" + res);
               N_sal=res+sal;
           }
           else if((sal> 300) && (sal <=600)){
               res=sal*1.15;
               System.out.println("O funcionario" + nome +" recebia" + sal +
               " e agora ira receber" + res);
                res+=res;
                sal+=sal;          
           }
          
           else if(sal> 600){
               res=sal*1.10;
               System.out.println("O funcionario" + nome +" recebia" + sal +
               " e agora ira receber" + res);
               N_sal=sal+sal;
                res+=res;
                sal+=sal;
           }
       }
       System.out.println("A soma dos salarios antigos é " + sal);
       System.out.println("A soma dos salarios reajustados é " + res);
       System.out.println("A diferenca deles é " + (sal-res));
    }
}
