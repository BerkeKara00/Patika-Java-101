
package kosullu_ifadeler;

import java.util.Scanner;

public class SayıSıralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c ;
        System.out.println("Üç tane sayı giriniz :");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
     
        if (a>b && a >c) {
            if (b >c) {
                System.out.println("Kucukten buyuge sıralama : "+c +" "+b+" "+a);
            }else{
                 System.out.println("Kucukten buyuge sıralama : "+b +" "+c+" "+a);
            }
        }
        else if (b>a && b>c) {
            if (a>c) {
                System.out.println("Kucukten buyuge sıralama : "+c + " "+a+" "+b);
            }else {
               System.out.println("Kucukten buyuge sıralama : "+a+ " "+c+" "+b);
            }
        }
        else if (c>a && c>b) {
            if (a>b) {
                System.out.println("Kucukten buyuge sıralama : "+b+ " "+a+" "+c);
            }else{
                System.out.println("Kucukten buyuge sıralama : "+a + " "+b+" "+c);
            }
        }
        
        
    }
    
}
