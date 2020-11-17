package day29_Methods;

public class ElectionTask {

    public static void main(String[] args) {

eligibleToVote(17,true,true);

sumOfThreeNumbers(10,20,30);

greaterNumber(20,20);

    }

    public static void eligibleToVote(int age, boolean citizenship, boolean isAlive) {

        if (age >= 18 && citizenship && isAlive) {
            System.out.println("Eligible to vote");

        } else {
            System.out.println("Not eligible to vote");
        }

    }

public static void sumOfThreeNumbers(int n1, int n2, int n3 ){

            System.out.println("Sum of 3 numbers is: " + (n1+n2+n3));


















        }


public static void greaterNumber(int n1, int n2){
        if(n1>n2) {
            System.out.println(n1);
        } else if(n2>n1){
            System.out.println(n2);
        }else{
            System.out.println("Equal");
        }
}


    }







