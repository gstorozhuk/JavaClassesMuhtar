package day26_Array;

public class MaxNumInArray {

    public static void main(String[] args) {

       int[] numbers = {600,200,3,4,500,6,7,};

       int max = numbers [0]; // 0

       for (int i =1; i<=numbers.length-1; i++){

           if(numbers[i]>max){
               max = numbers[i];
           }
       }
        System.out.println(max);
    }
}
