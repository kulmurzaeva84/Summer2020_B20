package day21_Loops;
/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
                10-3=7
                7-3=4
                4-3=3
 */
public class Divide_Two_Numbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int count = 0;
        while(a>b){
            a-=b;
            count++;
        }
        System.out.println(count+" with a reaminder of "+ a);

    }
}
