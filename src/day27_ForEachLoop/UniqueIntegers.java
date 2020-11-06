package day27_ForEachLoop;

public class UniqueIntegers {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4};


        for (int j = 0; j <= arr.length - 1; j++) {


            int element = arr[j];
            int frequency = 0; // frequency of element

            for (int i = 0; i <= arr.length - 1; i++) {

                if (arr[i] == element) {
                    frequency++;

                }

            } // for finding a frequency of one element

            if (frequency == 1) {
                System.out.println(element + " ");
            }

        }
    }
}