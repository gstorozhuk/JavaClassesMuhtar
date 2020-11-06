package day22_JavaRecap;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAAAAAAABBBCCCCCCCCCCCCCCCDDDDDDDDDDDEEEEEEEEEFFFFFFFFFFFFF"; // A, A, A, B, B
        //"AB"

        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String eachCharacter = "" + str.charAt(i);
           if (result.contains(eachCharacter)) { //1st solution

                continue;

            } else {
                result += eachCharacter;


  /*if(!result.contains(eachCharacter)) {
      continue;
  }else{
     result+=eachCharacter;
 */

            }
        }

       System.out.println("result = " + result);


    }
}