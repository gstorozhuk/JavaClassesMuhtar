package day09_SingleIfStatement;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        int age = 20;
        boolean eligible =age >=21;

        //false

        if (eligible) {
            System.out.println("you are eligible to buy alcohol ");
        }

    if(!eligible) {
        System.out.println("Go buy your milk");
    }
        System.out.println("========================================");

    boolean isBreakTime = true;
    if(isBreakTime){
        System.out.println("Time to take a break");
    }

    if(!isBreakTime){
        System.out.println("Let's continue the class");

    }
        System.out.println("==============================");
    int number = 101;
    boolean isEvenNumber = number % 2 ==0;



    if (isEvenNumber) {
        System.out.println(number + " is even number");
    }
    if (!isEvenNumber) {
        System.out.println(number + " is odd number");
    }




    }
}
