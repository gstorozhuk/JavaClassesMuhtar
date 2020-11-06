package day06_ArithmeticOperators;

public class SalaryCalculator {

    public static void main(String[] args) {
        /*
Task01: SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21

    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

         */


    double salary = 100000;
    double stateTaxRate = 0;
    double federalTaxRate = 0.23;
    double stateTax = salary * stateTaxRate;
    double federalTax = salary * federalTaxRate;
    double totalTax = stateTax + federalTax;
    double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: $ " + salary);
        System.out.println("State Tax is: $ " + stateTax);
        System.out.println("Federal Tax is: $" +federalTax);
        System.out.println("Total tax is: $" +totalTax);
        System.out.println("Salary After the taxes is: $" +salaryAfterTax);


/*
double salary = 100000, stateTaxRate = 0.08, federalTaxRate = 0.21,
stateTax = salary * stateTaxRate, federalTax = salary * federalTaxRate,
        totalTax = stateTax+federalTax, salaryAfterTax = salary-totalTax;
 */






    }
}
