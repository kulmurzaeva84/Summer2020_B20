package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 120000Enter
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        // it only occurs if you write nextLine method after other next types like
        // nextDouble

        scan.nextLine(); // empty variable took out Enter
        // that left in the scanner's memory

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("Full name: "+fullName);


    }
}
