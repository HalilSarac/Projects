package Projects;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class AdresTelefonMeslek {
    public static String adres,telefon,meslek,mail,resim,sifre;
    public static int hataliGiris;
    public static boolean harfMi(String str) {
        return str.matches("[a-zA-ZğüşıöçĞÜŞİÖÇ\\S]+");
    }

    public static boolean sayiMi(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        /*
            0- Kullaniciya ait adres, telefon, meslek bilgileri tanimlayiniz.

            1- Kullanici kayit olacak &  giris yapacak (@gmail.com kullanilacak) .

            2- Kullanici bilgileri kontrol edilecek (@, @gmail.com, .com icermiyorsa hata mesaji verin ve tekrar deger girmesini isteyiniz.)

            3- Giris yaptiktan sonra kullaniciya yapmak istedigi islemi sorun

                3.1- kullanici adi (mail), sifre degistirme
                3.2- adres bilgilerisini guncelleme
                3.3- meslek bilgilerisini guncelleme
                3.4- iletisim bilgilerisini guncelleme
                3.5- Hatali giris sayisini yazdirma
                3.6- Kullanicinin yas bilgisini aliniz ve su ana kadar kac gun yasadigini hesaplayiniz
                3.7- Kullanicidan 5 sayi girmesini isteyiniz ve bu sayilari buyukten kucuge siralayiniz.(for ve while kullanarak 2 farklı method olusturunuz.)
                3.8- Kullanici resmi değiştir. (resmin yoluyla yapınız. Orn: MahmuTuncer.jpg, Cenderma.png, ... )

                4- Cikis yap
        */

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Lütfen adresinizi giriniz");
        adres = scanner.nextLine();

        boolean telefonbool = true;
        while (telefonbool) {

            System.out.println("Lütfen Telefon numaranızı giriniz");
            telefon = scanner.nextLine();

            if (!(sayiMi(telefon))) {
                System.out.println("Hata: Girdi sadece sayı içermelidir.");
            } else {
                telefonbool = false;
            }
        }

        boolean meslekbool = true;
        while (meslekbool) {
            System.out.println("Lütfen Mesleğinizi giriniz");
            meslek = scanner.nextLine();

            if (!(harfMi(meslek))) {
                System.out.println("Hata: Girdi sadece harf içermelidir.");
            } else {
                meslekbool = false;
            }
        }

        System.out.println("Tebrikler başarıyla kayıt oldunuz\n");

        boolean mailbool = true;
        while (mailbool) {
            System.out.println("Lütfen mail adresinizi giriniz");
            mail = scanner.next();

            if (!(mail.contains("@") && mail.endsWith("@gmail.com"))) {
                System.out.println("Hata: Yanlış Email girdiniz");
                hataliGiris++;
            }else {
                mailbool = false;
            }
        }

        System.out.println("Lütfen bir şifrenizi giriniz");
        sifre = scanner.next();

        Scanner scanner1 = new Scanner(System.in);

        boolean resimbool = true;
        while (resimbool){
            System.out.println("Lütfen resim ekleyiniz");
            resim = scanner1.nextLine();

            if (!(resim.endsWith(".png") || resim.endsWith(".jpg"))) {
                System.out.println("Hata: Yanlış uzantılı dosya türü");
            }else {
                resimbool = false;
            }
        }

        boolean ahmedmuhsin = true;
        while (ahmedmuhsin) {

            System.out.println("\t\tYapmak istediğiniz işlem nedir?\n" +
                    "1- kullanici adi (mail), sifre degistirme\n" +
                    "2- adres bilgilerisini guncelleme\n" +
                    "3- meslek bilgilerisini guncelleme\n" +
                    "4- iletisim bilgilerisini guncelleme\n" +
                    "5- Hatali giris sayisini öğrenme\n" +
                    "6- Şu ana kadar kaç gün yaşadığınızı hesaplama\n" +
                    "7- 5 sayı giriniz, küçükten büyüğe hesaplama\n" +
                    "8- Kullanici resmi değiştir\n" +
                    "9- Kullanıcı bilgilerini görüntüle\n" +
                    "0- Çıkış Yap");

            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    int case1 = 0;
                    do {
                        System.out.println("Şifre mi, Mail mi değiştirmek istiyorsunuz");
                        String sifreMail = scanner.next();

                        if (sifreMail.equalsIgnoreCase("şifre")) {

                            sifreDegisim();

                        } else if (sifreMail.equalsIgnoreCase("Mail")) {

                           mailDegisim();

                        } else {

                            System.out.println("Yanlış giriş yaptınız lütfen tekrar deniyiniz");
                            case1++;
                        }
                    } while (case1 != 0);
                    break;
                case 2:
                    adresDegisim();
                    break;
                case 3:
                    meslekDegisim();
                    break;
                case 4:
                    telefonDegisim();
                    break;
                case 5:
                    hataliGiris();
                    break;
                case 6:
                    System.out.println("Doğduğunuz yılı giriniz");
                    int gun = scanner.nextInt();
                    System.out.println(gunHesaplama(gun) + " gündür hayattasınız tebrikler");
                    break;
                case 7:
                    int[] arr = new int[5];
                    System.out.println(Arrays.toString(girilenSayiSiralama(arr)));
                    break;
                case 8:
                    resimDegisim();
                    break;
                case 9:
                    System.out.println("\t\tKullanıcı bilgileriniz\n" +
                            "Mailiniz : " + mail + "\n" +
                            "Şifreniz :" + sifre + "\n" +
                            "Adresiniz :" + adres + "\n" +
                            "Meslek :" + meslek + "\n" +
                            "Telefon :" + telefon + "\n");
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor");
                    ahmedmuhsin = false;
                    break;
                default:
                    System.out.println("Senin ben ağzına sıçım");
            }
        }
    }
    public static void mailDegisim() {
        Scanner scanner = new Scanner(System.in);

        boolean yeniMailBool = true;
        while (yeniMailBool){

            System.out.println("Lütfen Yeni mail adresinizi giriniz");
            mail = scanner.next();

            if (!(mail.contains("@") && mail.endsWith("@gmail.com"))) {
                System.out.println("Hata: Yanlış Email girdiniz");
            }else {
                yeniMailBool = false;
            }

        }
    }
    public static void sifreDegisim() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yeni şifrenizi giriniz");
        sifre = scanner.nextLine();

    }
    public static void  adresDegisim() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yeni adresinizi giriniz");
        adres = scanner.nextLine();
    }
    public static void telefonDegisim() {
        Scanner scanner = new Scanner(System.in);

        boolean yeniTelefonBool = true;
        while (yeniTelefonBool){
            System.out.println("Lütfen Yeni Telefon numaranızı giriniz");
            telefon = scanner.nextLine();

            if (!(sayiMi(telefon))) {
                System.out.println("Hata: Girdi sadece harf içermelidir.");
            } else {
                System.out.println("Yeni telefon numaranız : " + telefon);
                yeniTelefonBool = false;
            }
        }
    }
    public static void hataliGiris() {

        System.out.println("Yaptığınız hatalı giris : " + hataliGiris);

    }
    public static int gunHesaplama(int a) {

        int b;

        a = 2023 - a;

        b = a * 365;

        return b;
    }
    public static int[] girilenSayiSiralama(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 5 sayı giriniz");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();

        }
        Arrays.sort(arr);
        return arr;
    }
    public static void resimDegisim() {
        Scanner scanner = new Scanner(System.in);

        boolean yeniResimBool = true;
        while (yeniResimBool) {
            System.out.println("Lütfen resim ekleyiniz");
            resim = scanner.next();

            if (!(resim.endsWith(".png") || resim.endsWith(".jpg"))) {
                System.out.println("Hata: Yanlış uzantılı dosya türü");
            } else {
                System.out.println("Yeni resim : " + resim);
                yeniResimBool = false;
            }
        }
    }
    public static void meslekDegisim() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        boolean yeniMeslek = true;
        while (yeniMeslek){
            System.out.println("Lütfen Mesleğinizi giriniz");
            meslek = scanner.nextLine();

            if (!(harfMi(meslek))) {
                System.out.println("Hata: Girdi sadece harf içermelidir.");

            } else {
                yeniMeslek = false;
            }
        }
    }
}
