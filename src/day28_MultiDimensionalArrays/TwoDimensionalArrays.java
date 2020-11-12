package day28_MultiDimensionalArrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6};
        int[] c = {7, 8, 9};
        //                  0           1       2       3           4
        int[][] arr2D = {{1, 2, 3, 4}, {5, 600}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15, 16, 17}};

        int max = arr2D[0][0];

        int min = arr2D[0][0];


        for (int i = 0; i <= arr2D.length - 1; i++) { // i: index of single dimens array

            int[] arr1D = arr2D[i];
            for (int j = 0; j <= arr1D.length - 1; j++) {
                int eachElement = arr2D[i][j];
                if (eachElement > max) {
                    max = eachElement;
                }
                if (eachElement < min) {
                    min = eachElement;
                }

            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}