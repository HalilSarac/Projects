package Projects;

import java.util.Scanner;

public class mutlakDeger
{
    public static void main(String[] args)
    {
        //kullanıcıdan bir sayı alın ve mutlak değerini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi = scanner.nextDouble();
        double mutlakDeger = (sayi<0) ? -sayi : sayi;

        System.out.println("Sayının mutlak değeri : " + mutlakDeger);
    }

}
