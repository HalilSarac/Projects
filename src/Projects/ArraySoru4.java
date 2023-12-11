package Projects;

import java.util.Scanner;

public class ArraySoru4 {
    public static int sayiAdedi = 0;
    static Scanner scanner = new Scanner(System.in);
    public static int[] arr = {1, 4, 5, 7, 8, 5, 2, 4, 6, 8};
    public static int arananSayi = 0;

    public static void main(String[] args) {
        // Verilen bir array'de istenen bir elemanın var olup olmadığını
        // ve varsa kaç kere kullanıldığını yazdıran bir method oluşturun
        varMi();
    }

    public static void varMi() {
        System.out.println("Lütfen aramak istediğiniz rakamı giriniz");
        arananSayi = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arananSayi == arr[i]) {
                sayiAdedi++;
            }
        }
        if (sayiAdedi != 0) {
            System.out.println("Aradığınız sayı " + sayiAdedi + " Defa kullanılmıştır");
        } else {
            System.out.println("Aradığınız sayı hiç kullanılmamıştır");
        }
    }
}
