package day29_Methods;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

  int[] arr = {10,20,30,40};

  addElements(arr, 50);


  int [] arr2 = {20,40,50,60};

  addElements(arr2, 70);
    }

                                                // num is extra number to be added to the array
public static void addElements(int [] arr, int num){
        int[]result = new int[arr.length+1];

        for (int i =0; i<=arr.length-1; i++){ // loop for given array

           result[i]=arr[i];


        }

result[result.length-1]=num;
    System.out.println(Arrays.toString(result));

}



}
