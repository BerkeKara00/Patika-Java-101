
package Metotlar_Ödevleri;

import java.util.Scanner;

public class Main {
    
 public static void main(String[] args) {
        System.out.println("Lütfen sayıyı girin.");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: "+N);
        System.out.print("Çıktısı : ");
        desen(N,N,N);
        
    }
    
 static void desen(int a,int b ,int c){
     
     if (a>0) {
         System.out.print(a+" ");
         a = a-5;
         c=a;
         desen(a, b, c);
     }
     
     else if (a<=0) {
         System.out.print(c+" ");
         c=c+5;
         if (b==c) {
             System.out.println(b);
         }else{
             desen(a, b, c);
         }
         
     }
}
}