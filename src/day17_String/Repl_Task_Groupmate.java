package day17_String;

import java.util.Scanner;

public class Repl_Task_Groupmate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter Item1, count and its price:");
        String item1 = input.next();
        int count1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = input.next();
        int count2 = input.nextInt();
        double price2 = input.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = input.next();
        int count3 = input.nextInt();
        double price3 = input.nextDouble();

        double totalPrice = 0;
        String report = "";


        if(count2 == 0){
            totalPrice = (price1 *count1) + (price3 * count3);
            System.out.println("Item1: "+item1+" Price: "+(price1*count1)+", Item3: "+item3+" Price: "+(price3*count3));
        }else if (count3 == 0){
            totalPrice = (price1*count1) + (price2*count2);
            System.out.println("Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2));
        }else{
            System.out.println("Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2)
                    +", Item3:"+item3+" Price: "+(price3*count3));


        }

        System.out.println ("Total price: "+totalPrice);
        System.out.println(report);







    }
}
