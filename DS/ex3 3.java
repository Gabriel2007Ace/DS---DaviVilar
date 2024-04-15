/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex3 {
     public static void main(String[] args) {
        
           double preco, distancia, gasolina, alcool, kl, x, y;
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite quantos kl você utlizou ");
        kl = ler.nextDouble();
        
        System.out.printf("Informe a distancia percorrida ");
         distancia= ler.nextDouble();
        
        System.out.printf("Informe o preço unitário do litro do combustível ");
        preco = ler.nextDouble();
        
        x = distancia/kl;
        y = x*preco;
        
        System.out.println("kl: " +kl+ "distancia: "+distancia+"preço "+preco+"O custa da viagem foi "+y);
        

    }
    
}


