package day16_String;

import java.util.Scanner;

/*
write a program to ask the user enter two number and a math operator.
        ex:
            10
            20
            *
        output:
            200
            10
            2
            /
        output:
            5
    valid math operators are so those are precondition: *, / , +, -, %
    Nested If or switch
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        System.out.println("Enter your math operator");
        char operator = scan.next().charAt(0);

        // *, / , +, -, %
        boolean valid= operator == '*'||operator=='/' ||operator=='%'
                || operator=='+' || operator== '-';
        if(valid){
            /*(operator=='*')? num1*num2 :(operator== '/')? num1/num2:(operator == '%')?
            num1%num2: (operator == '+')? num1+num2: num1-num2;
             did not work, have no idea why!
            */
            if(operator=='*'){
                System.out.println(num1*num2);
            }else if(operator== '/'){
                System.out.println(num1/num2);
            }else if(operator == '%'){
                System.out.println(num1%num2);
            }else if(operator == '+'){
                System.out.println(num1+num2);
            }else{
                System.out.println(num1-num2);
            }
           /* switch(operator){
                case '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                    break;
                default: // '-'
                    System.out.println(num1-num2);
            }*/

        }else{
            System.out.println("Invalid operator");
        }





    }
}
