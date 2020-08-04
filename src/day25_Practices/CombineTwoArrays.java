package day25_Practices;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3, 4,5,6,78,98,12,12,1321,312,321,112};
        int[] arr2 = {4,5,4,5,6,7,8,9,0};
        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size]; //5
        /*
        arr3[0]= arr1[0];  //==> 1
        arr3[1]= arr1[1]; // ==>1,2
        arr3[2]= arr1[2]; // ==>1,2,3

        arr3[3]= arr2[0]; // ==>1,2,3,4
        arr3[4]= arr2[1]; // ==> 1,2,3,4,5

         */
        int index = 0;
        for (int each : arr1) {
            arr3[index] = each;
            index += 1;
        }
        for (int each : arr2) {
            arr3[index] = each;
            index++;



        }
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3) );

        System.out.println("Maximum: "+arr3[arr3.length-1]);




    }
}