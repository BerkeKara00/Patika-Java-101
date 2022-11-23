
package kosullu_ifadeler;

import java.util.Scanner;

public class SınıfGecme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double mat,fizik,turkce,kimya,müzik;
        double ortalama;
        
        System.out.print("Mat vize notu :");
        double  vize=scanner.nextDouble();
         System.out.print("Mat final notu :");
        double finalNot=scanner.nextDouble();
         System.out.print("Fizik vize notu :");
        double vize1=scanner.nextDouble();
         System.out.print("Fizik final notu :");
        double finalNot1=scanner.nextDouble();
         System.out.print("Türkçe vize notu :");
        double vize2=scanner.nextDouble();
         System.out.print("Türkçe final notu :");
        double finalNot2=scanner.nextDouble();
      System.out.print("Kimya vize notu :");
        double vize3=scanner.nextDouble();
         System.out.print("Kimya  final notu :");
        double finalNot3=scanner.nextDouble();
        System.out.print("Müzik vize notu :");
        double vize4=scanner.nextDouble();
         System.out.print("Müzik final notu :");
          double finalNot4=scanner.nextDouble();
          
          
        ortalama =( (vize*0.4 + finalNot*0.6)+(vize1*0.4 + finalNot1*0.6)+ (vize2*0.4 + finalNot2*0.6)+ (vize3*0.4 + finalNot3*0.6)+ (vize4*0.4 + finalNot4*0.6)) /5;
        
        System.out.println ("Ortalamanız :  "+ortalama);
        
        
        if (ortalama>55) {
            System.out.println("Sınıfı geçtiniz !");
        }else {
            System.out.println("Sınıfta kaldınız !");
        }
        
        
        
    }
    
}
