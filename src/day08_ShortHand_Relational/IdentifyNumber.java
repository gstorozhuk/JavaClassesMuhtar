package day08_ShortHand_Relational;

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = -100;


boolean ispositive = number>=0;
boolean isnegative = number<0;
boolean iszero = number==0;

        System.out.println( number + " is positive number : " + ispositive);
        System.out.println(number + " is negative number : " + isnegative);
        System.out.println(number + " is zero : " + iszero);


        /*
        number = 100

        output: 100 is positive number: true
        100 is negative number: false
        100 is zero: false

         */

        /*

        angle 1 = 30
        angle 2 = 30
        angle = 90

        sum 150
        output the triangle is valid: false

         */

        int angle1 = 30;
        int angle2 = 60;
        int angle3 = 90;
        int sumOfAngles = angle1 + angle2 + angle3;

        boolean validTriangle = sumOfAngles==180;

        System.out.println("The triangle is valid : " +  validTriangle);






    }
}
