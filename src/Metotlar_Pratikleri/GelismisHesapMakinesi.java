package Metotlar_Pratikleri;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static double toplama(int a, int b) {
        double toplam = a + b;
        System.out.print("Toplam : ");
        return toplam;
    }

    static double çıkarma(int a, int b) {
        double fark = a - b;
        System.out.print("Fark : ");
        return fark;
    }

    static double çarpma(int a, int b) {
        double carpım = a * b;
        System.out.print("Çarpım : ");
        return carpım;
    }

    static double bölme(int a, int b) {
        double bölme = a / b;
        System.out.print("Bölüm : ");
        return bölme;
    }

    static double üs(int a, int b) {
        double üs = Math.pow(a, b);
        return üs;
    }

    static void dikdörtgen(int a, int b) {
        double cevre = (a + b) * 2;
        double alan = (a * b);

        System.out.println("Alan : " + alan + "\nÇevre : " + cevre);
    }

    static void modAlma(int a, int b) {
        int sonuc = a % b;

        System.out.println("kalan : " + sonuc);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;
        String menu = "1-Toplama\n"
                + "2-Çıkarma\n"
                + "3-Çarpma\n"
                + "4-Bölme\n"
                + "5-Üslü sayı hesaplama\n"
                + "6-Dikdörtgen Alan ve Çevre Hesabı\n"
                + "7-Mod Alma\n"
                + "0-Çıkış Yap";

        do {

            System.out.println("***************************");
            System.out.println(menu);
            System.out.println("***************************");
            System.out.print("Lütfen işleminizi seçin :");
            secim = scanner.nextInt();

            if (secim == 0) {
                System.out.println("Çıkış yapılıyor.");
                return;
            }
            System.out.print("1.sayıyı girin : ");
            int a = scanner.nextInt();
            System.out.print("2.sayıyı girin : ");
            int b = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println(toplama(a, b));
                    break;
                case 2:
                    System.out.println(çıkarma(a, b));
                    break;
                case 3:
                    System.out.println(çarpma(a, b));
                    break;
                case 4:
                    System.out.println(bölme(a, b));
                    break;
                case 5:
                    System.out.println(üs(a, b));
                    break;
                case 6:
                    dikdörtgen(a, b);
                    break;

                case 7:
                    modAlma(a, b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 0);

    }

}
