package Practice_11_11_2020;
import java.util.Arrays;

public class SingleDemensionalArray {
    public static void main(String[] args) {


        int[] scores = new int[5];

        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 50;
        scores[3] = 30;
        scores[4] = 40;

        System.out.println(scores[0]); // 10; 20; 50; 30; 40

        for (int i = 0; i<scores.length; i++){
            System.out.println(scores[i]);
        }
        System.out.println("=========================================");



        int j =0;

        for (int each:scores){

            System.out.println(each);
        }








    }
}