package day28_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDarray2 {

    public static void main(String[] args) {

        int[][]  arr2D1 = {{1,2,3},{4,5,6,7,8}};
        int[][]  arr2D2 = {{10,20,30},{40,50,60,70,80}};
        int[][]  arr2D3 = {{100,200,300},{400,500,600,700,800}};

        int[][][]  arr3D = { arr2D1, arr2D2, arr2D3  };
        //     0        1        2

        System.out.println(Arrays.deepToString(arr3D));


int z =5;

for (int i=5; i>0;i--) {
    z += i;
}
        System.out.println(z);
}

    }

