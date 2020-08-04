package day34_WrapperClasses;

import java.util.Scanner;

public class WrapperClass_Practice2 {

    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        int a2 = Integer.MIN_VALUE;

        System.out.println(a);
        System.out.println(a2);

        byte b= Byte.MAX_VALUE;
        byte b1= Byte.MIN_VALUE;

        System.out.println(b);
        System.out.println(b1);

        System.out.println("======================");

        Scanner scan = new Scanner(System.in);
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt(); // 10, 15, 5, 12, 0

            if(n>max){
                max= n;
            }
            if(n<min){
                min= n;
            }
        }
        System.out.println("Max num:"+max);
        System.out.println("Min num:" +min);

















    }
}
