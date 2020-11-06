package day14_Switch_Recap;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int a = 10;

        if (a % 2 == 0)
            System.out.println("even number");

        else
            System.out.println("Odd number"); // without the {}, blocks can contain one statement only

        System.out.println("==================================");

        int b = 10;
        if (b > 0) System.out.println("positive");
        else if (b < 0) System.out.println("Negative");
        else System.out.println("Zero");

        System.out.println("====================================");


        int number = 8;
        String day = "";

        if (number >= 1 && number <= 7) {

            if (number == 1)
                day = "Monday";
            else if (number == 2)
                day = "Tuesday";
            else if (number == 3)
                day = "Wednesday";
            else if (number == 4)
                day = "Thursday";
            else if (number == 5)
                day = "Friday";
            else if (number == 6)
                day = "Saturday";
            else if (number == 7)
                day = "Sunday";
        }else
            day = "Invalid";
            System.out.println(day);

        }

    }




