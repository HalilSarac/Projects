package Projects;

import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
       /* Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
       */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Kilonuzu Giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Lütfen Boyunuzu Giriniz");
        double boy = scanner.nextDouble();

        double kitleend = kilo / (boy * boy);

        System.out.println("Boyunuz : " + boy);
        System.out.println("Kilonuz : " + kilo);

        System.out.println("Vücut Kitle Endeksiniz : " + kitleend);

        System.out.println("\n" +
                "18.5 ve daha düşük: Zayıf\n" +
                "18.5 - 24.9 arası: Normal kilolu\n" +
                "25 - 29.9 arası: Fazla kilolu\n" +
                "30 - 34.9 arası: Şişman (Obez - Sınıf I)\n" +
                "35 - 39.9 arası: Aşırı şişman (Obez - Sınıf II)\n" +
                "40 ve üzeri: Morbid obez (Obez - Sınıf III)");
    }
}
