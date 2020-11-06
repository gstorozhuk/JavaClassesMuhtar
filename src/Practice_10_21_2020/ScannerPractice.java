package Practice_10_21_2020;


import java.util.Scanner;
public class ScannerPractice {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String expression = scan.next();

        System.out.println("Enter command: ");



        switch(expression){
            case "y":
                System.out.println("Your request is being processed");
                break;
            case "n":
                System.out.println("Thank you anyway for your consideration");
                break;
            case "h":
                System.out.println("Sorry, no help is currently available");
                break;

            default:
                System.out.println("Invalid entry, please try again!");




        }







    }
}