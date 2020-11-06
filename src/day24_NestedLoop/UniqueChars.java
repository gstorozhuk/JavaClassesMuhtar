package day24_NestedLoop;

public class UniqueChars {

    public static void main(String[] args) {

        /*

 3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCCD";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one, and if the frequency of the character is equal to 1, it means it's unique


         */

        String str = "AABCCDERFG";

        for (int index = 0; index <str.length(); index++) {

            int frequency = 0;

           // charAt(index) ----> A
           // other --> AABCCD

           for(int inner =0; inner<str.length(); inner++) {

               // charAt(inner) --> A A B C C D
               if(str.charAt(index) == str.charAt(inner)){
                   frequency++;



               }
           }



           if (frequency==1){
               System.out.print(str.charAt(index));
           }





        }






    }
}
