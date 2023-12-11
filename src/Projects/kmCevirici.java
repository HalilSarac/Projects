package Projects;

import java.util.Scanner;

public class kmCevirici
{
    public static void main(String[] args)
    {
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın

        Scanner scanner = new Scanner(System.in);
        System.out.println("KM sayacını giriniz ");

        double km = scanner.nextDouble();
        double ucret = 60 +  (km * 13.75);

        System.out.println("ücret = " + ucret);




    }

}
