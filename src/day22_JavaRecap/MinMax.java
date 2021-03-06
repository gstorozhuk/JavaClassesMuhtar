package day22_JavaRecap;

import java.util.Scanner;

public class MinMax {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647;
        int max = -2147483648;


        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n < min) { // if input is smaller than previous min number
                min = n;
            }
            if (n > max) { // if the number is greater than previous max num
                max = n;

            }
        }

        scan.close();
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}