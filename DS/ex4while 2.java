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
public class ex4 {
    public static void main(String[] args) {
        
         int n1;
         
         Scanner ler = new Scanner(System.in);
         
          System.out.printf("Digite quantos alunos há na sua sala ");
        n1 = ler.nextInt();
         
           int i = 0;
           int j = 1;
           int media = 0;
while (i<n1) {
  System.out.println("Digite a nota do "+j);
  int a = ler.nextInt();
  media = media+a;
  j++;
  i++;
 
}
int f = media/n1;
        System.out.println("Amedia da sua sala é "+f);

    }
   
}