package day08_ShortHand_Relational;

public class Unary_Practice {
    public static void main(String[] args) {


        int a = 100; //101     100
        int b = -a++ + ++a - a-- * a-- % 2;

        //  = -100 + 102 - 102 * 101 %2;
        // = -100 +102 -10302 %2
        // = -100 +102 - 0;
        // = 2-0 = 2

        System.out.println(a);
        System.out.println(b);



    }
}
