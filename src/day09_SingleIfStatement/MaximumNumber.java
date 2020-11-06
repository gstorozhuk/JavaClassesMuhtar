package day09_SingleIfStatement;

public class MaximumNumber {

    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 500;
        int n3 = 2;

        String str = " is maximum number";

        boolean n1IsMax = n1 > n2 && n1 > n3;
        boolean n2IsMax = !n1IsMax && n2 > n3;
        boolean n3Ismax = !n1IsMax && !n2IsMax;


        if (n1IsMax) {
            System.out.println(n1 + str);
        }
        if (n2IsMax) {
            System.out.println(n2+  str);
        }
        if (n3Ismax) {
            System.out.println(n3+ str);

        }
    }
}