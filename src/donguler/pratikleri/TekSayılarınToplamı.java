
package donguler.pratikleri;

import java.util.Scanner;

public class TekSayılarınToplamı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
       int sayi;
        
        do {            
             System.out.print("Bir sayi giriniz : ");
        sayi = scanner.nextInt();
            if (sayi%2 ==  0 || sayi %4 == 0) {
                toplam += sayi;
            }
        } while (sayi>0);
      
        System.out.println("Toplam = " + toplam);
}
}