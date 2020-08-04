package day23_Arrays;

import java.util.Scanner;

/*
Calculate two numbers
 */

public class NestedLoop_Practice_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Enter two numbers");
            double num1 = input.nextInt();
            double num2 = input.nextInt();
            System.out.println("Enter the math operator");
            char o= input.next().charAt(0);

            /* one way of solution with ternary

            double result = (o=='+')? num1+num2 :(o=='-')? num1-num2 :(o=='*')? num1*num2
                    :(o=='/')?num1/num2 : (o=='%')?num1%num2:0;

            System.out.println(result);
            */

            switch(o){
                case'+':
                    System.out.println(num1+num2);
                    break;
                case'-':
                    System.out.println(num1-num2);
                    break;
                case'*':
                    System.out.println(num1*num2);
                    break;
                case'/':
                    System.out.println(num1/num2);
                    break;
                case'%':
                    System.out.println(num1%num2);
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ) {  // while the answer is invalid
                System.out.println(("Invalid Answer, please enter yes or no"));
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }
            if(a.equals("no")){
                break;
            }

        }
        System.out.println("Thanks for using Cybertek's Calculator");








        }
    }

