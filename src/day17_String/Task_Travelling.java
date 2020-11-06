package day17_String;

import java.util.Scanner;


public class Task_Travelling {

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

double cost = 0;

        System.out.println("Do you have a valid passport?");
        String validPassport = input.next();
        if(validPassport.equalsIgnoreCase("yes")){
            cost = 1000;

            System.out.println("Which country do you want to go to?");
            input.nextLine();
            String country = input.nextLine();

            System.out.println("How many bags would you have?");
            byte bags = input.nextByte();
            cost +=(bags*50);

            System.out.println("How many people are you travelling with?");
            short numOfPeople = input.nextShort();
            if (numOfPeople>=3) {
                cost -= 300;
            }else{
                cost -=(numOfPeople*100);
            }
            System.out.println("Enter names of the people you are travelling with: ");
            input.nextLine();
            String namesOfPeople = input.nextLine();

            System.out.println("Your ticket is booked to "+ country + ".We have extra charge for the "+ bags + " Bags but you are travelling with "+ namesOfPeople);

        }else{

        }

    }
}
