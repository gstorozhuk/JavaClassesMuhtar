package day29_Methods;

public class MethodsWithoutParameters2 {

    public static void main(String[] args) {

        printEvenNumbers1to100();
        System.out.println();
        printOddNumbers1to100();


    }
        public static void printEvenNumbers1to100 () {

          for (int i=0; i<100; i++){

              if(i%2==0){
                  System.out.print(i + " ");
              }
        }

    }
public static void printOddNumbers1to100 () {

    for (int i=0; i<100; i++){

        if(i%2!=0){
            System.out.print(i + " ");
        }
    }
    System.out.println();
}
}




// to be able to print even numbers from 1 to 100 separated by a space