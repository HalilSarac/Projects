package JavaPractice.Week05;

import java.util.Arrays;

public class P02_MD_Array {
    // multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer
    // birer bulan
    // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana
    // yazdıran programı yaziniz.
    // input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}

    public static void main(String[] args) {
        int mdarr [][]={{10,5,35,125},{7,112,13},{12,24,48,50}}; //output ={175,132,134}

        int output[]=new int[mdarr.length];

        for (int i = 0; i < mdarr.length; i++) {
            for (int j = 0; j < mdarr[i].length; j++) {
                output[i]+=mdarr[i][j];

            }

        }
        System.out.println(Arrays.toString(output));


    }

}
