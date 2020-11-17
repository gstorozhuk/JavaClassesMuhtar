package day29_Methods;

public class Calculator {

    public static void main(String[] args) {

        calculator(10, '+', 2);

    }


    public static void calculator(double n1, char operator, double n2) {


        boolean isValid = operator == '+' || operator == '-' || operator == '%' || operator == '/' || operator == '/';
        if (isValid) {

       //     System.out.println((operator == '+') ? "Addition: " + (n1 + n2) : (operator == '-') ? "Subtraction: " + (n1 - n2)
       //             : (operator == '*') ? "Multiplication: " + (n1 * n2) : (operator == '/') ? "Division: " + (n1 / n2)
           //         : (operator == '%') ? "Remainder: " + (n1 % n2));

switch(operator){
    case '+':
        System.out.println(n1+n2);
        break;

    case '-':
        System.out.println(n1-n2);
        break;

    case'/':
        System.out.println(n1/n2);
        break;

    case '*':
        System.out.println(n1*n2);
        break;
    case'%':
        System.out.println(n1%n2);
        break;


}
        } else {
            System.err.println("Invalid operator");
        }


        }
    }
