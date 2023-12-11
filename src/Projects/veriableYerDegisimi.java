package Projects;

import java.util.Scanner;

public class veriableYerDegisimi
{
    public static void main(String[] args)
    {
        //iki veriyi geçici bir veriable kullanmadan yapma metodu

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz");
        int ilk = scanner.nextInt(); //ilk = 25 ise

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int iki = scanner.nextInt(); //iki = 35 ise

        ilk = ilk + iki; // ilk = 60 iki = 35
        iki = ilk - iki; // ilk = 60 iki = 25
        ilk = ilk - iki; // ilk = 35 iki = 25

        System.out.println("İlk girilen sayının değeri : " + ilk);
        System.out.println("ikinci girilen sayının değeri : " + iki);

    }




}
