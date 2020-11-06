package day16_Scanner;
import java.util.Scanner;

public class Task_Operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one");

        double num1 = input.nextDouble();

        System.out.println("Enter number two");
        double num2 = input.nextDouble();

        System.out.println("Enter the Operator");
        String operator = input.next();

        input.close();
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;

            case "-":
                result = num1 - num2;
                break;

            case "*":
                result = num1 * num2;
                break;

            case "/":
                result = num1 / num2;
                break;

            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println(operator + " is invalid operator");
        }
                System.out.println(num1 + operator + num2 + " = " + result);

        }

    }

