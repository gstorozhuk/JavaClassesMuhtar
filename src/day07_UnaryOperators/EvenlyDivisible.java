package day07_UnaryOperators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        /*

        2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5
			Ex:
				number = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true

				number = 80;
			output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true

		Hint: if the remainder < 1 (means 0) ==> evenly divisible
		> , <

		65 % 2 < 1 ==> 65 evenly divisible by 2
		65 % 3 < 1 ==> 65 evenly divisible by 3
		65 % 5 < 1 ==> 65 evenly divisible by 5
         */


        int number = 99;
        int remainderOf2 = number % 2;
        boolean divisible1 = number % 2 <1;


        int number1 = 99;
        int remainderOf3 = number1 % 3;
        boolean divisible2 = number1 % 3 < 1;

        int number2 = 99;
        int remainderOf5 = number2 % 5;
        boolean divisible3 = number2 % 5 <1;

        System.out.println(number+ " is devisible by 2 : " + divisible1);
        System.out.println(number1+ " is devisible by 3 : " + divisible2);
        System.out.println(number2+ " is devisible by 5 : " + divisible3);


    }
}
