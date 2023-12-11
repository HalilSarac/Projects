package Projects;

import java.util.Scanner;

public class KartGecisOrnegi
{
    public static void main(String[] args)
    {
        //Kullanıcıdan Kart türü,aktarma ve bakiye bilgisini alarak
        //eğer yeterli bakiye bulunuyorsa kalan bakiye bilgisini göstereceğiz.
        //Yeterli bakiye bulunmaması halinde gerekli uyarıyı yapacağız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoş geldiniz Lütfen Kart Türünü giriniz, Tam-1 , Öğrenci-2 , Sosyal-3");
        int kartTuru = scanner.nextInt();

        System.out.println("Kaç kere aktarma yaptınız\n" +
                "İlk biniş-0\t " +
                "1.Aktarma-1\t " +
                "2.Aktarma-2\t");
        int aktarma = scanner.nextInt();

        System.out.println("Bakiye : ");
        double bakiye = scanner.nextDouble();

        double ucret =0;

        if (kartTuru == 1){
            if (aktarma == 0){
                ucret=7.67;
            }else if (aktarma ==1){
                ucret=5.49;
            }else if (aktarma == 2){
                ucret=4.17;
            }else {
                ucret=0;
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else if (kartTuru == 2){
            if (aktarma == 0){
                ucret=3.74;
            }else if (aktarma == 1){
                ucret=1.64;
            }else if (aktarma == 2){
                ucret=1.54;
            }else{
                ucret=0;
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else if (kartTuru == 3){
            if (aktarma == 0){
                ucret=5.49;
            }else if (aktarma == 1){
                ucret=3.29;
            }else if (aktarma == 2){
                ucret=2.52;
            }else{
                ucret=0;
                System.out.println("Hatalı giriş yaptınız!");
            }
        }else{
            System.out.println("Geçerli bir kart türü girmediniz lütfen kontrol ediniz");
        }
        if(bakiye>=ucret){
            bakiye-=ucret;
            System.out.println("Geriye kalan bakiye : " + bakiye + " İyi yolculukar");
        }else{
            System.out.println("Yetersiz bakiye : " + bakiye);
        }
    }
}
