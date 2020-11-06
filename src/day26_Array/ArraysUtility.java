package day26_Array;
import java.util.Arrays;
public class ArraysUtility {

    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers); // hashcode

        System.out.println(Arrays.toString(numbers));

        String [] classMates = {"Vadym", "Aidai", "Karolina", "Nour", "Oleg"};

        System.out.println(Arrays.toString((classMates)));

        int []arr1 = {2000, 100000, 499, 123456, 789,12222000};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("arr1 = " + arr1[arr1.length-1]);

        double [] arr2 = {1.5, 0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println("Second minmum number: " +arr2[1]);
        System.out.println("Second max number: " + arr2[arr2.length-1-1]);


        String [] classMates2 = {"Vadym", "Aidai", "Karolina", "Nour", "Oleg"};

Arrays.sort(classMates2);
        System.out.println(Arrays.toString(classMates2));

// equals method (arr1, arr2)
        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};

        boolean r1 = Arrays.equals(a1,a2);

        System.out.println(r1);

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean r2= Arrays.equals(a1,a2);
        System.out.println(r2);

    }
}
