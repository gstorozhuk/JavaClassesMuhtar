package day12_NestedIf;

public class AgeGroup3 {

    public static void main(String[] args) {

        int age = 31;

          /*  String ageGroups = "";
            if (age <= 2) {
                ageGroups = "infant";
            } else if (age <= 5) { //age <=5,
                ageGroups = "Toddler";
            } else if (age <= 9) {
                ageGroups = "kid";
            } else if (age <= 12) {
                ageGroups = "pre-teen";
            } else if (age <= 17) {
                ageGroups = "teenager";
            } else if (age < 20) {
                ageGroups = "young adult";
            } else if (age <= 39) {
                ageGroups = "adults";
            } else if (age <= 50) {
                ageGroups = "young Middle-Aged Adult";
            } else if (age <= 54) {
                ageGroups = "middle aged adult";
            } else if (age <= 64) {
                ageGroups = "very young senior citizen";
            } else if (age <= 74) {
                ageGroups = "young senior citizen";
            } else if (age <= 84) {
                ageGroups = "senior citizen";
            } else if (age > 85) {
                ageGroups = "old citizen";
            }
            */


        String ageGroups = (age <= 2) ? "infant" : (age <= 5) ? "Toddler" : (age <= 9) ? "Kid"
                : (age <= 12) ? "Pre-Teen" : (age <= 17) ? "Teenager" : (age <= 20) ? "Young Adult"
                : (age <= 39) ? "Adult" : (age <= 49) ? "Young Middle-Aged Adult"
                : (age <= 54) ? "Middle Aged Adult" : (age <= 64) ? "Very Young Senior Citizen"
                : (age <= 74) ? "Young Senior Citizen" : (age <= 84) ? "Senior Citizen" : "Old Senior Citizen";

        System.out.println(ageGroups);

    }
}