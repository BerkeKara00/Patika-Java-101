
package BitirmeProjesi_MayınTarlası1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("------ MAYIN TARLASI OYUNU ------");
        System.out.println("Oyuna başlamak için boyutları giriniz ! (3x3 , 4x3 , 4x4 ...)");
        
        int satir = scanner.nextInt();
        int sütun = scanner.nextInt();

        MineSweeper m = new MineSweeper(satir, sütun);
       
        m.run();
        
    }
    
}
