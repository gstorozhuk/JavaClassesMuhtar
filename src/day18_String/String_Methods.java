package day18_String;

import java.util.Scanner;


public class String_Methods {

    public static void main(String[] args) {


        String str = "Cybertekn";

        str = str.concat("School"); // Cybertek School

        System.out.println(str);
         String str2 = "Cyberteck ";

         str2 = str2 + "Cybertek";

        System.out.println(str2);

        System.out.println("==========================================");

        String name = "bank of america";

        name = name.toUpperCase(); // "BANK OF AMERICA

        System.out.println("name = " + name);

        name = name.toLowerCase();

        System.out.println("===================================================");

        String t1 = "       Hello";
        t1 = t1.trim();
        System.out.println(t1);

        System.out.println("===================================");

Scanner scan = new Scanner( System.in);

        System.out.println("Enter your first name ");

        String firstname = scan.nextLine();

        firstname = firstname.trim();


        System.out.println("Enter your last name ");
        String lastname = scan.nextLine();
        lastname = lastname.trim();


        System.out.println("First name is: " + firstname);
        System.out.println("Last name is: " + lastname);







    }
}
