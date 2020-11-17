package day30_ReturnMethods;
import java.util.Arrays;
public class WarmUpTasks {

    public static void main(String[] args) {

        checkInteger(-2);
        int[] numbers = {1, 2, 3, 4, -5, -6, -7, 8, 10, 11, 0}; // length is 11

        for (int each : numbers) {

            checkInteger(each);


        }


    }

    public static void checkInteger(int num) {

        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        System.out.println(result);

    }

    public static int[] sort(int[] arr) {

        Arrays.sort(arr);

        int[] reversedArray = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];

        }

        return reversedArray;


    }
}