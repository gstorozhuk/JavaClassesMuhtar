package day18_String;

public class String_Task {

    public static void main(String[] args) {


        String s1 = "I like movies and books";

        String word1 = s1.substring(7, 12+1);

        System.out.println(word1);

        System.out.println("=================");

        String firstName = "cYbertek";

        String firstChar = firstName.substring(0,1).toUpperCase();

        String rest = firstName.substring(1, firstName.length()).toLowerCase();
        firstName = firstChar+rest;

        System.out.println(firstChar);
        System.out.println(rest);

        System.out.println(firstName);




    }
}
