package Projects;

import java.util.Scanner;

public class ortalamaHesaplama

{
    public static void main(String[] args)
    {
        //Türkçe matematik ve fizik ders notlarını girdiğimiz ve bu notların ortalamasını kullanıcıya veren
        //programı yazınız

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Türkçe Notu Giriniz");
        int turk = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Lütfen Matematik Notunu Giriniz");
        int mat = scanner.nextInt();

        System.out.println("Lütfen Fizik Notunuzu Giriniz");
        int fzk = scanner.nextInt();

        System.out.println("Fizik: " + fzk);
        System.out.println("Türkçe: " + turk);
        System.out.println("Matematik: " + mat);

        double ort = ((fzk + turk + mat)/3);
        System.out.println("3 ders toplamı ortalamanız: " + ort);

    }






}
