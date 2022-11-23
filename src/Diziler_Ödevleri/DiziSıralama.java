package Diziler_Ödevleri;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSıralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int dizi[] = new int[n];

        int t;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ".elaman :");
            dizi[i] = scanner.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] >= dizi[i]) {
                    t = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = t;
                }

            }

        }

        System.out.print("Sıralama : ");

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");

        }

        System.out.println("");

    }
}
