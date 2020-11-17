package day29_Methods;

import java.util.Arrays;

public class HomeWorkCombinedInegers {


    public static void main(String[] args) {

int arrX[] = {1,2,3,4};
int arrY [] = {5,6,7};

combineArrays(arrX, arrY);



    }
/* arr1 = {1,2,3,4}
arr2 = {5,6,7}


output ===> {1,2,3,4,5,6,7}
 */

    public static void combineArrays(int arr1[], int arr2[]) {
        int [] newArray = new int [arr1.length+ arr2.length];

    int i=0;

    for (int each:arr1){

     newArray[i]=each;
     i++;

        }
        for (int count:arr2) {
           newArray[i]=count;
           i++;
        }

        System.out.println(Arrays.toString(newArray));
            }

        }




