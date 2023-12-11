package Projects;


import java.util.Arrays;

public class ArraySoru1
{
    public static void main(String[] args) {

        int[] arr = {5, 4, 8, 8, 5};

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] +2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
