package day19_ForLoop;

import java.util.Scanner;

public class ReplitPractice2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() > 5) {
            System.out.println("Too long!");
        } else if (word.length() < 5) {
            System.out.println("Too short!");
        } else {

            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {

                reverse = reverse + word.charAt(i);

            }

            System.out.print(reverse);


        }
    }

}


