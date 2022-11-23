package Diziler_Pratikleri;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiMaksMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int list[] = {5, 10, 15, 16, 22, 25, 56, 3};
        int min = list[0];
        int max = list[0];

        System.out.println("Dizi : " + Arrays.toString(list));

        System.out.print("Girilen sayı :");
        int sayi = scanner.nextInt();

        for (int i : list) {
            if (i > sayi) {
                max = i;
                break;
            }

            if (sayi > i) {
                min = i;
            }
        }
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);

    }

}
