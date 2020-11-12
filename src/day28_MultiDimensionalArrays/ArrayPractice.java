package day28_MultiDimensionalArrays;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        /*

        Scrum Team
       Testers: {"Dorin", "Adil", "Fatih", "Subhi"}
       Developers: {"Kastrinski", "Mustafa", "Ruslan"}
       SM {"Ayse"}
       PO {"Omid"}
       BA {"Agalar"}

         */

  String [] [] scrumTeam = {
          {"Dorin", "Adil", "Fatih", "Subhi"},
          {"Kastrinski", "Mustafa", "Ruslan"},
          {"Ayse"},
          {"Omid"},
          {"Agalar"}
  };

        System.out.println(Arrays.deepToString(scrumTeam));

for (int i=0; i<= scrumTeam.length-1; i++){
    System.out.println("========================================");

    for ( String [] eachGroup : scrumTeam){
        System.out.println(Arrays.toString(eachGroup));
    }



    }


}

    }

