package JavaPractice2.Week04;

import java.util.Arrays;

public class S03_Array_KelimeninHarflarineAyirma {

    public static void main(String[] args) {
        //Gökyüzü kelimesini ters ceviren bir method yazip,
        // sonra ters halini harflerine ayiran bir method daha yaziniz.
        String kelime="Gökyüzü";
        String terskelime=terscevir(kelime);
        System.out.println("Kelimenin tersi: "+terscevir(kelime));
        System.out.println(Arrays.toString(ayir(terskelime)));
    }
    public static String terscevir(String kelime){
        String terskelime="";
        for (int i=kelime.length()-1; i>=0; i--){
            terskelime+=kelime.charAt(i);
        }
        return terskelime;
    }
    public static String[] ayir(String terskelime){
        String[] harfler= new String[terskelime.length()];
        for (int i=0; i<terskelime.length(); i++)
            harfler[i]=String.valueOf(terskelime.charAt(i));
        return harfler;
    }
}