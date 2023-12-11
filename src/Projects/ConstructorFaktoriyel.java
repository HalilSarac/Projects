package Projects;

import java.util.Scanner;

public class ConstructorFaktoriyel
{
    public static void main(String[] args) {
        ConstructorFaktoriyel obj = new ConstructorFaktoriyel();
    }
    ConstructorFaktoriyel(){

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen 20'den küçük bir pozitif tam sayı giriniz");
        byte sayi = scanner.nextByte();

        long faktoryel = 1;
        for (int i = 1; i <=sayi ; i++) {
            faktoryel *=i;
        }
        System.out.println("Girilen sayının faktoryeli : " + faktoryel);
    }
}
