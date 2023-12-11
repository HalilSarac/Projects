package JavaPractice2.Week03;

import java.util.Random;
import java.util.Scanner;

public class S03_TasKagitMakas {
    /*
    Kâğıt taşı sarar
    Taş makası kırar
    Makas kağıdı keser
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random=new Random();

        int kullanicisecimi=0;
        int bilgisayarinsecim=0;
        int kullanici=0;
        int bilgisayar=0;

        do {
            System.out.println("Lütfen seciminizi sayi olarak belirtiniz: Tas icin 1, Kagit icin 2, Makas icin 3 seciniz.");
            kullanicisecimi=scan.nextInt();
            bilgisayarinsecim=random.nextInt(3)+1;

            if (kullanicisecimi==1 && bilgisayarinsecim==2){
                System.out.println("Kagit tasi sarar, bilgisayar +1 ");
                bilgisayar++;
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            } else if (kullanicisecimi==1 && bilgisayarinsecim==3) {
                System.out.println("Tas makasi kirar, kullanici +1 ");
                kullanici++;
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            } else if (kullanicisecimi==2 && bilgisayarinsecim==1) {
                System.out.println("kagit tasi sarar, kullanici +1");
                kullanici++;
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            } else if (kullanicisecimi==2 && bilgisayarinsecim==3) {
                System.out.println("Makas kagidi keser, bilgisayar +1");
                bilgisayar++;
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            } else if (kullanicisecimi==3 && bilgisayarinsecim==1) {
                System.out.println("Tas makasi kirar, bilgisayar +1");
                bilgisayar++;
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            } else if (kullanicisecimi==3 && bilgisayarinsecim==2) {
                System.out.println("Makas kagidi keser, kullanici +1 ");
                kullanici++;
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            }else {
                System.out.println("Berabere devam ediyor");
                System.out.println("kullanici:"+kullanici  +" "+ "bilgisayar:"+bilgisayar);
            }
        }
        while (kullanici!=5 && bilgisayar!=5);{
            if(kullanici>bilgisayar){
                System.out.println("Kazandinizzzzzz!!!!!");
            }else System.out.println("Kaybettiniz, bir dahaki sefere!!");
        }
    }
}
