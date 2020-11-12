package day28_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class
ReplitPractice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";
        //TODO: start your code here

        String[] splitWords = sentence.split(" ");


        for (String each:splitWords) {

        }

            for (int i= splitWords.length-1; i>=0; i--){
            reversed+=splitWords[i] + " ";
            }



            //End your code here. do not modify below statement

            System.out.println(reversed);

        }
    }


/*
sentence -> "Java is fun"
reversed -> "fun is Java"
 */