package Projects;

import java.util.Scanner;

public class AsalBuldurma_Method
{
    public static void main(String[] args)
    {
        //Metotlar kullanarak kullanıcıdan girilen sayının asal olup olmama durumunu ekrana yazdırın
        int sayi;
        do {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        sayi = scanner.nextInt();
        asal(sayi);

        }while(sayi != 0);
    }
    public static void asal (int a)
    {
        int flag = 10;

        for (int i = 2; i < a-1; i++) {

            if (a % i ==0){
                flag++;
                break;
            }
        }
        if (flag == 10){
            System.out.println("Verilen sayı asal");
        }else{
            System.out.println("Verilen sayı asal değil");
        }
    }
}
