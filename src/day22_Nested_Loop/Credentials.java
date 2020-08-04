package day22_Nested_Loop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
      /*
  valid creds ==>    username: cyber
                    password: tek123
                    after 3 invalid attempts lock the user
       */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.next();
        System.out.println("Enter your password");
        String p = scan.next();

        int attempt =1;

        while( !(u.equals("cyber") && p.equals("tek123")) ){

            if(attempt > 2){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid username or password, Please re-enter");
            System.out.println("Enter your username");
            u = scan.next();

            System.out.println("Enter your password");
            p= scan.next();

            attempt++;
        }
        System.out.println("Logged in");







    }
}
