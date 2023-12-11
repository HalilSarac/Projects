package JavaPractice.Week05;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Array {
    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    //kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    //elemaninin arasinki farki gosteren java programi yazin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.print("Lütfen Array'de olmasını istediğiniz eleman sayısını giriniz: ");
        int sayi= scan.nextInt();

        int arr[]=new int[sayi];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+". elemanı giriniz:");
            int sayi2= scan.nextInt();
            arr[i]=sayi2;
        }
        Arrays.sort(arr);// oluşan array'in sayısal sıralamada olmama ihtimaline binaen naturel sıralama yaptık
        int arrMax=arr[arr.length-1];
        int arrMin=arr[0];
        System.out.println("Arraydekin En Büyük Eleman: "+arrMax+
                         "\nArraydekin En Küçük Eleman: "+arrMin+
                         "\nAralarındaki fark: "+(arrMax-arrMin));


    }
}
