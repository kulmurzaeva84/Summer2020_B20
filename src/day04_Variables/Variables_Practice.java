package day04_Variables;
/*
  create a class called varibales_Practice:
                declear the following variables:
                         byte   num1 = 100;
                          short  num2 = 10000;
                          double  num3 = 3.5;
                          float  num4 = 2.5f;
                           long num5 = 999999999999;
                          int  num6 = 850000;
 print each of the variables above on the console

 */
public class Variables_Practice {

    public static void main(Variables_Practice3[] args) {

        long num1 = 101;  // no need to add L to a number since default int primitive is less than long so no need!
        byte num2 = 100;
        short num3 = 1000;
        double num4 = 3.5;
        float num5 = 2.5f;  // by default it's double and since float is smaller than double we need to add F so complie takes it as float
        long num6 = 999999999999l;  // we need to add l or it might also be float or double cuz long primitive is smaller than double and float
        int num7 = 85000;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }



}
