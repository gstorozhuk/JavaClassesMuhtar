package day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Galyna";
        String lastName = "Storozhuk";
        String fullName = firstName + " "+ lastName;
        char gender = 'F';
        int age = 30;
        String companyName = "\"Capital One\"";
        String jobTitle = "SDET";
        boolean fullTime = true;
        boolean marital = false;
        double salary = 120_000;









        System.out.print("Employees full name is ");
        System.out.println(fullName);



        System.out.print(fullName);
        System.out.print("'s gender is: ");
        System.out.println(gender);



        System.out.print(fullName);
        System.out.print("'s age is: ");
        System.out.print(age);
        System.out.println(" years old");


        
        System.out.print(fullName);
        System.out.print("'s company name is: ");
        System.out.println(companyName);


        System.out.print(fullName);
        System.out.print("'s job title is: ");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print(" is a full time employee: ");
        System.out.println(fullTime);

        System.out.print(fullName);
        System.out.print(" is married: ");
        System.out.println(marital);

        System.out.print(fullName);
        System.out.print("'s salary is: $");
        System.out.println(salary);










        /*
            firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50

             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false














         */









    }
}
