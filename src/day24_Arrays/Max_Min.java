package day24_Arrays;

import java.util.Scanner;

/*
Write a program that asks user how many numbers he wants to enter
and get all the user inputs and store them into an array variable,
then return max and min numbers
 */
public class Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();

        int[]arr = new int[n];

        for(int i =0; i< n; i++){  // get user inputs and store into array
            //    or u can use i<=n-1 where n-1 is a lsat index number
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i]= num;
        }
        int max = arr[0];
        int min = arr[0];

        for(int i =0; i<=arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }

        }
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);

       /* for(int i = 0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }

        */




    }
}
