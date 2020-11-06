package day09_SingleIfStatement;

public class MinimumNumber {
    public static void main(String[] args) {


        int n1 = 50;
        int n2 = 100;
        int n3 = 300;

        boolean n3isMin = n3 < n1 && n3 < n2;
        boolean n2isMin = !n3isMin && n2 < n1;
        boolean n1isMin = !n2isMin && n3isMin;
        String str1 = " is minimum number";
        int min = 0;

        if (n3isMin) {
            // System.out.println(n3 + str1);

            min = n3;

        }
        if (n2isMin) {
            min = n2;

        }
        if (n1isMin) {
            min = n1;

        }

        System.out.println(min + str1);

    }
}