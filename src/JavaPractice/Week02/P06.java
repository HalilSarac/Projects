package JavaPractice.Week02;

import java.util.Scanner;

public class P06 {
    /*
    Bir sayı 3'e tam bölünüyorsa sayı 3'e bölünebilir yazdırın
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi= scan.nextInt();
         if (sayi%3==0){
             System.out.println("sayı 3'e bölünebilir");
         }

    }

}
