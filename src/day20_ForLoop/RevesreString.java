package day20_ForLoop;

import java.util.Scanner;

public class RevesreString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "ABCD";

        String result = ""; // cba

        for (int i = str.length()-1; i >= 0; i--) {
      result+= str.charAt(i);

        }
        System.out.println(result);
    }
}