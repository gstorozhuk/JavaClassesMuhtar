package day30_ReturnMethods;
import java.util.Arrays;
public class SchoolGrades {

    public static void main(String[] args) {

        checkGrades(165);

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {10, 20, 30};

        combineTwoArrays(a1, a2);
        System.out.println("===========================================");

          noDuplicates("aabbccdd");
        System.out.println("===========================================");
         formatedFullName("GAlYNa", "SchOol");

    }


    public static void checkGrades(int score) {
        if (score >= 0 && score <= 100) {

            System.out.println((score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F');

        } else {
            System.out.println("Invalid score");
        }

    }

    public static void combineTwoArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;


        for (int each : arr1) {

            arr3[i++] = each;
        }

        for (int each2 : arr2) {
            arr3[i++] = each2;
        }

        System.out.println(Arrays.toString(arr3));
    }


// task 4. print without duplicated characters

    public static void noDuplicates(String str) {
        String result = "";
        int count = 0;

        for (String each : str.split((""))) {

            if (result.contains(each)) {
                continue;

            } else {
                result += each;


            }

        }
        System.out.println(result);

    }


    public static void formatedFullName(String first, String last){
        first = first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
      last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();

      String fullName = first + " "+ last;

        System.out.println(fullName);

    }

}



