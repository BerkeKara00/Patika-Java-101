package temel_kavramlar;

import java.util.Scanner;

public class Daire {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r, a, cevre, alan;
        System.out.print("Yarıçapı giriniz : ");
        r = scanner.nextDouble();

        cevre = 2 * Math.PI * r;

        alan = Math.PI * r * r;

        System.out.println("Dairenin cevresi : " + cevre);

        System.out.println("Dairenin alani   : " + alan);
        System.out.print("Daire Diliminin açısını giriniz: ");
        a = scanner.nextInt();

        double daireDilimiAlani = (Math.PI * (r * r) * a) / 360;

        System.out.println("Daire Diliminin Alanı: " + daireDilimiAlani);

    }

}
