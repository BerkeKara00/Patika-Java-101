
package kosullu_ifadeler_odevleri;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int dogumYılı;
        System.out.print("Lütfen doğım yılınızı giriniz :");
        dogumYılı=scanner.nextInt();
        
        if (dogumYılı%12 == 0) {
            System.out.println("Maymun");
        }
        else if (dogumYılı%12 ==  1) {
            System.out.println("Horoz");
        }
        else if (dogumYılı%12 ==  2) {
            System.out.println("Köpek");
        }
        else if (dogumYılı%12 ==  3) {
            System.out.println("Domuz");
        }
        else if (dogumYılı%12 ==  4) {
            System.out.println("Fare");
        }
        else if (dogumYılı%12 ==  5) {
            System.out.println("Öküz");
        }
        else if (dogumYılı%12 ==  6) {
            System.out.println("Kaplan");
        }
        else if (dogumYılı%12 ==  7) {
            System.out.println("Tavşan");
        }
        else if (dogumYılı%12 ==  8) {
            System.out.println("Ejderha");
        }
        else if (dogumYılı%12 ==  9) {
            System.out.println("Yılan");
        }
        else if (dogumYılı%12 ==  10) {
            System.out.println("At");
        }
        else if (dogumYılı%12 ==  11) {
            System.out.println("Koyun");
        }
        else {
            System.out.println("Gecersiz islem !");
        }
    }
    
}
