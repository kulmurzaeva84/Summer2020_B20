package day21_Loops;
/*
Write a program that asks user to enter 5 numbers and retur the min and max numbers
 */
import java.util.Scanner;

public class Min_and_Max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -9999999; // any enterd input will be greater than this number  -9999999
        int min = 99999999;  // any input will be less than this number 999999

        for(int i=1; i<= 5; i++){
            System.out.println("Enter the number");
            int num = scan.nextInt();

            if(num > max){
                max= num;
            }
            if(num< min){
                min = num;
            }
            System.out.println("Maximum number is: "+ max);
            System.out.println("Minimum number is: "+ min);

        }
    }
}
