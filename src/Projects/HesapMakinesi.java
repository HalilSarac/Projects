package Projects;

import java.util.Scanner;

public class HesapMakinesi
{
    
    public static void main(String[] args)
    {
        int sayi;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\t\tLütfen Yapmak istediğiniz İşlemi Seçiniz\n" +
                    "1-Toplama İşlemi\n" +
                    "2-Çıkarma İşlemi\n" +
                    "3-Çarpma İşlemi\n" +
                    "4-Bölme İşlemi\n" +
                    "5-Üslü Sayı Hesaplama\n" +
                    "6-Faktoriyel Hesaplama\n" +
                    "7-Mod Alma\n" +
                    "8-Dikdörtgende Alan ve Çevre Hesaplama\n"+
                    "0-Çıkış Yap");

            sayi = scanner.nextInt();
            switch (sayi) {
                case 1:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi1 = scanner.nextInt();
                    int sayi2 = scanner.nextInt();
                    toplama(sayi1, sayi2);
                    break;
                case 2:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi3 = scanner.nextInt();
                    int sayi4 = scanner.nextInt();
                    System.out.println(cikarma(sayi3, sayi4));
                    break;
                case 3:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi5 = scanner.nextInt();
                    int sayi6 = scanner.nextInt();
                    carpim(sayi6, sayi5);
                    break;
                case 4:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi7 = scanner.nextInt();
                    int sayi8 = scanner.nextInt();
                    bolme(sayi7, sayi8);
                    break;
                case 5:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi9 = scanner.nextInt();
                    int sayi10 = scanner.nextInt();
                    System.out.println("Girilen sayının üssü : " + ussayi(sayi9, sayi10));
                    break;
                case 6:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi11 = scanner.nextInt();
                    int sayi12 = scanner.nextInt();
                    Faktoriyel(sayi11, sayi12);
                    break;
                case 7:
                    System.out.println("Lütfen tam sayı 2 adet sayı giriniz");
                    int sayi13 = scanner.nextInt();
                    int sayi14 = scanner.nextInt();
                    System.out.println("Girilen sayının modu : " + modalma(sayi13, sayi14));
                    break;
                case 8:
                    System.out.println("Lütfen tam sayı 3 adet sayı giriniz");
                    int sayi15 = scanner.nextInt();
                    int sayi16 = scanner.nextInt();
                    alanvecevre(sayi15, sayi16);
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, belirtilen sayılardan birini giriniz");
            }
        } while (sayi != 0);
    }

    public static void toplama(int a, int b) {
        int toplam = a + b;
        System.out.println("1. Sayı ile 2. sayının toplamı : " + toplam);
    }

    public static double cikarma(double a, double b) {
        double fark = 0;
        fark = a - b;
        return fark;
    }

    public static void carpim(double a, double b) {
        double carpim = (a * b);
        System.out.println("1. Sayı ile 2. sayının çarpımı : " + carpim);
    }

    public static void bolme(double a, int b) {
        if (b == 0) {
            System.out.println("Sıfıra bölünemez");
        } else {
            double bolme1;
            bolme1 = (a / b);
            System.out.println("2 sayının birbirfine bölümü : " + bolme1);
        }
    }

    public static double ussayi(double a, double b) {
        double sonuc = 1;

        for (int us = 1; us <= b; us++) {
            sonuc = sonuc * a;

        }
        return sonuc;
    }

    public static void Faktoriyel(int a, int b) {
        int faktoriyel = 1;
        for (int i = 1; i <= a; i++) {
            faktoriyel *= i;
        }

        int faktoriyel2 = 1;
        for (int j = 1; j <= b; j++) {
            faktoriyel2 *= j;
        }
        System.out.println("1. Sayının faktoriyeli : " + faktoriyel + " \n"
                + "2. Sayının faktoriyeli : " + faktoriyel2);
    }

    public static double modalma(double a, double b) {
        double sonuc = 1;
        sonuc = a % b;
        return sonuc;
    }

    public static void alanvecevre(double a, int b) {
        double alan = a * b;
        System.out.println("Girdiğiniz sayılarla oluşturulan üçgenin alanı : " + alan);
        double cevre = 2 * (a + b);
        System.out.println("Girdiğiniz sayılarla oluşturulan üçgenin çevresi : " + cevre);
    }
}
