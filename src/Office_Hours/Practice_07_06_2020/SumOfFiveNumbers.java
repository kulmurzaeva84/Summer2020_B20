package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

/*
write a program that can ask the user to enter a number for five times and
then return the sum of those five numbers
 */
public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*int sum = 0;
        for(int i = 1; i <=2; i+=1){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println(sum);
*/
        int n = scan.nextInt();
        int sum1 = 0;

        for(int i=1; i<= n; i+=1){

            sum1 +=n;
        }
        System.out.println(sum1);







    }
}
