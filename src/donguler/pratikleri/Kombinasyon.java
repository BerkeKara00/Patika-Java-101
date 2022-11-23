
package donguler.pratikleri;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       int n = 1, r = 1, nDeger = 1, rDeger = 1, xDeger = 1, x, c;

        System.out.println("Lutfen n degerini giriniz: ");
        n = scanner.nextInt();

        System.out.println("Lutfen r degerini giriniz: ");
        r = scanner.nextInt();

        x = (n - r);


        for (int i = 1; i <= n; i++) {
            nDeger *= i;

        }
        for (int i = 1; i <= r; i++) {
            rDeger *= i;

        }
        for (int i = 1; i <= x; i++) {
            xDeger *= i;

        }
        c = nDeger / (rDeger * xDeger);
        System.out.println(c);
        
        
        
    }
    
}
