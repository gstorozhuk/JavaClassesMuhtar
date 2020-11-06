package day17_String;
import java.util.Scanner;


public class Task_Sentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number from 1-10");

        byte num = input.nextByte();

        if (num > 0 && num < 11) {


            System.out.println("Can you enter that number as a word");

            String numWord = input.next();

            boolean areMatching = false;

            switch (numWord) {

                case "one":
                    areMatching = (num == 1);
                    break;
                case "two":
                    areMatching = (num == 2);
                    break;
                case "three":
                    areMatching = (num == 3);
                    break;
                case "four":
                    areMatching = (num == 4);
                    break;
                case "five":
                    areMatching = (num == 5);
                    break;
                case "six":
                    areMatching = (num == 6);
                    break;
                case "seven":
                    areMatching = (num == 7);
                    break;
                case "eight":
                    areMatching = (num == 8);
                case "nine":
                    areMatching = (num == 9);
                case "ten":
                    areMatching = (num == 10);
                    break;

            }

            if (areMatching) {

                System.out.println("Number: " + num);
                System.out.println("Word: " + numWord);

            } else {
                System.out.println("The two inputs do not match");

            }

        }
   input.close();


    }
}
