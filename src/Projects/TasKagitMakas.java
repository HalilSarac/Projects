package Projects;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas
{
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int sayacBilgisayar,sayacOyuncu;
    static String dongu;
    public static void main(String[] args) {
    TasKagitMakas obj = new TasKagitMakas();
    }
    TasKagitMakas(){
        boolean whilebool = true;
        while(whilebool) {
            System.out.println("\tSıradaki Hamlenizi Yapınız");
            System.out.println("0-Taş|1-Kağıt|2-Makas");

            int bilgisayarSecim = random.nextInt(3);
            int caseSecim = scanner.nextInt();
            switch (caseSecim) {

                case 0: // Taş Bloğu
                    if (bilgisayarSecim == 0) {
                        System.out.println("Oyuncu Hamlesi : 0\n" +
                                "Bilgisayar Hamlesi : 0\n" +
                                "Bu tur berabere");
                    } else if (bilgisayarSecim == 1) {
                        System.out.println("Oyuncu Hamlesi : 0\n" +
                                "Bilgisayar Hamlesi : 1\n" +
                                "Bu turu Bilgisayar Kazandı");
                        sayacBilgisayar++;
                    } else if (bilgisayarSecim == 2) {
                        System.out.println("Oyuncu Hamlesi : 0\n" +
                                "Bilgisayar Hamlesi : 2\n" +
                                "Bu turu siz kazandınız");
                        sayacOyuncu++;
                    }
                    break;
                case 1: // Kağıt Bloğu
                    if (bilgisayarSecim == 0) {
                        System.out.println("Oyuncu Hamlesi : 1\n" +
                                "Bilgisayar Hamlesi : 0\n" +
                                "Bu turu siz kazandınız");
                        sayacOyuncu++;
                    } else if (bilgisayarSecim == 1) {
                        System.out.println("Oyuncu Hamlesi : 1\n" +
                                "Bilgisayar Hamlesi : 1\n" +
                                "Bu tur berabere");
                    } else if (bilgisayarSecim == 2) {
                        System.out.println("Oyuncu Hamlesi : 1\n" +
                                "Bilgisayar Hamlesi : 2\n" +
                                "Bu turu Bilgisayar kazandı");
                        sayacBilgisayar++;
                    }
                    break;
                case 2: // Makas bloğu
                    if (bilgisayarSecim == 0) {
                        System.out.println("Oyuncu Hamlesi : 2\n" +
                                "Bilgisayar Hamlesi : 0\n" +
                                "Bu turu bilgisayar kazandı");
                        sayacBilgisayar++;
                    } else if (bilgisayarSecim == 1) {
                        System.out.println("Oyuncu Hamlesi : 2\n" +
                                "Bilgisayar Hamlesi : 1\n" +
                                "Bu turu siz kazandınız");
                        sayacOyuncu++;
                    } else if (bilgisayarSecim == 2) {
                        System.out.println("Oyuncu Hamlesi : 2\n" +
                                "Bilgisayar Hamlesi : 2\n" +
                                "Bu tur berabere");
                    }
                    break;
                default:
                    System.out.println("Sayı belirtilen aralıkta değil lütfen tekrardan deneyiniz");
            }
            if (sayacBilgisayar == 3){
                System.out.println("Oyunu 3 - " + sayacOyuncu + " Skorla Bilgisayar kazandı");
                sayacBilgisayar = 0;
                System.out.println("Çıkmak için lütfen 'q' tuşuna basınız");
                dongu = scanner.next();
                if (dongu.equalsIgnoreCase("q")){
                    whilebool = false;
                }
            } else if (sayacOyuncu == 3) {
                System.out.println("Oyunu 3 - " + sayacBilgisayar + " Skorla Siz kazandınız");
                sayacOyuncu = 0;
                System.out.println("Çıkmak için lütfen 'q' tuşuna basınız");
                dongu = scanner.next();
                if (dongu.equalsIgnoreCase("q")){
                    whilebool = false;
                }
            }

        }
    }
}