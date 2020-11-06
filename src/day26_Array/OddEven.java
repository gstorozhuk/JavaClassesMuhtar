package day26_Array;

import java.util.Arrays;

public class OddEven {

    public static void main(String[] args) {

        int [] numbers = new int [100];
        //                          last index 99

        for (int i =0; i<=99; i++){ // i: 0 to 99
            numbers[i]=i+1;


        }

        System.out.print(Arrays.toString(numbers));

        int countEven = 0;
        int countOdd = 0;
        int count3 = 0;
        int count5 = 0;

        for (int i = 0; i<+numbers.length-1; i++){
            int eachNumber = numbers[i]; // eachNum: 1,2,3,..100
            if(eachNumber%2==0){
                countEven++;

            }else{
                countOdd++;

            }
            if (eachNumber % 3 == 0) {
                count3++;

            }

             if(eachNumber%5==0){
                 count5++;
             }

        }
        System.out.println();
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
        System.out.println("count3 = " + count3);
        System.out.println("count5 = " + count5);

    }
}
