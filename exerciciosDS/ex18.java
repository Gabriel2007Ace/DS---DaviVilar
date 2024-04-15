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
public class ex18 {
        public static void main(String[] args) {
        
           double pf, i, d, total;
           
           
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite o valopr de fabrica ");
        pf = ler.nextDouble();
        

        i = pf*0.28;
        
        d =pf*0.45;
        
        total = pf+i+d;

        System.out.println("O valor final:" +total);
        
    
        

    }
    
}


