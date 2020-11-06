package day14_Switch_Recap;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 45;
        int weeklyHours = 10;
        int numberOfWeeks = 50;

        int Salary = 0;

        if (hourlyRate > 0) {
            if (weeklyHours > 1 && weeklyHours <= 65) {
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {
                    Salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println("Your salary is: " + Salary);
                } else {
                    System.out.println("number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly hours cannot be less than 1 or greater than 65");
            }
        } else {
            System.out.println("Hourly rate cannot be negative or zero");

        }

    }
}






