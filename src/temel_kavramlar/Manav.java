
package temel_kavramlar;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        
           double armut = 2.14;
           double elma = 3.67;
           double domates = 1.11;
           double muz = 0.95;
           double patlıcan = 5.00;
           
           
         Scanner scanner = new Scanner(System.in);
        System.out.println("Armut kaç kilo alıcaksınız ?");
       double kg1 = scanner.nextDouble();
        System.out.println("Armut tutarı : "+kg1*armut);
        System.out.println("Elma kaç kilo alıcaksınız ?");
      double kg2= scanner.nextDouble();
         System.out.println("Elma tutarı : "+kg2*elma);
        System.out.println("Domates kaç kilo alıcaksınız ?");
       double kg3 = scanner.nextDouble();
          System.out.println("Domates tutarı : "+kg3*domates);
        System.out.println("Muz kaç kilo alıcaksınız ?");
       double kg4= scanner.nextDouble();
          System.out.println("Muz tutarı : "+kg4*muz);
        System.out.println("Patlıcan kaç kilo alıcaksınız ?");
       double kg5 = scanner.nextDouble();
          System.out.println("Patlıcan tutarı : "+kg5*patlıcan);
        
        
       double kasa = ((kg1*armut)+(kg2*elma)+(kg3*domates)+(kg4*muz)+(kg5*patlıcan));
       
        System.out.println("Toplam tutar : "+kasa);
           
    }
    
}
