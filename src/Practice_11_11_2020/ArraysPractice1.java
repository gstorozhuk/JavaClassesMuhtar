package Practice_11_11_2020;

public class ArraysPractice1 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 11, 12, 13, 14, 15};


        for (int j = 0; j <= arr1.length - 1; j++) { // to iterate the arr1
            int element = arr1[j]; //1 now want to check if it contains in the second array
            for (int i = 0; i <= arr2.length - 1; i++) {
                if (element == arr2[i]) {
                    System.out.println(element);
                    break;

                }
            }
// 2nd approach of solution

            for (int element1 : arr1) {

                for (int each : arr2) {
                    if (each == element1) {
                        System.out.println(element1);
                    }
                }

            }


        }

    }
}