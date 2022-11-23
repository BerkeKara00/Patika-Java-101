
package donguler.pratikleri;

import java.util.Scanner;

public class UsluSayı {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int sayi ,üs;
        int toplam = 1;
        System.out.println("Üssü alınacak sayıyı giriniz : ");
        sayi=scanner.nextInt();
        System.out.println("Sayının üssünü giriniz : ");
        üs = scanner.nextInt();
      
        for (int i = 1; i <= üs; i++) {
            toplam *=sayi;       
        }
  
        System.out.println(toplam);
    }
    
}
