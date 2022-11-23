package kosullu_ifadeler_odevleri;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int tip;
        double km, yaş, tutar,toplamTutar=0,top;

        Scanner scanner = new Scanner(System.in);
       /* System.out.print("Mesafeyi km cinsinden giriniz : ");
        km = scanner.nextDouble();

        System.out.print("Yaşınızı Giriniz : ");
        yaş = scanner.nextDouble();

        System.out.println("Seyahat tipinizi seçiniz :");
        System.out.println("1-Tek gidiş\n2-Gidiş dönüş");
        tip = scanner.nextInt();

        tutar = km * 0.10;

        if ((km > 0) && (yaş > 0)) {
            if (yaş < 12) {
                toplamTutar = tutar - (tutar * 0.5);
            } else if ((yaş >= 12) && (yaş < 24)) {
                toplamTutar = tutar - (tutar * 0.1);
            } else if ((yaş>=24)&&(yaş<=65)) {
                toplamTutar=tutar;
            } else if (yaş > 65) {
                toplamTutar = tutar - (tutar * 0.3);
            }if (tip==2){
                toplamTutar=(toplamTutar-(toplamTutar*0.2))*2;
            } else if (tip==1) {
                toplamTutar=toplamTutar;
            }
        }else {
            System.out.println("Hatalı veri girişi.\nLütfen pozitif bir değer giriniz!");
        }

        System.out.println("Toplam Tutar :" + toplamTutar);*/

  for (int k = 0; k < 9; k++) {
    System.out.print("*");   
    if (k == 3)              
        break;               
}  
    }
}