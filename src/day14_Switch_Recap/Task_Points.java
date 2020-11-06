package day14_Switch_Recap;
import java.util.Scanner;


public class Task_Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int points = 0;

        System.out.println("How many people are you living with?");
       byte liveWithNumber = input.nextByte();

      if (liveWithNumber > 0 && liveWithNumber<=12){
          if (liveWithNumber<=2) {
              points++;

          }else if(liveWithNumber>2 && liveWithNumber<7){
              points+=2;
          } else {
              points +=3;
          }
      }else {
          System.err.println("Not a valid number of people");
      }

        System.out.println("Number of points: " + points);

    }
}
