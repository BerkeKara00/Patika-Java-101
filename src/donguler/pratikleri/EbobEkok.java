package donguler.pratikleri;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        int n1, n2,ebob, ekok;
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1 degerini giriniz :");
        n1 = scanner.nextInt();

        System.out.print("n2 degerini  giriniz :");
        n2 = scanner.nextInt();

        if (n1 > n2) {
            ebob = n1;
            ekok = n1;
        } else {
            ebob = n2;
            ekok = n2;
        }

        while (n1 % ebob != 0 || n2 % ebob != 0) {
            ebob -= 1;
        }

        while (ekok % n1 != 0 || ekok % n2 != 0) {
            ekok += 1;
        }

        System.out.println("EBOB = " + ebob);
        System.out.println("EKOK = " + ekok);

    }

}
