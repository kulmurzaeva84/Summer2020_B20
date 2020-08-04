package day15_String;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // !charAt(index) String method
        System.out.println("Enter your first name: ");
        String firstName = input.next(); // Cybertek
        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = input.next(); // School
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: "+ch1 + ch2);// returns JK



    }
}
