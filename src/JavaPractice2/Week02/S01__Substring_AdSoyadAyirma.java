package JavaPractice2.Week02;

import java.util.Scanner;

public class S01__Substring_AdSoyadAyirma
{
    public static void main(String[] args)
    {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // adinin ilk harfi buyuk digerleri kucuk,
        // soyadinin tamami büyük harfle yazacak sekilde ad ayrı soyad ayrı sekilde alt alta ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfenn adınızı soy adınızı giriniz");
        String adsoyad = scanner.nextLine();

        //String ad=adsoyad.substring(0,adsoyad.indexOf(" "));
        //String soyad=adsoyad.substring(adsoyad.indexOf(" ")+1);

        String ad= adsoyad.substring(0,1).toUpperCase()+adsoyad.substring(1,adsoyad.indexOf(" ")).toLowerCase();
        String soyad= adsoyad.substring(adsoyad.indexOf(" ")+1).toUpperCase();

        System.out.println("Isim: "+ad +"\nSoyisim: "+ soyad);
    }
}
