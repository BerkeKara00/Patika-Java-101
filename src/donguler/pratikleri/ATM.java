package donguler.pratikleri;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kullanıcıAdı, sifre;
        int giriş = 3;
        int bakiye = 1500;
        int islem;

        String islemler = "1-Para yatırma"
                + "\n2-Para Çekme"
                + "\n3-Bakiye Sorgula"
                + "\n4-Çıkış Yap ";

        while (giriş > 0) {
            System.out.print("Kullanıcı adı : ");
            kullanıcıAdı = scanner.nextLine();
            System.out.print("Şifre : ");
            sifre = scanner.nextLine();

            if (kullanıcıAdı.equals("Patika") && sifre.equals("12345")) {
                System.out.println("Bankaya Hoş geldiniz !");

                do {             
                    System.out.println("***************************");
                    System.out.println(islemler);
                    System.out.println("***************************");
                    System.out.print("Lütfen işleminizi seçiniz : ");
                    islem = scanner.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int paraMiktarı = scanner.nextInt();
                            bakiye += paraMiktarı;
                            break;

                        case 2:
                            System.out.print("Para miktarı : ");
                            paraMiktarı = scanner.nextInt();
                            if (paraMiktarı > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= paraMiktarı;
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;

                        case 4:
                            System.out.println("Çıkış yapılıyor ! ");
                            return;          
                            
                            default:
                                System.out.println("Hatalı seçim !");
                                break;
                    }
                } while (giriş != 4);break;
                    
            }else {
                giriş--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (giriş==0) {
                   System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkınız : " + giriş);
                }
                
            }

        }

    }
}
