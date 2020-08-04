package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Desc3_withScanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("How many numbers you want to enter?");

        int size= scan.nextInt(); //5
        int[]arr= new int[size];

        for(int i=0; i<size; i++){   // [10,20,5,40,15]
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] descArr= new int[size]; // will contain desc order of arr

        int k=arr.length-1;  // last indext # of an array
        for(int each: arr){  // 55 68 97 98 100 200
            descArr[k]= each;
            k--;
        }
        System.out.println(Arrays.toString(descArr));













    }
}
