package day09_SingleIfStatement;

public class MaximumMinimum {

    public static void main(String[] args) {

        int num1 = 200;
        int num2 = 200;

        boolean maxNum1 = num1 > num2;
        boolean maxNum2 = num2 > num1;
        boolean equal = !maxNum1 && !maxNum2;

        if (maxNum1) System.out.println(maxNum1 + " is maximum number");
        if (maxNum2) System.out.println(maxNum2 + " is maximum number");
        if (equal) {
            System.out.println(" Both are equal");
        }

    }
    }

