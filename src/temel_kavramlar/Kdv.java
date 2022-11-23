package temel_kavramlar;

import java.util.Scanner;

public class Kdv {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tutar;

        double kdvTutar;
        double kdvliTutar;
        while (true) {

            System.out.println("Lutfen tutarı giriniz.");
            tutar = scanner.nextInt();

            if (tutar < 0) {
                System.out.println("Gecersiz deger girdiniz.");
            } else if (0 < tutar && tutar < 1000) {

                double kdvOran = 0.18;
                kdvTutar = tutar * 18 / 100;
                kdvliTutar = kdvTutar + tutar;
                System.out.println("Kdv oranı : " + kdvOran);
                System.out.println("Kdv tutarı :" + kdvTutar);
                System.out.println("Kdvli tutar : " + kdvliTutar);

            } else if (tutar < 0) {
                System.out.println("Gecersiz deger girdiniz.");
            } else {
                double kdvOran = 0.08;
                kdvTutar = tutar * 8 / 100;
                kdvliTutar = tutar + kdvTutar;
                System.out.println("Kdv oranı : " + kdvOran);
                System.out.println("Kdv tutarı :" + kdvTutar);
                System.out.println("Kdvli tutar : " + kdvliTutar);
            }

        }
    }
}
