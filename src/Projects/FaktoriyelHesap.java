package Projects;

import java.util.Scanner;

public class FaktoriyelHesap
{
    public static void main(String[] args)
    {
        // 1- Soru :2 farklı sayının faktöriyelini hesaplayıp daha sonra
        //          bu 2 sayının farkını alınız ve o sayının da faktöriyelini hesaplayınız
        //          ve ekrana 1. sayının faktöriyeli bölü
        //          2. sayının faktöriyeli çarpı 3. sayının faktöriyelini işlemini yazdırınız


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");

        int sayi2 = scanner.nextInt();
        int sayi3;

        if (sayi2>sayi1){
             sayi3 = sayi2-sayi1;
        }else {
             sayi3 = sayi1-sayi2;
        }

        int faktoriyel1 = 1;
        for (int i = 1; i <= sayi1 ; i++) {

            faktoriyel1 *= i;

        }
        System.out.println("1. sayının faktoriyeli : " + faktoriyel1);
        int faktoriyel2 = 1;
        for (int i = 1; i <= sayi2 ; i++) {

            faktoriyel2 *= i;

        }
        System.out.println("2. sayının faktoriyeli : " + faktoriyel2);

        int faktoriyel3 = 1;
        for (int i = 1; i <= sayi3 ; i++) {

            faktoriyel3 *= i;

        }
        System.out.println("2 sayının arasındaki farkın faktoriyeli : " + faktoriyel3);

        if(faktoriyel2>faktoriyel1){
            System.out.println("1. sayının faktoriyeli ve 2. sayının faktoriyelinin bölümü ve\n" +
                               "3. sayının çarpımı : " + faktoriyel2/faktoriyel1*faktoriyel3);

        }else {
            System.out.println("1. sayının faktoriyeli ve 2. sayının faktoriyelinin bölümü ve\n" +
                               "3. sayının çarpımı : " + faktoriyel1/faktoriyel2*faktoriyel3);
        }


    }
}
