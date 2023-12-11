package JavaPractice2.Week04;

import java.util.Scanner;

public class S01_Method_SayininTersi {
    /*
    Soru: Kullanicidan sonu 0'dan farkli bir rakam ile biten bir tamsayi alip,
    sayinin tersini yazdiran bir method olusturunuz.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("Sayinin tersi:"+tersinibul(sayi));
    }
    static int tersinibul(int sayi){
        int terssayi=0;
        while (sayi!=0){
            int basamak=sayi%10;
            terssayi=terssayi*10+basamak;
            sayi=sayi/10;
        }
        return terssayi;
    }

}
