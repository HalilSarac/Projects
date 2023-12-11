package JavaPractice.Week03;

public class P03_NestedForLoop_CarpimTablosu {
    public static void main(String[] args) {
        //Call to multipleTable method inside main method
        // Kullanicinin girdigi sayiya kadar carpim tablosunu
        // yazdiran bir method create ediniz
        /*
        input:3
        output:
        1   2   3
        2   4   6
        3   6   9
         */
        carpimTablosuYazdir(9);
    }
    private static void carpimTablosuYazdir(int sayi) {
        for (int i = 1; i <= sayi ; i++) {
            for (int j = 1; j <= sayi ; j++) {
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
