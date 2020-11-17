package day29_Methods;

import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {

        int[] a1 = {200, 200, 300, 400, 400, 0, 800};

        arrayMaxNumber(a1);
         arrayMinNumber(a1);
        arrayUniqueElements(a1);

        System.out.println("===============================================");

        int[] a2 = {1, -2, 3, 400, 400, 0, 8};
        arrayMaxNumber(a2);

        arrayMinNumber(a2);

        arrayUniqueElements(a2);


    }

    public static void arrayMaxNumber(int[] arr) {
     //   Arrays.sort(arr);
     //   System.out.println("Maximum Number: " + arr[arr.length - 1]);

        int max = arr[0];

        for (int each : arr) {

            if (each > max) {
                max = each;

            }
        }
        System.out.println("max = " + max);
    }

    public static void arrayMinNumber(int[] arr2) {
//Arrays.sort(arr2);

      int min=0;
        for (int each2 : arr2) {
            if (each2 < min) {
                min = each2;
                System.out.println("Minimum Number: " + each2);
            }
        }


    }

    public static void arrayUniqueElements(int[] arr3) {

        for (int each : arr3) {

            int count = 0;

            for (int each2 : arr3) {

                if (each == each2) {
                    count++;

                }

            }

            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
}

/*

create a function that can print max num from any given integer array
create a function that can print min num from any given integer array                            min






 */