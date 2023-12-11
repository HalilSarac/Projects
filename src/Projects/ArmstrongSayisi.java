package Projects;

import java.util.Scanner;

public class ArmstrongSayisi
{
    public static void main(String[] args)
    {
        //bir sayı giriniz:
        //girilen sayının basamaklarının basamak sayısı kadar üssünü alınız 
        //ve çıkan sonuçları toplayınız çıkan sonuç girilen sayı ile aynı ise bu sayı armstrong sayıdır.

        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        int basamakSayisi = String.valueOf(girilenSayi).length();
        int gecici = girilenSayi;
        int toplam = 0;

        //Math.pow() üs alır

        for (int i = 1; i <= basamakSayisi; i++) {

            int basamakDegeri = (gecici / (int) Math.pow(10, basamakSayisi - i)) % 10;
            int us = 1;

            for (int j = 0; j < basamakSayisi; j++) {
                us *= basamakDegeri;
            }

            toplam += us;
        }

        if (toplam == girilenSayi) {
            System.out.println(girilenSayi + " bir Armstrong sayıdır.");
        } else {
            System.out.println(girilenSayi + " bir Armstrong sayı değildir.");
        }

    }
}
