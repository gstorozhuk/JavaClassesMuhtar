package day21_WhileLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        int result = 0; // 5 +10 =15

        for (int i = 0; i<1;) {

            System.out.println("Enter a number: ");

          int num = scan.nextInt();

result += num;

if (num<0){
    break;

}
        }

        System.out.println("result = " + result);

    }
}
