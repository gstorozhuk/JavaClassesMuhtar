package day26_Array;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseScanner {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();
        System.out.println("Enter your sentence");
        // monday is today - output

       String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reversedSentence = "";
        for (int i = words.length-1; i>=0; i--){
            reversedSentence+= words[i] + " ";

        }
      reversedSentence =   reversedSentence.trim();
        System.out.println(reversedSentence);
    }
}
