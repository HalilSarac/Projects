package JavaPractice.Week01;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //System.out.println("Lütfen Adınızı Giriniz:");
        //String name= scan.nextLine();  //
        //System.out.println(" ");
        //System.out.print("Lütfen Soyadınızı Giriniz: ");
        //String surname= scan.nextLine(); //scan.nextLine() Tüm satırı alır | scan.next() metnin ilk boşluğuna kadar alır

        //System.out.println(name+" "+surname);

       // Scanner murat = new Scanner(System.in);
       // System.out.print("Adınız: ");
       // String name = murat.nextLine();
       // System.out.print("Soyadınız: ");
       // String surname = murat.nextLine();
       // System.out.print("Şifreniz: ");
       // String pass = murat.next();
       // System.out.println("------ Sistem Kaydı Tamamlandı ------\nBilgileriniz sistemlerimize;\nAdı: "
       //         + name + "\nSoyadı: " + surname + "\nŞifre: " +
       //         pass + "\nOlarak kaydedilmiştir.");


        /*
        Öğrenciden Vize ve Final Notlarını 1.Vize Notu, 2. Vize Notu ve Final Notu olarak alan
        Yıl sonu Başarı puanını vize ortalamasının %40, Final Notunun %60 etkisi olacak şekilde hesaplayıp
        Tüm Notlarını ve Yıl Sonu Başarı Notunu yyazdıran bir kod yazınız
         */
        System.out.print("1.Vize Notunuz: ");
        double vize1= scan.nextDouble();
        System.out.print("2.Vize Notunuz: ");
        double vize2= scan.nextDouble();
        System.out.print("Final Notunuz: ");
        double finalNotu= scan.nextDouble();

        System.out.println("------ Yıl Sonu Başarı Notu Hesaplaması ------");
       //System.out.println("1.Vize Notu: "+vize1);
       //System.out.println("2. Vize Notu: " + vize2);
       //System.out.println("Final Notu: "+finalNotu);
       System.out.println("1.Vize Notu: "+vize1+"\n2. Vize Notu: " + vize2+"\nFinal Notu: "+finalNotu);
        System.out.println("Yıl Sonu Başarı Notu: "+(((vize2+vize1)/2)*0.4+finalNotu*0.6));


    }
}
