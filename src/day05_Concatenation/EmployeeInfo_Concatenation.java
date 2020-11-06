package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {

        String firstName = "Galyna";
        String lastName = "Storozhuk";
        String fullName = firstName + " "+lastName;
        char gender = 'F';
        int age = 30;
        String companyName = "\"Capital One\"";
        String jobTitle = "SDET";
        boolean fullTime = true;
        boolean marital = false;
        double salary = 120_000;

        System.out.println("Employee's full name is: "+fullName);
        System.out.println(fullName +"'s gender is: "+gender);
        System.out.println(fullName+"'s age is: "+age+" "+"years old");






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
             John Daniel is full time employee: t
             John Daniel is married: false


         */


    }
}
