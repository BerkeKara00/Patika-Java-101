
package kosullu_ifadeler_odevleri;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int artikYil;
        
        System.out.print("Lütfen bir yıl giriniz :");
        artikYil=scanner.nextInt();
        
        if ((artikYil % 4 == 0) && (artikYil % 100 != 0) || (artikYil % 400 ==0)) {
            System.out.println(artikYil + " artık yıldır");
        } else {
            System.out.println(artikYil + " artık yıl değildir");
        }
        
       
        
        
    }
    
}
