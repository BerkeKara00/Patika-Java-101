
package donguler.pratikleri;

import java.util.Scanner;


public class Harmonik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayi girin : ");
        int n = scanner.nextInt();
        double sonuc = 0.0;
        for (double i = 1; i <= n; i++) {
            sonuc += (1/i);
        }
        System.out.println(sonuc);
        
        
    }
    
}
