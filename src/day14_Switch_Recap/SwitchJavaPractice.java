package day14_Switch_Recap;

public class SwitchJavaPractice {

    public static void main(String[] args) {

       String a ="a";  // long, double, float, boolean cannot be assigned to switch;

        switch (a){
            case "A":
                System.out.println("One");
                break;
            case "a":
                System.out.println("Two");
                break;

        }

    }

}
