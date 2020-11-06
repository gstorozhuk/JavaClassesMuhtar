package day09_SingleIfStatement;

public class IfStatementPractice {
    public static void main(String[] args) {

        boolean isPandemic = false;
        if (isPandemic) {
            System.out.println("wear mask");
            System.out.println("buy toilet paper");
            System.out.println("wash hands");
        }

            if (!isPandemic) {
                System.out.println("live normal life");

            }

        System.out.println("=======================================");

            String name = "David";
            int age = 71;
            boolean isUSCitizen = false;

            boolean eligible = isUSCitizen && age>=18 && age<=70;


            if (eligible) {
                System.out.println(name + " is eligible to vote");
            }
                if (!eligible){
                    System.out.println(name + " is not eligible to vote");

                }




        }


    }

