package day18_String;

import java.util.Scanner;

public class SubStringMethod2 {

    public static void main(String[] args) {

        String str = "Today is Monday";
                   // 012345
        String day = str.substring(9);

        System.out.println(day);

        System.out.println("================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name: ");

        String firstName = scan.next();

        firstName = firstName.substring(0, 1 ).toUpperCase() + firstName.substring(1).toLowerCase();
        System.out.println(firstName);

        System.out.println("Enter last name:" );
        String lastName = scan.next();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

    }
}
