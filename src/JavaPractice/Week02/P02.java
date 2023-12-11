package JavaPractice.Week02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {


        /*
        Operatörler

        sayi+=1  sayı değerini 1 arttırıp yeni sayı değeri olarak atar
        sayı-=n  sayı değerini n azaltıp yeni sayı değer olarak atar
        sayı*=n  sayı değerini n ile çarpar yeni sayı değer olarak atar
        sayı/=n  sayı değerini n e bölüp yeni sayı değer olarak atar
        sayı%n  %(modules) n ile bölümünden kalan

         */
        // 3 basamaklı bir int a değeri atayarak. bu a değerini 5 arttırıp 7 azaltıp 10 ile bölümünden kalanı bulunuz

       // int a=376;
       // System.out.println("a = " + a); // 376
       // a+=5; // a=a+5
       // System.out.println("a = " + a); // 381
       // System.out.println((a-7)); // 374
       // System.out.println(a); // 381
       // a-=7; //a=a-7
       // System.out.println("a = " + a); // 374
       // a=a%10;  //bir sayının 10 ile bölümünden kalan o sayının birler basmağını verir
       // System.out.println("a = " + a); // 4
        /*
        soru:
        Kullanıcıdan decimal bir sayı alıp bu sayının binary karşılığını yazdırın.
        Decimal : 10'luk taban (Günlük hayat 0,1,2,3,4,5,6,7,8,9)
        Binary  : 2'lik tabandaki karşılığıdır. (0,1)
         */

        Scanner scan=new Scanner(System.in);
      // System.out.println("Lütfen bir tamsayı giriniz");
      // int sayi= scan.nextInt();
      // System.out.println("Girdiğiniz sayı : "+sayi);
      // int kalan1=sayi%2;
      // sayi/=2;
      // int kalan2=sayi%2;
      // sayi/=2;
      // int kalan3=sayi%2;
      // sayi/=2;
      // System.out.println("Girdiğiniz sayının binary karşılığı :"+sayi+""+kalan3+""+kalan2+""+kalan1);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi10= scan.nextInt();
        String binaryDeger=Integer.toBinaryString(sayi10);
        System.out.println(binaryDeger);

        /*
       birden çok satırlı yorum
         */














    }
}
