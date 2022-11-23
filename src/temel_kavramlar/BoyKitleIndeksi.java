
package temel_kavramlar;

import java.util.Scanner;

public class BoyKitleIndeksi {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
		double boy = scanner.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kg = scanner.nextDouble();
		
		double vki = kg / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz : " + vki);
        
        if (vki>25) {
            System.out.println("Kilolusunuz.");
        }
        else if (vki>18 && vki<25){
            System.out.println("İdeal kilodasınız");
        }else {
            System.out.println("Zayıfsınız");
        }
        
    }
            
    
}
