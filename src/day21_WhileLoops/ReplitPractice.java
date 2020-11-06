package day21_WhileLoops;

import java.util.Scanner;
public class ReplitPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

String firstName = email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_")).toLowerCase();

        System.out.println("First name: " + firstName);

        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2,email.indexOf("@")).toLowerCase();
        System.out.println("LastName: " + lastName);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
        System.out.println("Domain: " + domain);

        String topLevel = email.substring(email.indexOf(".")+1, email.length());
        System.out.println("Top-Level Domain = " + topLevel);



    }
}
