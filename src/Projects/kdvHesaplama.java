package Projects;

import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        // kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Aldığınız Ürünün Tam fiyatını Giriniz");

        double kdv = 1.18;

        double anapara = scanner.nextDouble();

        double kdvsizFiyat = anapara / kdv;

        System.out.println("Kdv'siz fiyatı : " + kdvsizFiyat);

        System.out.println("Ürüne binen kdv mikatarı : " + (anapara - kdvsizFiyat));


    }
}
