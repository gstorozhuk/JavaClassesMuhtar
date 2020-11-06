package day18_String;

import java.util.Scanner;

public class String_Practices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an Apple product name");
        String product = scan.nextLine();

        product = product.replace(" ", "").toLowerCase(); //macbook
        switch (product) {
            case "macbook":
                System.out.println("Which model MacBook Would you like?");
                String model = scan.nextLine();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("Macbook Air is $2,400");
                } else if (model.equalsIgnoreCase("pro")) {
                    System.out.println("Macbook Pro is $2,500");
                } else {
                    System.err.println("Invalid model of MacBook");
                }

                break;


            case "iphone":
                System.out.println("Which model Iphone Would you like?");
                String model2 = scan.nextLine().toLowerCase();
                if (model2.equals("12")) {
                    System.out.println("Iphone 12 is $1.000");
                } else if (model2.equals("11")) {
                    System.out.println("Iphone 11 is $900");
                } else if (model2.equals("10")) {
                    System.out.println("Iphone 10 is $800");
                } else if (model2.equals("8")) {
                    System.out.println("Iphone 8 is $700");
                } else {
                    System.err.println("Invalid Model of Iphone");
                }
                break;

            case "ipad":
                System.out.println("Which model Ipad would you like?");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3) {
                    case "air":
                        System.out.println("Ipad air is $500");
                        break;
                    case "pro":
                        System.out.println("Ipad Pro is $400");
                        break;
                    case "mini":
                        System.out.println("Ipad Mini is $300");
                        break;
                    default:
                        System.err.println("Invalid Model of Ipad");

                }

                break;
            default:
                System.err.println("Invalid product name");


        }
    }
}