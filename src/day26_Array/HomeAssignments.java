package day26_Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeAssignments {
    public static void main(String[] args) {



  Scanner input = new Scanner(System.in);
int count = 0;


    String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
        words[i] = input.nextLine();

        count++;

            Arrays.sort(words);


            System.out.println(words);

          /*  Due: --
                    submit
            Instructions from your teacher:
            Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

            Example:
            words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
            prints jaaaaavvaaaaaaaaaa

    }
*/
    //write your code below

}

}

}
