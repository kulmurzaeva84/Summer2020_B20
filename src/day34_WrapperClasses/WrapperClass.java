package day34_WrapperClasses;

public class WrapperClass {

    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;

        byte t =100;
        int z= t;

        // Integer z2= t; doesn't work

        Byte b1 =50;
        int n1 = b1;

        byte b2 = 40;
        // Integer n2= b2;

        Integer n3 = new Integer(123);

        int[] arr = new int[3]; // default class for primitive is 0

        Double[] arr1 = new Double[3]; // default value for wrapper class is null

        int p1 =300;
        Integer p2 =p1; // Autoboxing : converting primitive values to wrapper class values

        Integer q1 = 500;
        int q2=q1; // Unboxing : converting wrapper class values to the primitives

       // Double r1 =300; // wrapper class is only dedicated to its primitive so for Double it should be decimal only
        Double r1= 300.0;
        double r2 = r1;  // unboxing
        Double r3 = r2;  // autoboxing

        long l1 =400;
        Long l2 = l1; //  autoboxing long to Long




    }
}
