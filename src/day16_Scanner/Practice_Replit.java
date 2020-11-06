package day16_Scanner;

import java.util.Scanner;

public class Practice_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();
        int giftCardValue = 100;
        int price = 0;
        int balance = 0;


        if(item.equalsIgnoreCase("smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("charger")){
            price =15;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");


        }else if(item.equalsIgnoreCase("USB Cable")){
            price=10;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");


        }else if(item.equalsIgnoreCase("headphones")){
            price=30;
            balance =giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");

        }else if(item.equalsIgnoreCase("pants")){
            price=50;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");

        }else if(item.equalsIgnoreCase("hat")){
            price=25;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");

        }else if(item.equalsIgnoreCase("socks")){
            price=5;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");

        }else if(item.equalsIgnoreCase("blanket")){
            price=60;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");

        }else if(item.equalsIgnoreCase("pillow")){
            price=40;
            balance = giftCardValue - price;

            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");

        } else {
            System.out.println("Invalid item!");

        }
    }
}
