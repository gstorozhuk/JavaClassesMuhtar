package day14_Switch_Recap;

public class If_Practice {

    public static void main(String[] args) {
        int n = 1000;

        if (n % 2 != 0) {
            System.out.println(n + " is odd number");
        } else {
            System.out.println(n + " is even");
            System.out.println("===============================================");
        }

        int age = 14;
        if (age >= 16) {
            System.out.println("you are eligible to get a license");
        } else {
            System.out.println("not eligible to get license");

            System.out.println("-------------------------------");
        }


        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
        } else {
            System.out.println("fail");
        }
        System.out.println(grade);
        System.out.println("========================================");

        int n1 = 100;
        int n2 = 200;

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than " + n1);
        } else if (n1 == n2) {
            System.out.println(n1 + " Is equal to " + n2);

        } else {
            System.out.println(n1 + "is equal to " + n2);

            System.out.println("==========================================");
        }

        int num = 1;
        if (num == 1) {
            System.out.println("Monday");
        } else if (n == 2) {
            System.out.println("Tuesday");
        } else if (n == 3) {
            System.out.println("Wednesday");
        } else if (n == 4) {
            System.out.println("Thursday");
        } else if (n == 5) {
            System.out.println("Friday");
        } else if (n == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
            System.out.println("=========================================");

            int Age =35;

            if(Age < 21){
                System.out.println("Teenager");
            }else if(Age>= 21 && Age <= 55){
                System.out.println("Adult");
            }else {
                System.out.println("Senior");
            }

        }


    }
}
