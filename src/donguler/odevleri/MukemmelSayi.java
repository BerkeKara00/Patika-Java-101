
package donguler.odevleri;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
          System.out.print("Bir sayi giriniz: ");
        int n=scanner.nextInt();
        int i=1;
        int toplam=0;
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
                toplam+=i;
            }
            i++;
        }
        System.out.print("toplam: "+toplam+"\n");
        if(toplam==n){
            System.out.println(n+" Mukemmel sayidir!");
        }
        else{
            System.out.println(n+" Mukemmel sayi degildir.");
        }
        
    }
    
}
