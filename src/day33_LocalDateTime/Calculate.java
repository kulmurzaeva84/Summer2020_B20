package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {
    public static void main(String[] args) {

        int a=10;
        double b=20.0;

        System.out.println(addition(a,b));// ==> 30.0

        float num1 = 10;
        float num2= 9;

        System.out.println(addition((int)num1, (int)num2));
        // 19.0 because float can be assigned to double not int
        // or we have to cast by adding int before float nums
        System.out.println(addition(5,2.0));

        int[] arr1={4,3,2,1};
        Arrays.sort(arr1);

        char[] arr2 = {'C','B','A'};
        Arrays.sort(arr2);

        System.out.println("Cybertek");
        System.out.println('A');
        System.out.println(123);
        System.out.println(12.5);

        long l1= 100;
        long l2=200;
        System.out.println(multiplication(l1, l2)); // 20000.0
        // or we can cast and add int to l1 and l2 in sout


    }
    public static int addition(int a,int b){
        return a+b;
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double addition(double a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static double multiplication(double a, double b){
        return a*b;
    }



}
