package day29_Methods;

public class ReverseString {

    public static void main(String[] args) {
        // Cybertek ==> ketrebyC




        reverseString("Galyna");


        System.out.println("======================================");

        String []names = {"Sayyohat", "Livio", "Marwan", "Inna", "Halim", "Afrooz", "Maryam"};

        for (String each:names) {

            reverseString(each);

        }
    }

public static void reverseString ( String word){

        String result = "";

     for ( int i=word.length()-1; i>=0; i--){

         result+=word.charAt(i);

     }

    System.out.println(result);
    }



}

