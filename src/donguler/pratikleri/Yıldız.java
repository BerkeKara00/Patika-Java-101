package donguler.pratikleri;

import java.util.Scanner;

public class Yıldız {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Sayı girin :");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >0; i--) {
            for (int k = 1; k <= (n-i) ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) -1; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }

    }
}

            