package day23_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {


        for (int j = 1; j <= 15; j++) {
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}