package day31_Recap;

public class Methods_Practice {

    public static void main(String[] args) {

        max(10,20);   // should pass parameters that come from your method created below
    // you can't assign it to a variable or do any function like multiplication...
        // you can only run your code

        int b= max2(10,20);

        System.out.println(max2(10,20));
        System.out.println(max2(10,20) * 30);

    }





    public static void max(int a, int b) {  // a and b are parameters names
        int max= (a > b) ? a : b;
        System.out.println(max);
    }
    // now we are creating a return type:
    public static int max2(int a, int b){

        return (a > b) ? a : b;
    }







}
