package Projects;

import java.util.Scanner;

public class BurçHesaplama
{
    public static void main(String[] args)
    {
        //Bu örneği switch-case ve if-else kullanarak 2 farklı şekilde yapınız.
        //
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //
        //Kova Burcu : 22 Ocak - 19 Şubat
        //
        //Balık Burcu : 20 Şubat - 20 Mart
        //
        //Koç Burcu : 21 Mart - 20 Nisan
        //
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //
        //Yay Burcu : 22 Kasım - 21 Aralık

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz günü yazınız");
        int dogumgunu = scanner.nextInt();

        System.out.println("Doğum ayınızı giriniz");
        String dogumAyi = scanner.next().toLowerCase();

        switch (dogumAyi) {
            case "ocak":
                if(dogumgunu >= 1 && dogumgunu <=21){
                    System.out.println("Burcunuz Oğlak");
                }else if(dogumgunu >=22 && dogumgunu <=31){
                    System.out.println("Burcunuz Kova");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "şubat":
                if (dogumgunu >= 1 && dogumgunu <= 19){
                    System.out.println("Burcunuz Kova");
                }else if(dogumgunu >= 20 && dogumgunu <= 30){
                    System.out.println("Burcunuz Balık");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "mart":
                if (dogumgunu >= 1 && dogumgunu <= 20){
                    System.out.println("Burcunuz Balık");
                }else if (dogumgunu >= 21 && dogumgunu <=  31){
                    System.out.println("Burcunuz Koç");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "nisan":
                if (dogumgunu >= 1 && dogumgunu <= 20){
                    System.out.println("Burcunuz Koç");
                }else if (dogumgunu >= 21 && dogumgunu <= 30) {
                    System.out.println("Burcunuz Boğa");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "mayıs":
                if (dogumgunu >= 1 && dogumgunu <=21){
                    System.out.println("Burcunuz Boğa");
                }else if (dogumgunu >= 22 && dogumgunu <= 31){
                    System.out.println("Burcunuz İkizler");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "haziran":
                if (dogumgunu >= 1 && dogumgunu <=22){
                    System.out.println("Burcunuz İkizler");
                } else if (dogumgunu >= 23 && dogumgunu <= 30) {
                    System.out.println("Burcunuz Yengeç");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "temmuz":
                if (dogumgunu >= 1 && dogumgunu <= 22){
                    System.out.println("Burcunuz Yengeç");
                } else if (dogumgunu >= 23 && dogumgunu <= 31) {
                    System.out.println("Burcunuz Aslan");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "ağustos":
                if (dogumgunu >= 1 && dogumgunu <= 22){
                    System.out.println("Burcunuz Aslan");
                } else if (dogumgunu >= 23 && dogumgunu <= 31) {
                    System.out.println("Burcunuz Başak");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "eylül":
                if (dogumgunu >= 1 && dogumgunu <= 22){
                    System.out.println("Burcunuz Başak");
                }else if (dogumgunu >= 23 && dogumgunu <= 30){
                    System.out.println("Burcunuz Terazi");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "ekim":
                if (dogumgunu >= 1 && dogumgunu <= 23){
                    System.out.println("Burcunuz Terazi");
                }else if (dogumgunu >= 24 && dogumgunu <= 31){
                    System.out.println("Burcunuz Akrep");
                }else {
                    System.out.println("Hatalı giriş :D ");
                }
                break;

            case "kasım":
                if (dogumgunu >= 1 && dogumgunu <=21){
                    System.out.println("Burcunuz Akrep");
                }else if(dogumgunu >= 22 && dogumgunu <= 31){
                    System.out.println("Burcunuz Yay");
                }else {
                    System.out.println("Hatalı giriş :D");
                }
                break;

            case "aralık":
                if (dogumgunu >= 1 && dogumgunu <= 21){
                    System.out.println("Burcunuz Yay");
                } else if (dogumgunu >= 22 && dogumgunu <= 31) {
                    System.out.println("Burcunuz Oğlak");
                }else {
                    System.out.println("Hatalı giriş");
                }
                break;

        }
    }
}
