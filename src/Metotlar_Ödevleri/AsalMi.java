package Metotlar_Ödevleri;

import java.util.Scanner;

public class AsalMi {

    static boolean Asalmi(int a) {
        int sayac = 0;
        for (int i = 2; i < a; i++) {

            if (a % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        int a = scanner.nextInt();

        if (Asalmi(a) && a != 1) {
            System.out.println(a + " Asal sayi !");
        } else {
            System.out.println(a + " Asal sayı değil !");
        }

    }

}
