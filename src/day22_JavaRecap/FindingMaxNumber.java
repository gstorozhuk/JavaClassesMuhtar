package day22_JavaRecap;

import java.util.Scanner;

public class FindingMaxNumber {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

      int max = -9999999; //user most likely to enter a bigger number /-1->3->4->5
        // maximum number: 

 
      
        for (int i=1; i<=100; i++) {
            System.out.println("Enter number: ");
            int n = scan.nextInt(); // -1, 3, 4, 5
            
            if (n>max){
                max=n;
            }
        }
scan.close();
        System.out.println("max = " + max);  



    }
}