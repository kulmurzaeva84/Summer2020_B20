package day21_Loops;
/*
Write a program that asks user to enter 5 numbers and return the max number
 */
import java.util.Scanner;

public class Max_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;

        for(int i = 10; i<= 50; i+=10){

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 20, 5, 10, 30, 3

            if(num>max){  //if the next user entered number is greater that will be assigned to the max
                max = num;
            }

        }
        System.out.println("Max number: "+ max);



    }
}
