package kosullu_ifadeler;

import java.util.Scanner;

public class KullanıcıGirişi {

    public static void main(String[] args) {
        String kullanıcıAdı;
        String yeniKullanıcıAdı;
        String sifre;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı : ");
        kullanıcıAdı = scanner.nextLine();

        System.out.print("Şifre : ");
        sifre = scanner.nextLine();

        if (kullanıcıAdı.equals("Patika") && sifre.equals("12345")) {
            System.out.println("Kullanıcı girişi başarılı !");
            return;
        } else {
            System.out.println("Kullanıcı girişi hatalı !");
        }

        System.out.println("Kullanıcı adınızı ve şifrenizi yenilemek ister misiniz ? (e/h)");
        String cevap = scanner.nextLine();

        if (cevap.equals("e")) {
            System.out.print("Yeni kullanıcı adı giriniz : ");
            yeniKullanıcıAdı = scanner.nextLine();
            System.out.print("Yeni şifre giriniz :");
            sifre = scanner.nextLine();

            if (yeniKullanıcıAdı.equals("Patika") || sifre.equals("12345")) {
                System.out.println("Lütfen kullanıcı girişinden farklı bir kullanıcı girişi oluşturun !");
            } else {
                System.out.println("Yeni kullanıcı adı ve şifre  başarıyla oluşturuldu.");

            }

        } else if (cevap.equals("h")) {
             System.out.println("Sistemden çıkış yapılıyor.");
        }
        else {
            System.out.println("Lütfen e veya h seçeneğinden birini seçin !");
        }


    }

}
