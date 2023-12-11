package Projects;

import java.util.Random;
import java.util.Scanner;

public class CiftZar
{
    static int oyuncuZar,oyuncuZariki;
    static Scanner scanner = new Scanner(System.in);
    static String devam,zarAt1,zarAt2;
    static Random random = new Random();
    public static void main(String[] args) {
    CiftZar obj = new CiftZar();
    }
    CiftZar(){
        boolean whilebool = true;
        while (whilebool) {
            System.out.println("\t\tYapmak istediğiniz işlemi seçiniz");
            System.out.println("Zar atmak için 1'i, Çıkış yapmak için 2' yi tuşlayınız");
            int cikis = scanner.nextInt();
            if (cikis == 1) {
                System.out.println("Zar atmak için lütfen D tuşuna basınız");
                zarAt1 = scanner.next();
                if (zarAt1.equalsIgnoreCase("d")) {
                    System.out.println("Zar atılıyor...");
                    oyuncuZar = random.nextInt(1,12);
                    System.out.println("1. Oyuncu attığı zar : " + oyuncuZar);
                }
                System.out.println("Tekrar zar atmak için F tuşuna basınız");
                zarAt2 = scanner.next();
                if (zarAt2.equalsIgnoreCase("f")) {
                    System.out.println("Zar atılıyor...");
                    oyuncuZariki = random.nextInt(1,12);
                    System.out.println("2. Oyuncunun attığı zar : " + oyuncuZariki);
                }
                if (oyuncuZar > oyuncuZariki) {
                    System.out.println("İlk başlayacak olan 1. oyuncu lütfen devam etmek için Q tuşuna basınız");
                } else if (oyuncuZar < oyuncuZariki) {
                    System.out.println("İlk başlayacak olan 2. oyuncu lütfen devam etmek için Q tuşuna basınız");
                } else{
                    System.out.println("İşlem berabere yeniden zar atınız,devam etmek için lütfen Q tuşuna basınız");
                }
                devam = scanner.next();
                if (devam.equalsIgnoreCase("q")) {
                    System.out.println("Tekardan zar atılıyor...");
                }
            } else if (cikis == 2) {
                System.out.println("Çıkış Yapılıyor....");
                whilebool = false;
            }
        }
    }
}
