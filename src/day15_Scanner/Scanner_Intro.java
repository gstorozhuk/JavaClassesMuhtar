package day15_Scanner;
import java.util.Scanner;

public class Scanner_Intro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte b = input.nextByte();
        System.out.println("our number is: " + b);
        System.out.println("plus one: " + (b +1));


    }

}
