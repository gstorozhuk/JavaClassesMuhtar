package day10_IfElseStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        boolean n1IsMax =  n1>n2 && n1>n3;
        boolean n2isMax = !n1IsMax && n2>n3;
        boolean n3isMax = !n2isMax && !n1IsMax;
        String str = " is maximum number";

        if (n1IsMax) {
            System.out.println(n1 + str);
        }
        if(n2isMax) {
            System.out.println(n2 + str);
        }
            if(n3isMax){
                System.out.println(n3 + str);


            }



        }

    }

