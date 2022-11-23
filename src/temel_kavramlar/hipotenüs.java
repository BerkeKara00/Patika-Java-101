package temel_kavramlar;

import java.util.Scanner;

public class hipotenüs {

    public static void main(String[] args) {

        double a, b, c, alan, cevre;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a kenarının uzunluğu: ");
        a = scanner.nextDouble();

        System.out.print("b kenarının uzunluğu: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("c kenarının uzunluğu: " + c);

        cevre = a + b + c;
        System.out.println("Çevre: " + cevre);
        alan = Math.sqrt((cevre / 2) * (cevre / 2 - a) * (cevre / 2 - b) * (cevre / 2 - c));
        System.out.println("Alan: " + alan);

    }

}
