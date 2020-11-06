package day09_SingleIfStatement;

public class ValidTriangle {

    public static void main(String[] args) {

      double angle1 = 10;
      double angle2 = 30;
      double angel3 = 90;

      boolean isvalid = (angle1 + angle2 +angel3)==180;

      if (isvalid){
          System.out.println(" is valid triangle");
      }

      if (!isvalid){
          System.out.println( " is not a valid triangle");
      }

    }
}
