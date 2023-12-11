package Projects;

import java.util.Scanner;

public class ArtikYilHesaplama
{
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz");
        int yil = scanner.nextInt();

        if(yil % 4 == 0 && yil % 100 != 0){
            System.out.println("Girilen yıl artık yıldır");
        }else if (yil % 400 == 0){
            System.out.println("Girilen yıl artık yıldır");
        }else {
            System.out.println("Girilen yıl artık yıl değildir");
        }


       /* Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan başlangıç ve bitiş yıl bilgilerini alınması
        System.out.print("Başlangıç yılını girin: ");
        int baslangicYil = scanner.nextInt();
        System.out.print("Bitiş yılını girin: ");
        int bitisYil = scanner.nextInt();

        // Artık yılların kontrol edilip yazdırılması
        System.out.println("Artık Yıllar:");

        int kontrolYil = baslangicYil;

        do {
            if (artikYilMi(kontrolYil)) {
                System.out.println(kontrolYil);
            }
            kontrolYil++;
        } while (kontrolYil <= bitisYil);
    }

    static boolean artikYilMi(int yil) {

        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

        */

    }



}
