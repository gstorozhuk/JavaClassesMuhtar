package day15_Scanner;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;
//import day14_Switch_Recap.SalaryCalculator;
//if we wanted to use the Class from previous days;
public class Scanner_Int {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner object called scanner

        System.out.println("Enter number one: ");


        System.out.println("Enter number two: ");


        int numOne = scanner.nextInt();// reading an int number;
        int numTwo = scanner.nextShort();// reading an int number

        System.out.println("Number one is " + numOne);
        System.out.println("Number two is " + numTwo);
        System.out.println("Sum " + (numOne + numTwo));
        // all the above are print statements, using the variable we have

        System.out.println("=====================");













}
}