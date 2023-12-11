package JavaPractice.Week02;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın.
         */
        // Tek satırlık yorum eklemek için kullanılır.
        // İkinci tek satır


        /*
        birden çok satırlı yorum
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz: ");
        System.out.print("Birinci sayı: ");
        double sayi1=scan.nextDouble();
        System.out.print("İkinci sayı: ");
        double sayi2=scan.nextDouble();
      //  System.out.println("Sayıların bölümü: "+(int)(sayi1/sayi2));
        int bolum=(int)(sayi1/sayi2);
        System.out.println("bolum = " + bolum);





    }
}
