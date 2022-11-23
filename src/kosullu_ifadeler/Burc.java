
package kosullu_ifadeler;

import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Doğduğunuz Ay :");
        int ay = scanner.nextInt();
        System.out.println("Doğduğunuz gün :");
        int gün = scanner.nextInt();
        
        if (ay == 3) {
            if (gün>=21 ) {
                System.out.println("Koç burcu");
            }
        }else if (ay == 4) {
            if (gün<=20) {
                System.out.println("Koç burcu");
            }else {
                System.out.println("Boğa burcu");
            }
        }
        else if (ay==5) {
            if (gün<=21) {
                System.out.println("Boğa burcu");
            }else {
                System.out.println("İkizler burcu");
            }
        }
         else if (ay==6) {
            if (gün<=23) {
                System.out.println("İkizler burcu");
            }else {
                System.out.println("Yengeç burcu");
            }
        }
          else if (ay==7) {
            if (gün<=22) {
                System.out.println("Yengeç burcu");
            }else {
                System.out.println("Aslan burcu");
            }
        }
        else if (ay==8) {
            if (gün<=22) {
                System.out.println("Aslan burcu");
            }else {
                System.out.println("Başak burcu");
            }
        }
        else if (ay==9) {
            if (gün<=22) {
                System.out.println("Başak burcu");
            }else {
                System.out.println("Terazi burcu");
            }
        }
        
        else if (ay==10) {
            if (gün<=22) {
                System.out.println("Terazi burcu");
            }else {
                System.out.println("Akrep burcu");
            }
        }
      
        else if (ay==11) {
            if (gün<=21) {
                System.out.println("Akrep burcu");
            }else {
                System.out.println("Yay burcu");
            }
        }
        
        else if (ay==12) {
            if (gün<=21) {
                System.out.println("Yay burcu");
            }else {
                System.out.println("Oğlak burcu");
            }
        }
        
         else if (ay==1) {
            if (gün<=21) {
                System.out.println("Oğlak burcu");
            }else {
                System.out.println("Kova burcu");
            }
        }
        
         else if (ay==2) {
            if (gün<=19) {
                System.out.println("Kova burcu");
            }else {
                System.out.println("Balık burcu");
            }
        }
        else if (ay==3) {
            if (gün<=20) {
                System.out.println("Balık burcu");
            }else {
                System.out.println("Koç burcu");
            }
        }
        else {
            System.out.println("Gecersiz giris");
        }
        
    }
    
}
