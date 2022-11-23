package temel_kavramlar;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double km;
        double tutar ;
        double acılısUcreti = 10;

        System.out.print("Gitmek istediginiz yerin km cinsinden mesafesini yazınız :");
        km = scanner.nextDouble();

        tutar = acılısUcreti + km*2.20;
        
        if (tutar<20) {
            System.out.println("Ödenecek tutar : "+20+" TL");
        }
         else {
            System.out.println("Odenecek tutar : " + tutar + " TL");
        }

    }

}
