package JavaPractice.Week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_List {

    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {

        List<Integer> not=new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Not girişi için N tuşuna basınız");
        char devam=scan.next().charAt(0);
        while(devam=='N'){
            System.out.print("Lütfen Notu Giriniz: ");
            not.add(scan.nextInt());
            System.out.println("Yeni not girişi için N tuşuna basınız.\n\nNot girişi bitince X tuşuna basınız");
            devam=scan.next().charAt(0);
        }
        System.out.println(not);
        int toplam=0;
        for (int i = 0; i < not.size(); i++) {
            toplam+=not.get(i);
        }
        double ortalama=0;
        ortalama=toplam/ not.size();
        System.out.println("Sınıf Ortalama = " + ortalama);

        List<Integer> gecenler=new ArrayList<Integer>();
        for (int i = 0; i < not.size(); i++) {
            if (not.get(i)>ortalama){
                gecenler.add(not.get(i));
            }

        }
        System.out.println(gecenler.size());
    }
}