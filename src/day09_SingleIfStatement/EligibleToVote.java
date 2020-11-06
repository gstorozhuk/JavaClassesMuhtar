package day09_SingleIfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "John";
        String citisenship = "USA";

        boolean eligibleToVote = citisenship =="USA";

        System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden? \n" +eligibleToVote);
        System.out.println( "==============================================");

        String name2 = "Jimmy";
        boolean isUSCitizen = false;

        boolean elegibleToVote2 = isUSCitizen == true;

        System.out.println(elegibleToVote2);





    }

}
