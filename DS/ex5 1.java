/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex5 {
     public static void main(String[] args) {
        
           int anos, meses, dias, total;
     
       Scanner ler = new Scanner(System.in);
        
        
      
                
        System.out.printf("Digite quantos anos você tem ");
        anos = ler.nextInt();
        
        System.out.printf("Digite quantos meses você tem ");
        meses = ler.nextInt();
        
        System.out.printf("Digite quantos dias você tem ");
        dias = ler.nextInt();
        
        anos = anos*365;
        meses = meses*30;
        
        total = anos + meses + dias;
        
        System.out.println("A sua idade em dia é " + total);
        
    
        

    }
    
}

