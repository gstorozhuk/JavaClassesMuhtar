package day09_SingleIfStatement;

public class EligibleToVote2 {
    public static void main(String[] args) {

        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 18;
        boolean hasCriminalBackground = false;

        boolean isEligible = isUSACitizen == true && age>=18 && hasCriminalBackground == false;


        System.out.println(name + " is Eligible to vote: " +isEligible);

        System.out.println( "=========================================");
// or logic
        String name2 = "John";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "USA" || c2 == "USA";

        System.out.println(eligible);




    }
}
