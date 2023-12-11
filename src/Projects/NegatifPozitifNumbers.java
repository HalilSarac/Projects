package Projects;

import java.util.Scanner;

public class NegatifPozitifNumbers
{
    public static void main(String[] args)
    {
        /*
        Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        yazdirin
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scanner.nextInt();

        if (sayi % 2 != 0){
            if (sayi < 0 ){
                System.out.println("Girdiğiniz sayı Negatif tek sayıdır");
            }else System.out.println("Girdiğiniz sayı Pozitif tek sayıdır");
        }else if (sayi % 10 == 0){
            System.out.println("Girdiğiniz sayı hem çittir hem de 10'un katıdır");
        }else System.out.println("Girdiğiniz sayı 10'un katı değildir");
    }
}
