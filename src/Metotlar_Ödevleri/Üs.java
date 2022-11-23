package Metotlar_Ödevleri;

import java.util.Scanner;

public class Üs {

    static int result = 1;
    static int üsAlma(int a, int b){
        if (a == 0){
            return 1;
        }

        result *= b;
        üsAlma(a-1,b);
        return result;
    }

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        int a, b;

        System.out.println("Tabandaki sayiyi giriniz: ");
        a = scanner.nextInt();
        System.out.println("Usteki sayiyi giriniz: ");
        b = scanner.nextInt();

        System.out.println(üsAlma(b,a));
    }

}
