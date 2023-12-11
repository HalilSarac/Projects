package JavaPractice.Week02;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
         /*
        Karşılaştırma operatörleri
        == : oparatörün sağının soluna değer olarak eşit oldğunu gösterir
        && : (and) operatörün sağındaki ve solundaki ifadenin doğru olması gerekir.
        || : (or) operatörün sağındaki ve solundaki ifadelerden sadece birinin doğru olması yeterlidir
        ! : (not) değil anlamındadır != eşit değil !(...) parantez içindeki ifade olmamalı

         */

        /* SORU:
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         * dort islemden biri ile isleme koyup sonucunu yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen işlem yapacağınız iki sayıyı giriniz!");
        System.out.print("Birinci Sayı: ");
        double sayi1= scan.nextDouble();
        System.out.print("İkinci Sayı: ");
        double sayi2= scan.nextDouble();
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz (+,-,*,/ ):");
        char islem=scan.next().charAt(0);
        if (islem == '+'){ // if bir şart durumudur. bU şart için geçerli olan işlem {} arasına yazılır.
            System.out.println("İşlem Sonucu: "+ (sayi1+sayi2));
        } else if (islem=='-') { // if koşulu sağlanmayıp başka bir koşulu sağlayı sağlamadığına else if komutu ile bakılır.
                                // Sağlıyors{} arasına o işlem yazılır
            System.out.println("İşlem Sonucu: "+(sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("İşlem Sonucu: "+(sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("İşlem Sonucu: "+(sayi1/sayi2));
        }else { // Olası tüm ihtimaller bitince son durum else ile yapılır
            System.out.println("Yanlış işlem seçtiniz! Program Sonlandırlıyor. Benimle uğraşma");
        }


    }
}
