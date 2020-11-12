package day28_MultiDimensionalArrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String [] employeeNames = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat"};
        // index nums                   0       1       2       3           4


        int [] employeeSalary = {10000, 11000,105000,120000,115000};
        //                          0      1    2       3       4
        /*
         */
int max = employeeSalary[0];

String nameOfMax = "";

        for (int i =0; i<=employeeNames.length-1; i++){

            System.out.println(employeeNames[i] + " : $" + employeeSalary[i]);

            if (employeeSalary[i]>max) {
                max = employeeSalary[i];
                nameOfMax=employeeNames[i];
            }

        }
        System.out.println(max);
        System.out.println("nameOfMax = " + nameOfMax);
    }
}
