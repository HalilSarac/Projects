package JavaPractice.Week02;

public class P04 {
    public static void main(String[] args) {
        System.out.println("25"+7); //257
        System.out.println("25"+"7"); //257
        System.out.println(25+7); //32
        System.out.println("---------------------------------");

        String a="25";
        int b=7;
        String c="7";
        int d= 25;
        // int x=a+d; String bir değer ile int bir değer concate edilirse strin sonuc verir[String==Strong]
        String x=a+d;

        System.out.println(a+b); //257
        System.out.println(a+c); // 257
        System.out.println(b+d); //32
        System.out.println(x); // 2525

        /*
        Karşılaştırma operatörleri
        == : oparatörün sağının soluna değer olarak eşit oldğunu gösterir
        && : (and) operatörün sağındaki ve solundaki ifadenin doğru olması gerekir.
        || : (or) operatörün sağındaki ve solundaki ifadelerden sadece birinin doğru olması yeterlidir
        ! : (not) değil anlamındadır != eşit değil !(...) parantez içindeki ifade olmamalı

         */
    }
}
