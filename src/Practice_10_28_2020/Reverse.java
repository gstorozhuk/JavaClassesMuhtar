package Practice_10_28_2020;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String name = scan.nextLine();

        scan.close();


        String result = "";

     /*   result +=name.charAt(name.length()-1);
        result +=name.charAt(3);
        result +=name.charAt(2);
        result +=name.charAt(1);
        result +=name.charAt(0);
*/

        for (int i = name.length() - 1; i >= 0; i--) { //i-- to go backwards
            result += name.substring(i, i+1);
        }
        System.out.println(result);

    }
}