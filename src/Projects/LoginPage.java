package Projects;

import java.util.Scanner;

public class LoginPage
{
    public static void main(String[] args)
    {
        String rusername= "Kullanici";
        String rpassword="asdasd123";



        // While içinde while ile şifre ve kullanıcı adı doğruluğunu da kontrol et !!!!
        while (true)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen İstenilen kullanıcı adını giriniz : ");
            String username = scanner.nextLine();

            while(!(username.equals(rusername))){

                System.out.println("Lütfen İstenilen kullanıcı adını giriniz");
                username = scanner.nextLine();

            }

            System.out.println("Lütfen İstenilen şifreyi giriniz");
            String password = scanner.nextLine();

            while(!(password.equals(rpassword))){

                System.out.println("Lütfen İstenilen şifreyi giriniz");
                password = scanner.nextLine();

            }

            if (username.equals(rusername) && password.equals(rpassword)){
                System.out.println("Giriş Başarılı, Hoşgeldiniz Kullanıcı!");
            break;
            }else{
                System.out.println("Kullanıcı adı ya da şifreyi hatalı girdiğiniz tekrar deneyiniz!");
            }
        }
    }
}
