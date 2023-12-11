package JavaPractice;
import java.time.LocalDateTime;
import java.util.Scanner;

    public class WiseMarket {
        /*
       ====================PROJEMIZ===================================
     ilk programa girildiginde bizi bir menu karsilasin bu secenekler
       1 ŞARKÜTERİ ÜRÜNLERİ
       2 MANAV ÜRÜNLERİ
       3 MARKET ÜRÜNLERİ
       secime göre;
       4-urunleri listele ve
       5-fiyatlari gelsin
       6-Alışveriş bitince fiş yazdırsın.
       7- Fiş yazdırdıktan sonra da çıkış yapılsın.
    */
        static Scanner scan = new Scanner(System.in);
        static int urunKodu;
        static boolean ekUrun = false;
        static int urunAdedi;
        static String urunAd;
        static int urunFiyat;
        static String sepet = "\n";
        static double toplam;

        public static void main(String[] args) {
            girisEkrani();
        }

        private static void girisEkrani() {
            System.out.println("============== T130 - WISE MARKET ==============");
            System.out.println("------------------ Hoş Geldiniz ----------------");
            System.out.println("Lütfen bir Seçim Yapınız?\nAlışveriş Yapacağınız reyon numarasını girip enter tuşuna basınız:");
            System.out.println("1-Şarküteri Reyonu\n2-Manav Reyonu\n3-Market Reyonu\n4-Fiş Yazdırma\n5-Çıkış");
            int secim = scan.nextInt();

            if (!(secim >= 1 && secim <= 5)) {
                System.out.println("Geçersiz bir işlem seçtiniz!\nLütfen Yeniden Deneyiniz");
                girisEkrani();
            } else {
                switch (secim) {
                    case 1:
                        sarkuteri();
                        break;
                    case 2:
                        manav();
                        break;
                    case 3:
                        market();
                        break;
                    case 4:
                        fisYazdir();
                        break;
                    case 5:
                        cikis();
                        break;
                    default:

                }
            }
        }

        private static void cikis() {
            System.out.println("---- Çıkış Yapılıyor ----");
            System.exit(0);


        }
        private static void fisYazdir() {
            System.out.println("------------- Alışveriş Fişi -------------");
            System.out.println("_____________ T130 WISE MARKET _____________");
            System.out.println("_____________ İyi Günler _____________");
            System.out.println(" ");
            System.out.println(sepet);
            System.out.println("Toplam Tutar: " + toplam);
            System.out.println("KDV: " + (toplam * 0.20));
            toplam += (toplam * 0.20);
            System.out.println("Ödenecek Tutar: " + toplam + " KDV Dahil");
            System.out.println("Ödenen Miktar: ");
            int odeme = scan.nextInt();
            if (odeme < toplam) {
                System.out.println("Yapılan ödeme toplam tutarı karşılamıyor. " + (toplam - odeme) + " kadar daha ödeme yapamlısınz.");
            } else {
                System.out.println("Para Üstü: " + (odeme - toplam));
            }
            System.out.println("Bizi Tercih ettiğiniz için teşekkür ederiz\nYine Bekleriz");
            LocalDateTime date = LocalDateTime.now();
            System.out.println(date);
            cikis();
        }
        private static void market() {
            System.out.println("---- Market Reyonuna Hoş Geldiniz ----");
        }

        private static void manav() {
            System.out.println("---- Manav Reyonuna Hoş Geldiniz ----");
            System.out.println("201-Ananas 80₺\n202-Mandalina 50₺\n203-Elma 75₺\n204-Portakal 60₺\n205-Muz 80₺");
            System.out.print("Lütfen ürün kodu giriniz: ");
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 201 && urunKodu <= 205) {
                    System.out.print("Kaç Paket almak istersiniz: ");
                    urunAdedi = scan.nextInt();
                    switch (urunKodu) {
                        case 201:
                            urunAd = "Ananas";
                            urunFiyat = 80;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 202:
                            urunAd = "Mandalina";
                            urunFiyat = 50;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 203:
                            urunAd = "Elma";
                            urunFiyat = 75;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 204:
                            urunAd = "Portakal";
                            urunFiyat = 60;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 205:
                            urunAd = "Muz";
                            urunFiyat = 80;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                    }
                    urunFiyat = urunAdedi * urunFiyat;
                    toplam += urunFiyat;
                    System.out.println("Toplam Tutar: " + toplam);
                    sepet += urunAd + " : " + urunFiyat + " TL\n";
                    System.out.println("Başka bir ürün almak isterseniz, ürün kodunu giriniz\nAna Menüye dönmek için 0 yazıp Enter tuşuna basınız");

                } else if (urunKodu == 0) {
                    girisEkrani();
                }
            }
            ekUrun = false;
        }
        private static void sarkuteri() {
            System.out.println("---- Şarküteri Reyonuna Hoş Geldiniz ----");
            System.out.println("101-Peynir 250₺\n102-Pastırma 600₺\n103-Yoğurt 150₺\n104-Sucuk 350₺\n105-Yumurta 100₺");
            System.out.print("Lütfen Ürün Kodunu Giriniz: ");

            //if (!(urunKodu>=101 && urunKodu<=105)){
            //    System.out.println(urunKodu+" ürün kodlu ürün bulunamadı. Yeniden deneyiniz");
            //    sarkuteri();
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 101 && urunKodu <= 105) {
                    System.out.print("Kaç Paket Alacaksınız: ");
                    urunAdedi = scan.nextInt();

                    switch (urunKodu) {
                        case 101:
                            urunAd = "Peynir";
                            urunFiyat = 250;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 102:
                            urunAd = "Pastırma";
                            urunFiyat = 600;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 103:
                            urunAd = "Yoğurt";
                            urunFiyat = 150;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 104:
                            urunAd = "Sucuk";
                            urunFiyat = 350;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;
                        case 105:
                            urunAd = "Yumurta";
                            urunFiyat = 100;
                            System.out.println(urunAdedi + " Paket " + urunAd + " fiyatı: " + (urunAdedi * urunFiyat) + " TL'dir");
                            break;

                    }
                    urunFiyat = urunAdedi * urunFiyat;
                    toplam += urunFiyat;
                    System.out.println("Toplam Tutar: " + toplam);
                    sepet += urunAd + " : " + urunFiyat + " TL\n";
                    System.out.println("Başka bir ürün almak isterseniz, ürün kodunu giriniz\nAna Menüye dönmek için 0 yazıp Enter tuşuna basınız");

                } else if (urunKodu == 0) {
                    girisEkrani();
                }
            }
            ekUrun = false;
        }
    }