package day17_String;

import java.util.Scanner;

public class Task_ThreeLetterWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three letter word");

        String word = scan.next();

        if (word.length() == 3) {

            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");


            } else {
                System.out.println("Not a cool word");
            }

        } else {

            if (word.length() < 3) {
                System.out.println("Word is too short");

            } else {
                System.out.println("Word is too long");

            }

        }
    }
}

