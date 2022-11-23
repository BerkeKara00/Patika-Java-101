
package kosullu_ifadeler;

import java.util.Scanner;

public class HavaDurumu {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bugünki hava sıcaklığını giriniz :");
        double sıcaklık = scanner.nextDouble();
        
        if (sıcaklık<5) {
            System.out.println("Kayak merkezine gidebilirsin .");
        }
        else if (sıcaklık>5 && sıcaklık<=15) {
            System.out.println("Sinemaya gidebilirsin .");
        }
        else if (sıcaklık>15 && sıcaklık<=25) {
            System.out.println("Pikniğe gidebilirsin .");
        }
        else{
            System.out.println("Yüzmek için ideal bir hava .");
        } 
           
        
        
        
        
    }
    
}
