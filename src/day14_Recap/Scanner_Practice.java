package day14_Recap;
/*
task:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */
import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Enter Enter
       System.out.println("Enter your gender");

        String gender = input.next(); // Female

        System.out.println("Enter your age");
        int age = input.nextInt(); // 19

        input.nextLine(); // use empty method before next sout

        System.out.println("Enter your country");
        String countryName = input.nextLine();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt(); // 78717

        input.nextLine(); // 1 Enter from zip code field

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("==========================");







    }
}
