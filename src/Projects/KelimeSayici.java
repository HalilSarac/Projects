package Projects;

import java.util.Scanner;

public class KelimeSayici
{
    String cumle;
    Scanner scanner = new Scanner(System.in);
    public String[] kelimeler;
    public static void main(String[] args) {

        KelimeSayici obj = new KelimeSayici();
    }

    KelimeSayici (){
        System.out.println("Lütfen bir cümle ya da metin giriniz");
        cumle = scanner.nextLine();
        kelimeler = cumle.split(" ");

        int sayac = 0;
        for (int i = 0; i < kelimeler.length; i++) {

            sayac ++;
        }
        System.out.println("Cümlede " + sayac + " adet kelime vardır");

    }
}
