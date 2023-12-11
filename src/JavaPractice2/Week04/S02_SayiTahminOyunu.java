package JavaPractice2.Week04;

import java.util.Random;
import java.util.Scanner;

public class S02_SayiTahminOyunu {

    /* BILGISAYAR 0-100 ARASINDA BIR SAYI TUTUP, KULLANICIDAN TAHMIN ISTER
     ve KULLANICI SAYIYI BULANA KADAR "DAHA KUCUK VEYA DAHA BUYUK SAYI SÖYLE" DIYE YOL GOSTERIR
     BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR
     */

    public static void main(String[] args) {

        Random random=new Random();
        int bilgisayarinsayi=random.nextInt(100);
        System.out.println("Hadi oyun oynayalim :)");
        Scanner scan=new Scanner(System.in);
        int kullanicisayi=0;
        int count=1; //while döngüsü icin sayaca ihtiyac var, onun icin olusturduk
        do {
            if (count==1) {
                System.out.println("0 ile 100 arasi sayi tuttum, hadi tahmin et:");
            } else if (bilgisayarinsayi>kullanicisayi) {
                System.out.println("Daha büyük sayi tahmin etmelisin");
            }else {
                System.out.println("Daha kücük sayi tahmin etmelisin");
            }
            kullanicisayi=scan.nextInt();
            if (kullanicisayi==bilgisayarinsayi){
                System.out.println("Tebrikler!!! "+count+". tahminde bildinizzzz!!! ");
            }else {
                System.out.println("Denemeye devam et");
            }
            count++;
        }
        while (bilgisayarinsayi!=kullanicisayi);
    }
}