package day21_Loops;
/*
Write a program that asks user to enter 5 numbers and return the min number
 */
import java.util.Scanner;

public class Min_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int min = 999999999;

        for(int i = 1; i <= 5; i ++){
            System.out.println("Enter a number");
            int num = scan.nextInt();  // 10 20 30 40 50

            if(num<min){
                min = num;
            }
        }
        System.out.println("Minimum number: "+ min);




    }
}
