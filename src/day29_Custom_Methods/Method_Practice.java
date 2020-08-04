package day29_Custom_Methods;
/*
  1. create a method that can print odd numbers between 1~100
  2. create a method that can print even numbers between 1~100

 */
public class Method_Practice {
    public static void main(String[] args) {

        oddNumbers();
        System.out.println("Hello");

        oddNumbers();
        System.out.println("Hello");

        evenNumbers();
        System.out.println("Hi");
    }

    // task 1
    public static void oddNumbers(){
        for(int i = 1; i<=100; i+=2){  // prints odd numbers in main method when called
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // task 2:
    public static void evenNumbers(){
        for(int i=0;i<=100; i+=2){ // prints even numbers in main method when called
            System.out.print(i+" ");
        }
        System.out.println();
    }







}
