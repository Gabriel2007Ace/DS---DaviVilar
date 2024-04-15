/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex3LR {
        public static void main(String[] args) {
        
           double n1, n2, n3;
           
           
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite n1 ");
        n1 = ler.nextDouble();
        
        System.out.printf("Digite n2 ");
        n2 = ler.nextDouble();
        
        while(n2 == 0 ){
            System.out.printf("Valor Inválido \n");
            System.out.printf("Digite n3 ");
        n3 = ler.nextDouble();
        if(n3!=0){
            double divisao2 = n1/n3;
             System.out.println(divisao2);
        }
  

    }
        double divisao = n1/n2;
        
         System.out.println(divisao);
    
}
}

