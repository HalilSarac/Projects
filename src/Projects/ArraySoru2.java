package Projects;

public class ArraySoru2
{
    public static void main(String[] args) {

        int [] arr = {-5,-6,-87,9,6,2,48,4};

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0){
                toplam += arr[i];
            }
        }
        System.out.println(toplam);
    }
}
