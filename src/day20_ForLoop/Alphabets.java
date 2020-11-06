package day20_ForLoop;

public class Alphabets {

    public static void main(String[] args) {
        // 6.  write a program that can print a ~ z in same line sperated by space
        // 7. write a program that can print A ~ Z in same line sperated by space // 65 90


        for (int i = 65; i <= 90; i++) {

            System.out.print((char) i + " ");
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(" " + i + " ");

            System.out.print("");

        }

        char i;
        for (i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");

            System.out.println();

            }
        }
    }
