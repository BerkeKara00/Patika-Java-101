package kosullu_ifadeler;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        System.out.println("1-Toplama işlemi\n2-Çıkarma işlemi\n3-Çarpma işlemi\n4-Bölme işlemi\n");

        System.out.println("Yapılacak işlemi seçiniz.");
        int islem = scanner.nextInt();
        System.out.print("1.sayıyı giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("2.sayıyı giriniz : ");
        n2 = scanner.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme : " + (n1 / n2));
                break;
            default:
                System.out.println("Gecersiz islem");
                break;
        }

    }

}
