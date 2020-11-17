package day29_Methods;

import java.util.Scanner;
import java.util.Arrays;

public class ReplitPractice3 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};


        for (int i = 0; i <= temps.length - 1; i++) {
            k++;
            total += temps[i];
            avgTemp = total / k;

        }

        System.out.println(avgTemp);

    }
}



        /*

        Given an array temps of doubles, containing temperature data, compute the average temperature.
Store the average in a variable called avgTemp.
Besides temps and avgTemp, you may use only two other variables -- an int variable k and a double variable named total, which have been declared.
Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
         */





