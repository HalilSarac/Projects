package Projects;

import java.util.Scanner;

public class HesapMakinesi_Constructor
{
    public Scanner scanner = new Scanner(System.in);
    public int sayi,sayi1,sayi2;
    public static void main(String[] args) {

        HesapMakinesi_Constructor obj = new HesapMakinesi_Constructor();
    }

    HesapMakinesi_Constructor(){
        boolean dongu = true;
        while(dongu) {
            System.out.println("\t\tLütfen Yapmak istediğiniz İşlemi Seçiniz\n" +
                    "1-Toplama İşlemi\n" +
                    "2-Çıkarma İşlemi\n" +
                    "3-Bölme işlemi\n" +
                    "4-Çarpma İşlemi\n"+
                    "5-Çıkış yap");
            sayi = scanner.nextInt();
            switch (sayi) {
                case 1: // toplama
                    System.out.println("Lütfen 2 adet tam sayı giriniz");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    HesapMakinesi.toplama(sayi1, sayi2);
                    break;
                case 2:
                    System.out.println("Lütfen 2 adet tam sayı giriniz");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    System.out.println("1. sayı ile 2. sayının farkı = " + HesapMakinesi.cikarma(sayi1, sayi2));
                    break;
                case 3:
                    System.out.println("Lütfen 2 adet tam sayı giriniz");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    HesapMakinesi.bolme(sayi1, sayi2);
                    break;
                case 4:
                    System.out.println("Lütfen 2 adet tam sayı giriniz");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    HesapMakinesi.carpim(sayi1, sayi2);
                    break;
                case 5:
                    System.out.println("Çıkış Yapılıyor...");
                    dongu = false;
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, belirtilen sayılardan birini giriniz");
            }
        }
    }
}
