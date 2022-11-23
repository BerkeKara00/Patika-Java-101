package donguler.pratikleri;

import java.util.Scanner;

public class ÇiftSayiBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ortalama;
        int sayaç = 0;
        int toplam = 0;
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i %4 == 0) {
                System.out.println(i);
                toplam+=i;
               sayaç++;
            }
             
        }
        
        ortalama = toplam/sayaç;
        
        System.out.println("3 ve 4 e tam bölünen sayıların toplamı : "+toplam);
        System.out.println("Girilen sayıya kadar olan 3 ve 4 e tam bölünen sayıların ortalaması : "+ortalama);

    }

}
