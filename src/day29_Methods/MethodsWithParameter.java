package day29_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {

        int age = 35;

        eligibleToBuy(age);
        eligibleToBuy(30);

        calculateAge(1989, 2020);

    }


    public static void eligibleToBuy(int age) {

        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }


    }

    public static void calculateAge(int birthYear, int currentYear) {

        if (birthYear < currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear));
        } else {
            System.out.println("Invalid entry");


        }


    }
}

