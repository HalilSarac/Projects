package JavaPractice.Week02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
       /*
 Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
    Girdiğiniz harf :
    Girdiğiniz harften sonraki  3 harf :
şeklinde yazdırın.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);
        System.out.println("Girdiğiniz harf : "+ harf);
        System.out.println("Girdiğiniz harften sonraki 3 harf : "
                                                                +(char)(harf+1)+","
                                                                +(char)(harf+2)+","
                                                                +(char)(harf+3)); //(char)harf  data casting



    }
}
