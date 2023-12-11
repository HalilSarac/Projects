package JavaPractice.Week03;

public class P02_ForLoop_EBOB_EKOK {
    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.
    public static void main(String[] args) {
        int sayi1 = 17;
        int sayi2 = 28;
        int buyukSayi;
        int kucukSayi;
        if (sayi1>sayi2) { buyukSayi=sayi1; kucukSayi=sayi2; }
        else {buyukSayi=sayi2; kucukSayi=sayi1; };
        int ebob = 0;
        for (int i = kucukSayi; i > 0 ; i--) {
            if (kucukSayi%i == 0   && buyukSayi%i == 0){
                ebob = i;
                break;
            }
        }
        int ekok = 0;
        for (int i = buyukSayi; i <= buyukSayi*kucukSayi ; i+=buyukSayi) {
            if (i%kucukSayi == 0 && i%buyukSayi == 0){
                ekok = i;
                break;
            }
        }
        System.out.println("Girilen sayilarin EBOB degeri = " + ebob);
        System.out.println("Girilen sayilarin EKOK degeri = " + ekok);
        System.out.println(ebobHesaplama(23, 46));
        System.out.println(ebobHesaplama(11, 22));
        System.out.println(ebobHesaplama(8, 54));
        System.out.println(ebobHesaplama(12, 36));
        System.out.println(ebobHesaplama(45, 102));
        System.out.println(ebobHesaplama(34, 98));
        ekokHesaplama(24,12);
        ekokHesaplama(6,8);
        ekokHesaplama(12,26);
        ekokHesaplama(3,7);
    }
    public static void ekokHesaplama(int x, int y) {
        int buyukSayi;
        int kucukSayi;
        if (x>y) { buyukSayi=x; kucukSayi=y; }
        else {buyukSayi=y; kucukSayi=x; };
        int ekok = 0;
        for (int i = buyukSayi; i <= buyukSayi*kucukSayi ; i+=buyukSayi) {
            if (i%kucukSayi == 0 && i%buyukSayi == 0){
                ekok = i;
                break;
            }
        }
        System.out.println(x + " ve " + y + " sayilarinin EKOK degeri = " + ekok);
    }
    public static int ebobHesaplama(int a , int b){
        int buyukSayi;
        int kucukSayi;
        if (a>b) { buyukSayi=a; kucukSayi=b; }
        else {buyukSayi=b; kucukSayi=a; };
        int ebob = 0;
        for (int i = kucukSayi; i > 0 ; i--) {
            if (kucukSayi%i == 0   && buyukSayi%i == 0){
                ebob = i;
                break;
            }
        }
        return ebob;
    }

}
