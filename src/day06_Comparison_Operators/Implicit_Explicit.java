package day06_Comparison_Operators;

public class Implicit_Explicit {
    public static void main(String[] args) {
        // implicit casting is casting smaller primitive type to larger primitive type
        short s1 = 100;
        long l1 = s1;  // implicit casting: sutomatically dane
        // it's because we can assign short to long, smaller primitive to larger primitve

        long l2 = (long)s1;  // this is how manually you can do implicit casting

        int I1 =300;
        double D1 = I1;  // 300.0 automatically done

        System.out.println("===============================================");

        // Explicit casting is casting larger primitives to smaller primitives
        // MUST be done manually

        double num1 = 100.5;
        int num2 = (int)num1;  // 100

        double d1 = 400.55555;
        int i1= (int)d1;  //400
        System.out.println(i1);

        long L1 = 4400;
        short sh1 = (short)L1; // explicit casting by adding (short) before L1
        System.out.println(sh1);

        int n1 =1000;
        byte b1 = (byte)n1;
        System.out.println(b1); // it returns negative number -24 cuz it's out of range of byte

        double m1 =34.5;
        float f1 = (int) m1;  // float f1 = (long) m1 still works
        System.out.println(f1);
        // anything smaller than float should work

        long r1 = -500;
        int p1 = (int)r1;
        System.out.println(p1); // returns -500

        long r2 = 13;
        byte t1= (byte)r2;
        System.out.println(t1);






    }

}
