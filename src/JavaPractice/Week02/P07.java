package JavaPractice.Week02;

import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        /*
 *  Kullanicidan IT alanini isteyerek
 *  meslegi = qa ==> Quality Analyst
             dev ==> Developer
           ba ==> Busines Analyst
           pm ==> Project Manager
    yazdiriniz
 */
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Mesleğinizi giriniz: \nqa - dev - ba - pm : ");
        String job= scan.next();
        String qa="Quality Analyst";
        String dev="Developer";
        String ba="Busines Analyst";
        String pm="Project Manager";

        if (job.equalsIgnoreCase("qa")){
            System.out.println("Mesleği: "+qa);
        } else if (job.toLowerCase().equals("dev")) {
            System.out.println("Mesleği: "+dev);
        } else if (job.equalsIgnoreCase("ba")) {
            System.out.println("Mesleği: "+ba);
        } else if (job.equalsIgnoreCase("pm")) {
            System.out.println("Mesleği: "+pm);
        }else{
            System.out.println("Siz IT Personeli Değilsiniz. Hayırdır");
        }


    }
}
