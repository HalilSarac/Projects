package JavaPractice.Week01;

public class P03_dataTypes {
    public static void main(String[] args) {


    /*
    byte<shor<int<long<float<double
     */

    byte b1=Byte.MIN_VALUE;
        System.out.println("b1 = " + b1);
    int a1=Integer.MAX_VALUE;
        System.out.println("a1 = " + a1);
    double d1=Double.MAX_VALUE;
        System.out.println("d1 = " + d1);

    float f=Float.MIN_VALUE;
        System.out.println("f = " + f);

    char ch1='m';
    char ch2=103;  //ASCII Tablosundaki bu sayıya karşılık gelen karakteri yazdırır
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

    String isim="Ali";
        System.out.println("isim = " + isim);

    String name="Murat";
        System.out.println("name = " + name);

    int a=0;
        System.out.println("a = " + a);

    int sayi1=0, sayi2=5, sayi3=12;

        System.out.println(sayi1);
        System.out.print("sayi3 = " + sayi3);

        System.out.println("Merhaba Arkadaşlar Nasılsınız");
        System.out.println(isim);

        //OPERATORLER
        /*
        = : bir değer atamak için kulllanılır
        == : eşitliğin sağındaki ve solundaki değerlerin eşit olduğunu gösterir
        != : eşitliğin sağının soluna eşit olmadığını gösterir
        || : veya
        && : ve
         */


    }
}