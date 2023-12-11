package Projects;

import java.util.Scanner;

public class Fibonacci
{
    /*

        Java'da metotlar ile fibonacci serisi bulan program yapıyoruz.

     */

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int sayi = scanner.nextInt();

        for (int i = 0; i < sayi ; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci (int n){
        int a = 0,b =1,sonuc =0;

        for (int i = 2; i <= n ; i++)
        {

            sonuc = a+b;
            a = b;
            b = sonuc;

        }
        return sonuc;
    }
}
