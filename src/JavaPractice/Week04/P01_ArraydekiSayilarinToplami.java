package JavaPractice.Week04;

public class P01_ArraydekiSayilarinToplami {

    //Create an array of 5 floats and calculate their sum.

    public static void main(String[] args) {

        /*  float [] numbers = new float[5];
        numbers[0]=1.1f;
        numbers[2]=2.2f;
        numbers[4]=3.3f;
        numbers[3]=4.4f;
        numbers[1]=5.5f;
         */

        float [] numbers = {1.1f, 5.5f, 2.2f, 4.4f, 3.3f};
        // System.out.println(Arrays.toString(numbers));
        System.out.println("***************** FOR LOOP COZUMU *****************");
        float sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            sum+= numbers[i];
        }

        System.out.println(" Array'in elemanlari toplami = " + sum);
        System.out.println("***************** WHILE LOOP COZUMU *****************");

        sum=0;
        int i = 0;

        while(i< numbers.length){
            sum+= numbers[i];
            i++;
        }

        System.out.println("While ile Array'in elemanlari toplami = " + sum);
        System.out.println("***************** WHILE LOOP COZUMU 2 *****************");

        sum=0;
        int ind = numbers.length - 1;

        while (ind>=0){
            sum += numbers[ind];
            ind--;
        }
        System.out.println("While 2 ile Array'in elemanlari toplami = " + sum);
    }
}
