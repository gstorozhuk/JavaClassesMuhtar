package day06_ArithmeticOperators;

public class Variables_Recap {

    public static void main(String[] args) {

/*
    Variables: reuse data
        DataType  variableName = Data;

        date needs to match with dataType

    important primitives:
        int: integer numbers (whole numbers)
        double: deciaml numbers
        char: single character
        boolean: Ture or False

        double > float > long > int > short > byte
 */
        System.out.println("My name is Galyna");

        String name = "Galyna";

        System.out.println("My name is " + name);

      /*
      Task01:
        create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;

                output:
                    10 kg equal to 22.0462 pounds

                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds

       */
    double kg = 57.9;
    double lbs = kg * 2.20462;
        System.out.println(kg+ " kg equal to "+ lbs + " pounds");

      double gallon = 50;
      double liters = gallon * 3.78541;

      boolean exceed300 = liters > 300;
        System.out.println(gallon + " Gallons exceeds 300 Liters: " + exceed300);

        System.out.println(gallon+ " gallons are equaling "+ liters + " liters.");

        System.out.println("=============================================");






    }
}
