package day21_WhileLoops;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        int lastIndex = word.length() - 1;
        char f = word.charAt(0);
        char l = word.charAt(lastIndex);

        System.out.println("" + f + l);

        String r1 = "Batch" + 2 + 1;

        System.out.println(r1);

        System.out.println("==================================");

        while (true) {
            System.out.println("Enter building number: ");
            String buildingNumber = scan.next();

            scan.nextLine();

            System.out.println("Enter street name: ");
            String streetName = scan.nextLine(); // enter will be

            System.out.println("Enter your apartment number: ");
            String apartment = scan.next();

            scan.nextLine();

            System.out.println("Enter your city name: ");
            String cityName = scan.nextLine();

            System.out.println("Enter your state name: ");
            String state = scan.next();

            String fullAddress = buildingNumber + " " + streetName + ", Apt# " + apartment + "\n" + cityName;
            System.out.println(fullAddress);

            System.out.println("Would you like to continue? Yes, No");

            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")) {
                break;
            }

            // String buildingNumber next()
            // String street (nextLine()) enter issue
            //apartment num (next())
            // city name


//length: 12345678
            //  Cyberte
            // index 01234567


        }
    }
}