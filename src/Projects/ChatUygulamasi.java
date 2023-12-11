package Projects;

import java.util.Scanner;

public class ChatUygulamasi
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chat uygulamasına hoş geldiniz!!!");
        String merhaba = scanner.next();
        System.out.println("Merhaba!");
        String nasilsin = scanner.next();
        System.out.println("Bugün daha iyiyim siz nasılsınız kullanıcı");
        String cevap = scanner.next();

        boolean cevapbool = true;
        while (cevapbool) {
            if (cevap.equalsIgnoreCase("İyiyim")) {
                System.out.println("İyi olduğunuza sevindim, bir insanın en iyi gününde daha fazla şey öğrenebileceğini duymuştum");
                break;
            } else if (cevap.equalsIgnoreCase("Kötüyüm")) {
                System.out.println("İnsanlar her duygu biçimini yaşamalı, özel değilse neden kötüsünüz öğrenebilir miyim ?");
                Scanner scanner1 = new Scanner(System.in);
                String kotuGun = scanner1.nextLine();
                System.out.println("Anlıyorum, size tavsiyem en kısa sürede müzik dinleyerek yürüyüşe çıkmanız\n" +
                        "Bu sizin ruh sağlığınıza iyi gelecektir eminim");
                break;
            } else {
                System.out.println("Sanırım yanlış cevapladınız lütfen tekrar deneye bilir misiniz");
                cevapbool = false;
            }
        }
        System.out.println("");
        System.out.println("İyi günler dilerim, görüşmek üzere!");
    }
}
