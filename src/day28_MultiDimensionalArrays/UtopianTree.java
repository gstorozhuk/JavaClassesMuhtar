package day28_MultiDimensionalArrays;

import java.util.Arrays;

public class UtopianTree {
    public static void main(String[] args) {

        int year = 1;
        int growthPerYear = 0;
        int totalSize =0;

        for( year=1; year <=10; year++){
            if(year<=3){
                growthPerYear = 1;
            }else{
                growthPerYear= 2;
            }
           totalSize += growthPerYear;
            System.out.println("year " + year + " - growth " + growthPerYear + " cm");
            System.out.println("tree size: " + totalSize + " cm");
        }




    }
}








/*
The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year,
this is a simple implementation of the algorithm. You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

Output:
year 1 - growth 1 cm
tree size: 1cm
year 2 - growth 1 cm
tree size: 2cm
year 3  - growth 1 cm
tree size:3cm
year 4 - growth 2 cm
tree size: 5cm
year 5 - growth 2 cm
tree size: 7cm
year 6 - growth 2 cm
tree size: 9cm
... until you reach year 10
 */