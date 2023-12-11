package JavaPractice2.Week05;

import java.util.Scanner;

public class ATM
{
     /*
         ATM EKRANI VE ISLEMLER
    -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
       eger herhangi birini yanlis girerse tekrar girmesini isteyin.
    -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
    -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
    -Menu listesinde;
           Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
           islemleri olacaktır.
    -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
    -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
        eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
   - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
     */

    static String kartno = "123456";
    static String sifre = "1234";
    static Scanner scanner = new Scanner(System.in);
    static double bakiye = 30000;

    public static void main(String[] args) {
        giris();
    }

    private static void giris() {
        System.out.println("\t\t***************T130Bank***************\n"+
                "Güvenliginiz icin Kart No ve sifrenizi baskalari ile paylasmayiniz");
        System.out.println("KART NUMARANIZI GİRİNİZ");
        String kkartNo = scanner.nextLine();

        System.out.print ("SİFRENİZİ GİRİNİZ: ");
        String kSifre = scanner.nextLine();
        System.out.println("");

        kkartNo = kkartNo.replaceAll("\\s","");

        if (kkartNo.equals(kartno) && kSifre.equals(sifre)){
            menu();
        } else {
            System.out.println(" Hatalı giriş yaptınız, Tekrar deneyiniz! ");
            giris();
        }

    }

    private static void menu() {
        System.out.println("Yapmak istediginiz işlemin numarasını tuslayınız:\n"+
                "1.Bakiye Sorgulama\n"+
                "2.Para Yatirma\n"+
                "3.Para Cekme\n"+
                "4.Para Gonderme\n"+
                "5.Sifre Degistirme\n"+
                "6.Cıkıs\n"+
                "SECIM: ");

        int secim = scanner.nextInt();

        switch (secim){

            case 1: {
                bakiyeSorgulama();
                break;
            }
            case 2:{
                System.out.println("Yatiracağınız miktarı giriniz: ");
                double miktar = scanner.nextDouble();
                paraYatirma(miktar);
            }
            case 3:{

            }
            case 4: {

            }
            case 5:{

            }
            case 6:{
                System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz");
            }
            default:{
                System.out.println("Hatalı değer girdiniz tekrar deneyiniz");
                menu();
            }

        }

    }
    private static void paracekme(double miktar){
        if (miktar<bakiye){
            bakiye-=miktar;
            bakiyeSorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
        }
    }
    private static void paraYatirma(double miktar){
        bakiye+=miktar;
        bakiyeSorgulama();
    }
    private static void bakiyeSorgulama() {
        System.out.println("Bakiyeniz: " + bakiye);
        menu();

    }
}
