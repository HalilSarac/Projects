package Projects;

import java.util.Scanner;

public class UcgendeAlanveCevre
{
    public static void main(String[] args)
    {
        //üçgenin üç kenar uzunluğunu kulanıcıdan aldığınız, üçgenin alanını hesaplayan bir program yazınız
        
        //üçgenin alanı = taban uzunluğu * yükseklik /2 'dir
        //diğer formül      U=(a+b+c)/2
        /*
        Alan = taban * yükselik/2
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üçgenin 1. kenar uzunluğunu giriniz");
        int kenr1 = scanner.nextInt();
        
        System.out.println("Lütfen üçgenin 2. kenar uzunluğunu giriniz");
        int kenr2 = scanner.nextInt();
        
        System.out.println("Lütfen üçgenin 3. kenar uzunluğunu giriniz");
        int kenr3 = scanner.nextInt();
        
        int alan = (kenr1 + kenr2 + kenr3)/2;
        System.out.println("alan = " + alan);
        



        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Lütfen üçgenin yükseliğini giriniz");
        int yukseklik = scanner1.nextInt();

        System.out.println("Lütfen üçgenin taban uzunluğunu giriniz");
        double taban = scanner1.nextDouble();
        
        double alan1 = (taban * yukseklik/2);
        System.out.println("Üçgenin alanı = " + alan1);
        
        
        
       


    }
}
