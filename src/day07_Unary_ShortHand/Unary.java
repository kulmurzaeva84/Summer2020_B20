package day07_Unary_ShortHand;
/*
--: decreases the value of variable by 1
++: increases the value of variable by 1
two types of increment/decrements:
pre: place the increment/decrement operators before variable
increases or decreases the value by 1 immediately
-- a, ++ a;

post: postpone place the increment/decrement operators before variable

a ++; a --;



 */
public class Unary {
    public static void main(String[] args) {
        System.out.println( -1 +-10);
        // -1-10= -11

        // --:
        int a = 20;
        // a = a-1; // 19
        --a;
        System.out.println(a);// 19;   -- decreases for 1

        // ++ :
        int b=10;
        b = b+1 ; // b = 11;
        ++b;
        System.out.println(b);

        int x = 100;
        System.out.println(++x);  // 101

        int y = 200;
        System.out.println(--y);  // 199

        int z=80;
        System.out.println(++z);  // 81
        System.out.println(--z);  // 80





    }


}
