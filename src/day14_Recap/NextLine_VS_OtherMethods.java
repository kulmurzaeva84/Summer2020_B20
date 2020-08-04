package day14_Recap;

import java.util.Scanner;

public class NextLine_VS_OtherMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt(); //19Enter

        input.nextLine(); // empty method for Enter

        System.out.println("Enter your full Name");
        String fullName = input.nextLine(); // takes Enter
        // need to add an empty variable after nextInt
        System.out.println(fullName+" is "+age+" years old");

    }
}
