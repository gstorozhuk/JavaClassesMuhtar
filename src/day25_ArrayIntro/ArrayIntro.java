package day25_ArrayIntro;

public class ArrayIntro {

    public static void main(String[] args) {
   //     String name = "Cybertek", "Galyna";

       String[] names = {"Galyna", "Ayse", "Inna", "Erjon", "Alex", "Aliya", "Marwan", "Muhtar", "Max"};

       // index num:       0            1       2       3       4

        // retrieve the data


        System.out.println( names [2] );


        String str1 = names[0];

        System.out.println(str1);


        int[] score = {80, 85, 90, 70, 75, 77,67,88, 67};

        // index num   0    1   2   3   4
        System.out.println("=============================");


        /*
        System.out.println(names[3]+ ":"+ score[3]);

        System.out.println(names[2]+ ":"+ score[2]);
*/


        for (int i =0; i<names.length; i++){                        // don't give () in arrays
            System.out.println(names[i]+ ":"+ score[i]);

        }


    }
}


