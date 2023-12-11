package JavaPractice2.Week02;

import java.util.Scanner;

public class S02_If_KahveMakinesi
{
    public static void main(String[] args)
    {
        /*
    1. Basit bir Kahve makinesi oluşturun. 3 çeşit kahvemiz olsun.
    2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
    3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Hangi Kahveyi İstersiniz?
        Türk kahvesi
        Filtre Kahve
        Espresso

        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
        (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)

        1.kosul

          Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.
          Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.
          Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
          Eğer yanlış harf girerseniz, konsola = "Hatali giris yaptiniz, tekrar baslayiniz." yazsın.
          (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
     */
        /*
             to do-------
            Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): "
            Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
            String sut olusturun.

            2. kosul Bolümü
            eğer String sut, evet'e eşitse,konsola, Süt ekleniyor... yazısı gelsin.
            (Büyük küçük harf duyarlı olmaması için String methodu kullanın.
            Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.

            eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
            Evet ve hayir disinda bir giris olursa hatali giris mesaji yazdirsin
     */
        /*
            to do----------------
            Sistem bize "seker ister misiniz ? (Evet veya hayır cevabını veriniz) :
            " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
            String seker oluşturunuz.

                                             3. kosul Bolümü
            to do if(){
            Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı.
            Sorunun altına int kacSeker  oluşturunuz.
            seker sayısını giriniz.
            Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
            to do }
            toda else {
            Eğer String şeker  hayır 'a eşitse, sistem bize "seker eklenmiyor" cevabını versin.


       */
        /*
            to do----------------
            Sistem bize "Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.) :
            sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
            String boyut oluşturun...

                                                4. kosul Bolümü
            eğer String boyut Büyük' e eşitse =  Kahveniz büyük boy hazırlanıyor.
            (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")

            Eğer String boyut  Orta'ya eşitse = Kahveniz orta boy hazırlanıyor..
            ("Kahveniz" + boyut + "hazırlanıyor.)

            Eğer String boyut  Küçük'e eşitse = Kahveniz küçük boy hazırlanıyor.
            yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)

         */

        Scanner scanner = new Scanner(System.in);

        int flag;
        do {
            flag = 0;
            System.out.println("Hangi kayveyi istersini?\n" +
                    "1-Türk kahvesi\n" +
                    "2-Filtre Kahve\n" +
                    "3-Espresso Kahve");


            String hangiKahve = scanner.nextLine();
            String boy,seker,sut;
            double sekersayisi = 0;


            if (hangiKahve.equalsIgnoreCase("Türk kahvesi") || hangiKahve.equalsIgnoreCase("Turk Kahvesi")) {

                System.out.println("Türk Kahveniz Hazırlanıyor...");

            }else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")){

                System.out.println("Filtre Kahveniz Hazırlanıyor...");

            }else if (hangiKahve.equalsIgnoreCase("Espresso Kahve")){

                System.out.println("Espresso Kahveniz Hazırlanıyor...");

            } else {

                System.out.println("Hatalı giriş yaptınız, tekrar baslayınız");
                flag++;
                continue;

            }

                int sayacsutsabir =0;
                System.out.println("Süt Eklememizi İster Misiniz ? (Evet veya Hayır olarak cevaplayınız):");
                sut = scanner.nextLine();

                while (!(sut.equalsIgnoreCase("evet") || sut.equalsIgnoreCase("hayır"))) {

                    sayacsutsabir++;
                    if (sayacsutsabir >= 5){
                        System.out.println("\nLAN GERİZEKALI ALT TARAFI EVET YA DA HAYIR GİRECEKSİN, AMACI NE??\n");
                    }
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz");
                    System.out.println("Süt Eklememizi İster Misiniz ? (Evet veya Hayır olarak cevaplayınız):");
                    sut = scanner.nextLine();

                }

            if (sut.equalsIgnoreCase("Evet")) {

                System.out.println("Süt ekleniyor...");

            } else if (sut.equalsIgnoreCase("Hayır")) {

                System.out.println("Süt eklenmiyor");

            } else {

                System.out.println("Hatalı giriş yaptınız, tekrar başlayınız");
                flag++;
                continue;

            }


            int sekersayac =0;
            System.out.println("Şeker Eklememizi İster Misiniz ? (Evet veya Hayır olarak cevaplayınız):");
            seker= scanner.nextLine();

            while(!(seker.equalsIgnoreCase("Evet") || seker.equalsIgnoreCase("Hayır"))){

                sekersayac++;
                if (sekersayac >= 5){
                    System.out.println("\nLAN GERİZEKALI ALT TARAFI EVET YA DA HAYIR GİRECEKSİN, AMACI NE??\n");
                }
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz");
                System.out.println("Şeker Eklememizi İster Misiniz ? (Evet veya Hayır olarak cevaplayınız):");
                seker = scanner.nextLine();

                }

            if(seker.equalsIgnoreCase("Evet")){

                try {

                    System.out.println("Kaç şeker olsun ?");
                    sekersayisi = Double.parseDouble(scanner.nextLine());

                    while (sekersayisi > 10 || sekersayisi < 0){

                        System.out.println("Şeker sayısı 10'dan fazla, 0'dan daha az olamaz, doğru miktarda şeker giriniz!!!");
                        System.out.println("Kaç şeker olsun ?");
                        sekersayisi = Double.parseDouble(scanner.nextLine());

                    }

                    System.out.println(sekersayisi + " : şeker ekleniyor...");

                }catch(NumberFormatException e){

                    System.out.println("Hatalı Giriş yaptınız, tekrar başlayınız");
                    flag++;
                    continue;
                }

            }else if (seker.equalsIgnoreCase("Hayır")){

                System.out.println("Şeker eklenmiyor");

            }else {

                System.out.println("Hatalı giriş yaptınız, tekrar başlayınız");
                flag++;
                continue;

            }


            System.out.println("Devam etmek için ENTER tuşana basınız");
            String boskod=scanner.nextLine();

            int boysayac = 0;
            System.out.println("Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.) :");
            boy = scanner.nextLine();

            while(!(boy.equalsIgnoreCase("Büyük") || boy.equalsIgnoreCase("Küçük") || boy.equalsIgnoreCase("Orta"))){

                boysayac++;
                if (boysayac >= 5){
                    System.out.println("\nLAN GERİZEKALI ALT TARAFI BOY SEÇECEKSİN, AMACIN NE??\n");
                }
                System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz");
                System.out.println("Hangi boyutta olsun? (Büyük  - orta  - küçük  olarak giriniz.) :");
                boy = scanner.nextLine();

            }

            if(boy.equalsIgnoreCase("Büyük")){

                System.out.println("Kahveniz " + boy + " hazırlanıyor.");

            }else if (boy.equalsIgnoreCase("Orta")){

                System.out.println("Kahveniz " + boy + " hazırlanıyor.");

            }else if(boy.equalsIgnoreCase("Küçük")){

                System.out.println("Kahveniz " + boy + " hazırlanıyor.");

            }else {

                System.out.println("Hatalı giriş yaptınız, tekrar başlayınız");
                flag++;
                continue;

            }

            if (sekersayisi == 0){

                if(sut.equalsIgnoreCase("evet")){

                    System.out.println("Sütlü, " + "Şekersiz, " + boy + " boy, " + hangiKahve + "'niz hazırdır! Beklediğiniz için Teşekkürler!!!\n Afiyet Olsun ");

                }else {

                    System.out.println("Şekersiz, " + boy + " boy, " + hangiKahve + "'niz hazırdır! Beklediğiniz için Teşekkürler!!!\n Afiyet Olsun ");
                }
            }else {
                if (sut.equalsIgnoreCase("evet")){

                    System.out.println("Sütlü, " + sekersayisi + " Şekerli, " + boy + " boy, " + hangiKahve + "'niz hazırdır! Beklediğiniz için Teşekkürler!!!\n Afiyet Olsun");

                }else{

                System.out.println("Sütsüz, " + sekersayisi + " Şekerli, " + boy + " boy, " + hangiKahve + "'niz hazırdır! Beklediğiniz için Teşekkürler!!!\n Afiyet Olsun");

                }
            }

        }while(flag != 0);
    }
}
