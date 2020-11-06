package day14_Switch_Recap;

public class QualificatonForArmy {

    public static void main(String[] args) {
        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = true;
        boolean hasHighSchoolDiploma = true;

        int age = 25;

        if(citizen=="USA" || isResident ||isAlien){

      if (age>=17 && age<=34) {

          if(hasHighSchoolDiploma){
              System.out.println("You are qualified for US Army");

          }else{
              System.out.println("You need to have a school diploma");
          }

      }else{
          System.out.println("You must be between 17 to 34 years old");

      }

        }else{
            System.err.println("You must be a U.S. citizen");
        }
    }
}
