package JavaPractice2.Week03;

public class S01_ForLoop {
    // 0 ve 100 dahil olmak uzere 5 ile bolunebilen sayilari yazdirin
    // 0 ve 100 dahil olmak uzere 5 ile bolunebilen sayilari 100'dan geriye dogru yazdirin
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        for (int i = 100; i >= 0; i--) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
