package JavaPractice.Week04;

public class P02_MethodCreation_KelimeyiTersineCevir {

    // SORU:Kullanıcıdan bir cümle veya kelime girmesini isteyip
    // girilen değeri tersine donduren bir method oluşturun

    public static void main(String[] args) {

        String kelime = "Elmali";

        System.out.println(tersCevir(kelime));
        System.out.println(tersCevir2(kelime));
        System.out.println(tersCevir("Armut"));
        System.out.println(tersCevir("Cemile"));
        System.out.println(tersCevir("Ben bu cumleyi ters okumak istiyorum"));

        for (int i = 4; i >= 3 ; i--) {
            System.out.println("Bu dongu kac kez calisir? ");
        }
    }
    public static String tersCevir(String word) {
        String bosKova = "";
        for (int i = word.length(); i > 0 ; i--) {
            bosKova += word.charAt(i-1);
        }
        String reversedWord = bosKova;
        return reversedWord ;
    }
    public static String tersCevir2(String word) {
        String bosKova = "";
        for (int i = word.length()-1; i >= 0 ; i--) {
            bosKova += word.charAt(i);
        }
        String reversedWord = bosKova;
        return reversedWord ;
    }
}
