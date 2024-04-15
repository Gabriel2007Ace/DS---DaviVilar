/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class JavaApplication1 {

  public static void main(String[] args) {
        
           double anos, salario, vendas, total;
           
           
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite o seu nome ");
        String nome = ler.nextLine();
        
        System.out.printf("Digite o seu salario ");
        salario = ler.nextDouble();
        
        System.out.printf("Digitre lucro em vendas ");
        vendas = ler.nextDouble();
        
        total = (vendas*0.15)+salario;
        
        
        
        
        System.out.println("Seru nome é " + nome + "Seu salario é " +salario+ "Seu salario final é "+ total);
        
    
        

    }
    
}


