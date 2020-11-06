package day25_ArrayIntro;

import java.util.Scanner;

public class FriendsTvShow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends?");

        int number = scan.nextInt();


        String[] firstName = new String[number];
        String[] lastName = new String [number];

        for (int i=0; i<number; i++) {

            System.out.println("Enter first name: ");
            String f = scan.next();
             f = f.substring(0,1).toUpperCase() + f.substring(1).toLowerCase();
            firstName[i] = f;


            System.out.println("Enter last name: ");
            String l = scan.next();
            l = l.substring(0,1).toUpperCase()+l.substring(1).toLowerCase();
            lastName[i] = l;

        } // loop is used for initializing of arrays

     for (int i =0; i<number; i++){ // used for printing
         System.out.println(firstName[i]+ " "+ lastName[i]);



        }










    }



}
