package day19_ForLoop;

import java.util.Scanner;
public class ReplitPractice {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String s1 = scan.next(); ///aoer ytee
        String s2 = scan.next();


        System.out.println(s1.substring(0,1) + s2.substring(s2.length()-1));



        }
    }
