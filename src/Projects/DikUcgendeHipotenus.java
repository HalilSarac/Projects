package Projects;

import java.util.Scanner;

public class DikUcgendeHipotenus
{
    public static void main(String[] args)
    {
       /* Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dik üçgenin 1. kenar uzunluğunu giriniz");
        double kenaruz1 = scanner.nextDouble();

        System.out.println("Dik üçgenin 2. kenar uzunluğunu giriniz");
        double kenaruz2 = scanner.nextDouble();

        double hipo = Math.pow(kenaruz1,2) + Math.pow(kenaruz2,2);
        System.out.println("Üçgenin Hipotenüs uzunluğu : " + Math.sqrt(hipo));


    }

}
