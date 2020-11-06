package day18_String;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Stirng_ExtraTasksNames {

    public static void main(String[] args) {


        Scanner scan = new Scanner( System.in);
        System.out.println("Enter your first name: ");

       String f = scan.nextLine();

       f = f.substring(0,1).toUpperCase() + f.substring(1,f.length()).toLowerCase();

        System.out.println("Enter your last name");

        String l = scan.nextLine();

        l = l.substring(0,1).toUpperCase() + l.substring(1,l.length()).toLowerCase();

        System.out.println("first name is: " +f);

        System.out.println("Last name is: "+l);


    }
}
