package day07_Unary_ShortHand;

public class Post_VS_Pre {
    public static void main(String[] args) {
       int a = 10;
        System.out.println(++a);  //11 it got increased immediately and now a is 11
        System.out.println(a);  //11
        System.out.println("==============================================");

        int b = 10;
        System.out.println(b++);  // 10 ; starting from the next operation it returns 11
        System.out.println(b);   // 11

        System.out.println("======================================");

        int c=25;
        int d =c++;  // d = 25;
        // c= 26;
        System.out.println(c); // 26
        System.out.println(d); // 25
        System.out.println("======================================");

        int e= 25;
        e++; // 25
        System.out.println(e); //26

        int x=2;
        System.out.println(x++);
        System.out.println(x);
        System.out.println("======================================");

        int A =1;  // A=0; 1; 0 ; -1 ==> A=-1
        A = -A--  +A++/ -A-- * --A;
        // A = -1 + 0 / -1 * -1 = -1
        System.out.println(A);

        int  C=50; // 50
        C = --C + C++ + C-- + C++;
        // C= 49 + 49 + 50 + 49 = 197
        System.out.println(C);

        int s =4;
        int z = s * 4 - s++;
        // z= 4*4 - 4=12
        // s = 5
        System.out.println(z); // 12
        System.out.println(s);  //5















    }







}
