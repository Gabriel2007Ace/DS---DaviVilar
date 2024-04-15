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
public class ex16 {
    public static void main(String[] args) {
        
           double salario, ajuste, total, percentual;
           
           
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite o seu salario ");
        salario = ler.nextDouble();
        
        System.out.printf("Digite o reajuste ");
        ajuste = ler.nextDouble();
        
        
        total = salario + ajuste;
        
        percentual =(ajuste/salario)*100;

        System.out.println("Percentual de ajuste é: " + percentual + " Nova salario é: " + total);
        
    
        

    }
    
}

