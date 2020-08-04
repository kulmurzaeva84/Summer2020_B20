package day28_Reacap;

import java.util.Arrays;

public class MultiDimesional_Arrays {
    public static void main(String[] args) {
        int [] arr1D = {1,2,3};

        //                0 1 2    0 1 2 3 4     0 1  2  3  4
        int[][] arr2D = {{1,2,3}, {4,5,6,7,8} , {9,10,11,12,13}  };
        //                  0          1                2

        System.out.println(Arrays.toString(arr2D[1]));  // single dimensional int array
        // it will return [4,5,6,7,8]
        System.out.println(Arrays.deepToString(arr2D));
        // it will return [[1, 2, 3], [4, 5, 6, 7, 8], [9, 10, 11, 12, 13]]
        // to get 7 we need:
        System.out.println(arr2D[1][3]);
        // for getting the element we use sout()
        // for getting arr (few elements) we need to use sout(Arrays.toString())
        System.out.println("==========================");

        for(int i = 0; i<=arr2D.length-1; i++){ // gets each 1D array from arr2D
        int[] each1DArray = arr2D[i];

        for(int j=0; j<= each1DArray.length-1; j++){  // prints elements of each 1D array
            int eachNum= each1DArray[j];

            if(eachNum %2 ==0){
                System.out.println(eachNum+" ");
            }

            }

        }
        System.out.println();
        for(int[] each1D  : arr2D ){
            for( int eachElement :  each1D ){
                if(eachElement % 2 != 0) {
                    System.out.print(eachElement + " ");
                }
            }

            System.out.println();
        }


    }
}
