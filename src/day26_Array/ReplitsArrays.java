package day26_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitsArrays {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine().toLowerCase();
        //write your code below


        char[] array = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < word.length(); i++) {


            for (int j = 0; j < array.length; j++) {

                if (word.charAt(i) == array[j]) {

                    System.out.print(word.charAt(i));
                }


            }
        }

    }
}