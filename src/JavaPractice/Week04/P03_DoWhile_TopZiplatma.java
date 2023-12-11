package JavaPractice.Week04;

public class P03_DoWhile_TopZiplatma {

    // Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.

    public static void main(String[] args) {
        double yukseklik = 2.00;
        topuZiplat(yukseklik);
        topuZiplat(1.00);
        topuZiplat(5.00);
        topuZiplat(0.80);
        topuZiplat(12);
    }
    public static void topuZiplat(double cikisnoktasi) {
        double topYol = 0;
        int yereVurmaSayisi = 0;
        do {
            topYol += cikisnoktasi;
            yereVurmaSayisi++;
            cikisnoktasi*=0.75;
            topYol += cikisnoktasi;
        }while (cikisnoktasi>=1);
        System.out.println("Topun aldigi toplam yol = " + topYol + " Yere vurma sayisi = " + yereVurmaSayisi );
    }
}
