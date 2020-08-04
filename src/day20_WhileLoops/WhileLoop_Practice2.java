package day20_WhileLoops;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String psw = "Cybertek123";

        System.out.println("Enter your psw");
        String input = scan.nextLine();


        while(!input.equals(psw)){
            System.out.println("Please re-enter your psw");
            input = scan.nextLine();
        }
        System.out.println("Logged In");
    }
}
