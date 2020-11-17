package day30_ReturnMethods;

public class ReturnMethods2 {

    public static void main(String[] args) {

        String names = "racecar";

        reverseStr1(names);
        System.out.println("==================================");

     String reverseName =   reverseStr2(names);

     boolean isPalindrome = names.equalsIgnoreCase(reverseName);

        System.out.println(isPalindrome);

    }


    public static void reverseStr1(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }

// return Method

    public static String reverseStr2(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);


        }
return result;

    }
}