package day22_Nested_Loop;

import java.util.Scanner;

/*
Write a program that asks user to enter a string,
 that makes sure If string started with uppercase and ended with lowercase
Ex: Input : Cybertek
output: true
 */
public class Upper_Lower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean start = ch1>='A' && ch1<= 'Z';  // Upper case characters
        boolean end = ch2>= 'a' && ch2 <= 'z';   // lower case characters

        System.out.println(start && end);






    }

}
