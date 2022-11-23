
package donguler.pratikleri;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sayi;
        System.out.print("Bir sayı  giriniz :");
        sayi = scanner.nextInt();
        
        for (int i = 1; i <=  sayi;  i*=4) {
            System.out.println(i);
            
        }
         for (int i = 1; i <=  sayi;  i*=5) {
            System.out.println(i);
            
        }
        
    }
    
}
