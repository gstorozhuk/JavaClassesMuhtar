package day30_ReturnMethods;

public class ReturnMethods3 {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = max(array);

        int min = min(array);

        System.out.println("max = " + max);

        System.out.println("min = " + min);
        System.out.println(max > 100);
        System.out.println(min<-2);

    }

    public static int max(int[] arr) {

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static int min(int[] arr) {


        int min = arr[0];
        for (int each2:arr){
            if(each2<min){
                min=each2;
            }

        }
return min;
    }
}
