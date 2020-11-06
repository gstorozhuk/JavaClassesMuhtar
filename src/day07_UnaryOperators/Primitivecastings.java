package day07_UnaryOperators;

public class Primitivecastings {

    public static void main(String[] args) {

      short a = 3000;
      long b = a; // implicit casting
      // = 3000L

        int d = a;

        double d1 = 200.5;
        int i1 = (int) d1;

        System.out.println(i1);
        System.out.println("============================");

        long l1 = 100;
        short s1 = (short)l1;

        System.out.println(s1);

        double d2 = 300;
        float f1 = (float) d2; // holding Option and hit enter

    double a1 = 400;
    byte b1 = (byte) a1; // will give error; as byte max 127

        System.out.println(b1);

// implicit casting - done automatically, explicit - needs to be doe manually

        long l3 = 100;
        byte l4 = (byte) l3;

        System.out.println(l4);




    }
}
