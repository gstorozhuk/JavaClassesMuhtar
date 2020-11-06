package day20_ForLoop;

import java.util.Scanner;

public class CalculateSumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = scan.nextInt();
        int result = 0;


        if (num>=1) {
            for (int i = 1; i <= num; i++) { // used tot calculate the sum and add it to result
                result += i;
            }

        }else{
            System.err.println("Invalid entry");
        }
        System.out.println("result = " + result);
    }
}
