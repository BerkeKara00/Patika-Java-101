package donguler.pratikleri;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int sayi, temp, top = 0, basamak = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();

        temp = sayi;

        while (sayi != 0) {
            sayi /= 10;
            basamak++;
        }

        for (int i = 1; i <= basamak; i++) {

            top = top + (temp % 10);
            temp = temp / 10;
        }

        System.out.println("\nSayının basamakları toplamı : " + top);

    }
}
