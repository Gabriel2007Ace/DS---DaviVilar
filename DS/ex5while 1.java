/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        
         int n1;
         
         Scanner ler = new Scanner(System.in);
         
         
           int i = 0;
           int j = 0;
           int maior = 0;
while (i<10) {
    j++;
  System.out.println("Digite 10 números: " +j);
  int a = ler.nextInt();
  
  if(a>maior){
      maior = a;
  }

  i++;
 
}
    System.out.println("O maior numero é " +maior);
    }
   
}

