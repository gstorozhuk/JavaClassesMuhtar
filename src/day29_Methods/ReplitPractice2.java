package day29_Methods;

import java.util.Scanner;

public class ReplitPractice2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};


        String shortest = str[0];

        for (String each : str) {

            if (each.length() < shortest.length()) {
                shortest = each;


            }
        }

        System.out.println(shortest);

    }
}




