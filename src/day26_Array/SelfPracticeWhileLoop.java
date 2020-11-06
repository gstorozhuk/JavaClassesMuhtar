package day26_Array;

import java.util.Scanner;

public class SelfPracticeWhileLoop {


    public static void main(String[] args) {

        String stairs = "";
        int count = 1;

        while (count <= 50) {
            stairs = stairs + "*";
            count++;
            System.out.println(stairs);

        }
        System.out.println("===========================================");


        int num = 1;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);

            }
++num;
        }
        System.out.println("===============================================");
        Scanner scan = new Scanner (System.in);

        int i = 1;
        int j = 1;

        int n = scan.nextInt();

        String stairs2 = "";

    for( i=1; i<=n; i++){
            stairs2 = stairs2 + "*";

            System.out.println(stairs2);


        }
    }
}






