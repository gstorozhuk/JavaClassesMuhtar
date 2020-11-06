package day17_String;

import java.util.Scanner;

public class Scanner_Review2 {

    public static void main(String[] args) {

Scanner input = new Scanner ( System.in);

        System.out.println("Enter the product name");
        String product = input.nextLine();
        System.out.println("Enter the price");
        double price = input.nextDouble();


        System.out.println("Enter the quantity");

        int quantity = input.nextInt(); // enter was accepted as input

        input.nextLine();// entered extra before any data before the actual data is stored, "next Line issue";

        System.out.println("Enter the full name");

        String fullName  = input.nextLine();

        System.out.println(fullName + "your order for " + quantity + " " + "has been placed. Your total is " + (price*quantity));





    }
}
