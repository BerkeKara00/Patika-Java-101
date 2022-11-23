package donguler.odevleri;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b = 1, sonuc = 0;

        for (int i = 0; i < 10; i++) {

            a = b;

            b = sonuc;

            sonuc = a + b;
            
            System.out.println(sonuc);

        }

    }
}
