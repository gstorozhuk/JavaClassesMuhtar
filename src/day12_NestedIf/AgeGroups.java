package day12_NestedIf;

public class AgeGroups {

    public static void main(String[] args) {

       int age = 12;

       String ageGroups = "";
       if (age>=1 && age <=2) {
           ageGroups = "infant";
       } else if (age>=3 && age<=5){ //age <=5,
          ageGroups = "Toddler";
       } else if (age >=6 && age<=9){
           ageGroups = "kid";
       } else if (age >=10 && age <=12){
           ageGroups = "pre-teen";
       } else if (age>=13 && age<=17){
           ageGroups = "teenager";
       } else if (age>=18 && age<20){
           ageGroups = "young adult";
       } else if (age>=21 && age<=39){
           ageGroups = "adults";
       } else if (age>=40 && age<=50) {
           ageGroups = "young Middle-Aged Adult";
       } else if (age>=50 && age <=54) {
           ageGroups = "middle aged adult";
       } else if (age>=55 && age <=64){
           ageGroups = "very young senior citizen";
       } else if (age>=65 && age<=74){
           ageGroups = "young senior citizen";
       } else if (age>=75 && age<=84) {
           ageGroups = "senior citizen";
       } else if (age>85){
           ageGroups = "old citizen";
       }

        System.out.println(ageGroups);








        /*
        write a program that can define the age groups of a person
                 age groups are:
                        infant (< 1 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

         */









    }


}
