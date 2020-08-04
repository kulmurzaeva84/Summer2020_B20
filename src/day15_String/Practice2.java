package day15_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // !concat()
        System.out.println("Enter your first name");
        String firstName = scan.next(); //"Cybertek"

        System.out.println("Enter your last name");
        String lastName = scan.next(); // "School"

        // String fullName = firstName.concat(" ".concat(lastName)); // "Cybertek School"
        // concat(lastName) returns CybertekSchool without space in between
        String fullName = firstName+lastName;
        //System.out.println("Your full name is: ".concat(fullName));
        System.out.println("Your full name is: "+fullName);

    }
}
