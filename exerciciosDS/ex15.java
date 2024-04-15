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
public class ex15 {
     public static void main(String[] args) {
        
           double branco, nulo, total, valido, n1, n2 ,n3;
           
           
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite votos brancos ");
        branco = ler.nextDouble();
        
        System.out.printf("Digite votos nulos ");
        nulo = ler.nextDouble();
        
        System.out.printf("Digitre votos validos ");
        valido = ler.nextDouble();
        
        total = branco+nulo+valido;
        
        n1 = (branco/total)*100;
        n2 = (nulo/total)*100;
        n3 = (valido/total)*100;
        
        
        
        
        System.out.println("branco: " + n1 + " nulo: " + n2 + " valido: "+ n3 + " total de eleitores "+ total);
        
    
        

    }
    
}




