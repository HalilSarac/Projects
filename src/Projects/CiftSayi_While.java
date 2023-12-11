package Projects;

public class CiftSayi_While
{
    public static void main(String[] args)
    {
        //while ile 100'e kadar olan çift sayıları yazdırın
        int sayi = 0;


        for (int i = sayi; i <= 100 ; i+=2) {

            System.out.print(i + " Çift sayıdır " );

        }
        System.out.println("");
        while(sayi <= 100)
        {

            System.out.println(sayi + " çift sayıdır");

            sayi += 2 ;

        }
    }
}
