package day17_String;

import java.lang.String; // this package is always imported automatically
public class String_Memory {

    public static void main(String[] args) {
       /*
        string pool :
      ===========>  "java"   <==========
        strOne                  strTwo
                       "Java" strFive



        Heap: "java" <======== strThree
              "java" <========== strFour

        */
        String strOne = "java";//literal

        String strTwo = "java";//literal

        String strThree = new String("java");

        String strFour = new String("java");

        System.out.println(strOne==strTwo);
        System.out.println(strOne==strThree);
        System.out.println(strThree==strFour);

        String strFive = "Java"; // made in the String pool

        System.out.println(strThree==strFive);



    }
}
