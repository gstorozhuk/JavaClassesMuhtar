package day26_Array;

import java.util.Arrays;

public class ArraysDescending {

    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int[] descending = new int[arr.length]; // [7, 6, 5, 2,1,0]

        int j = 0;

        for (int i = arr.length-1; i >=0; i--) {

         //   System.out.print(arr[i] + " ");

       descending [j]   =  arr[i];
       j++;
        }

    }

}