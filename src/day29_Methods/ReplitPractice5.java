package day29_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitPractice5 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

// java is fum == fun is java


        String[] sentenceSplit = sentence.split(" ");


        String reverseSentence = " ";

        for (String each : sentenceSplit) {
        }
        for (int i = sentenceSplit.length - 1; i >= 0; i--) {
            reverseSentence += sentenceSplit[i] + "\n";

        }
        System.out.println(reverseSentence);
    }
}
