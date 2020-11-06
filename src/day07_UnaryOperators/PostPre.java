package day07_UnaryOperators;

public class PostPre {
    public static void main(String[] args) {

        int x =2; // 3
        int y = x++;

        System.out.println(x);
        System.out.println(y);

        System.out.println("========================");
        int a = 1;// a=-1

        int b =-a-- +a++ / -a-- * --a;
        // b = -1  + 0 / -1 * -1

        // -1 + 0 * -1
         // -1 + 0
          // -1

        System.out.println(b);

        int A = 50; //50
        int B = --A + A++ +A-- +A++;
            //= 49 + 49 + 50 + 49
         // = 197
        System.out.println(B);
        System.out.println(B);

        int X = 4;
        int Y = X*4 - X++;
        // Y = 4 *4 - 4
        // y = 12

        System.out.println(Y);

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;

        //p = -101 * -101 / 100+ 100

    // -10,201/100+100= 202


        System.out.println(p);

        System.out.println("==============================");

        int R = 20; //19 20 19 18
        int W = -R-- + -R++ +  --R*R-- %2;
        // W = -20 +  -19 + 361 %2
        // -20+ -19 + 1; 38


        System.out.println(W);

        System.out.println( " ==================================== ");
        int M = 300;
        int N = 400;

        int J = M + N - M *N + M/N;
        // J = 300 + 400 - 300*400 +300/400
        // 300+400 - 120000 +0.75
        // 700 -120000+0.75
        // -11300 = -112999.25

        System.out.println(J);

    }


}
