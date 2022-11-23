
package donguler.odevleri;

import java.util.Scanner;

public class MaxMinBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int buyuk=0,kucuk=0;
        
        System.out.println("Kaç tane sayı giriceksiniz ?");
        n = scanner.nextInt();
        int sayi;
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" . sayıyı giriniz :");
            sayi = scanner.nextInt();
            
            if (i == 1) {
                buyuk = sayi;
                kucuk = sayi;
            }
            
            else  if (sayi > buyuk) {
            buyuk = sayi;
           
        }
            else  {
            kucuk = sayi;
            
        }
        }
        
        
        
        System.out.println("En buyuk sayi : "+buyuk);
        System.out.println("En kucuk sayi :  "+ kucuk);
       
        
        
        
        
        
         
        
        
        
        
        
    }
    
}
