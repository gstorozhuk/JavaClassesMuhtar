package day22_JavaRecap;

import java.util.Scanner;

public class FindingMinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 999999999; // user most likely to enter a smaller number

        for (int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt(); //100, 200, 300 50, 40

            if(n<min){
                min=n;
            }
        }
        System.out.println("min = " + min);
    }
}
