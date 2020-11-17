package day29_Methods;

public class VoidMethodsPractice3 {

    public static void main(String[] args) {

        eligibleToVote(18,"USA", true);
    }

    public static void eligibleToVote(int age, String citizenship, boolean isAlive) {

        if (citizenship.equalsIgnoreCase("USA")){

            if(isAlive){
                if(age>=18){
                    System.out.println("You are eligible to vote");
                }
            }else{
                System.err.println("You must come back to be alive");
            }
        }else{
            System.out.println("You must be a citizen of USA");
        }

    }

}
