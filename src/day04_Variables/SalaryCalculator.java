package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 55000;
        double taxRate = 0.28;
         double totalTaxpaid = salary * taxRate;
         double salaryAftertax = salary - totalTaxpaid;


        System.out.println(salaryAftertax);


    }
}
