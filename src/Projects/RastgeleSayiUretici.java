package Projects;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSayiUretici {
    Random random = new Random();
    public int max;
    public int min;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        RastgeleSayiUretici obj = new RastgeleSayiUretici();
    }

    RastgeleSayiUretici() {
        boolean dongu = true;
        while (dongu) {
                System.out.println("Maxsimum sayıyı giriniz");
                max = scanner.nextInt();

                System.out.println("Minimum sayıyı giriniz");
                min = scanner.nextInt();

                if (min >= max) {
                    System.out.println("Yanlış sayı aralığı girdiniz lütfen tekrardan deneyiniz");
                }else {
                    int randomSayi = random.nextInt((max - min) + 1) + min;
                    System.out.println("Üretilen random sayi : " + randomSayi);
                    dongu = false;
                }
        }
    }
}
