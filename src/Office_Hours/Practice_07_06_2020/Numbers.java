package Office_Hours.Practice_07_06_2020;
/*
write a program that can print the numbers between 1 to 100
if the number is divisible by 3, do not print
 */
//public class Numbers {
//    public static void main(String[] args) {
//
//        for(int i=1; i<=100; i++){
//
//            if(i%3 ==0){
//                continue;
//            }else{
//                System.out.print(i+" ");
//            }
//        }
//
//
//
//
//
//    }
//}

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your number:");
        int nums = scan.nextInt();
        int nums2 = 0;
        while(nums>0){
            nums2 = (nums2 * 10)  + nums%10;
            nums=nums/10;
        }
        while(nums2>0){
            System.out.println(nums2%10);
            nums2=nums2/10;
        }




    }
}