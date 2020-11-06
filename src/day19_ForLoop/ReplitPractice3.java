package day19_ForLoop;

import java.util.Scanner;

public class ReplitPractice3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()%2 !=0) { //odd // javas

            for( int i=0; i<=1; i++){
                System.out.print(word.substring (0, (word.length() / 2)+1));
            }

        }else{

                for( int i=0; i<=1; i++){
                    System.out.print(word.substring(0, word.length()/2));


            }
        }
    }
    }
