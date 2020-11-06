package day26_Array;

import java.util.Scanner;

public class ReplitZombieAtatck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0;


            while (inhabitants > 0) {
                System.out.println("Day " + day + " [" + inhabitants+ "]");
                day++;
                inhabitants = inhabitants/2;

                if (inhabitants == 0) {
                    break;
                }
            }
        System.out.println("----EXTINCT----");


        }

    }

