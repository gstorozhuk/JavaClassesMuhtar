package day22_JavaRecap;

import java.util.Scanner;

public class ReplitPractice2 {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String start = scan.next().toLowerCase();
        String end = scan.next().toLowerCase();


        if(start.equals("a") && end.equals("d")){
            System.out.println("right > down > left: D found");
        }else  if(start.equals("a") && end.equals("c")){
            System.out.println("right > down: C found");
        }else  if(start.equals("a") && end.equals("b")){
            System.out.println("right: B found");
        }else if(start.equals("a") && end.equals("a")){
            System.out.println("A found");
        }else if(start.equals("b") && end.equals("a")){
            System.out.println("down > left > up: A found");
        }else  if(start.equals("b") && end.equals("d")){
            System.out.println("down > left: D found");
        }else  if(start.equals("b") && end.equals("c")){
            System.out.println("down: C found");
        }else if(start.equals("b") && end.equals("b")){
            System.out.println("B found");

        }else if(start.equals("c") && end.equals("b")){
            System.out.println("left > up > right: B found");
        }else  if(start.equals("c") && end.equals("a")){
            System.out.println("left > up: A found");
        }else  if(start.equals("c") && end.equals("d")){
            System.out.println("left: D found");
        }else if(start.equals("c") && end.equals("c")){
            System.out.println("C found");

        }else if(start.equals("d") && end.equals("c")){
            System.out.println("up > right > down: C found");
        }else  if(start.equals("d") && end.equals("b")){
            System.out.println("up > right: B found");
        }else  if(start.equals("d") && end.equals("a")){
            System.out.println("up: A found");
        }else if(start.equals("d") && end.equals("d")){
            System.out.println("D found");






        }

    }
}