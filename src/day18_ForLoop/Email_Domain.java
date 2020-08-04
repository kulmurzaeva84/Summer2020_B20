package day18_ForLoop;

import java.util.Scanner;

/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
Collaps
 */
public class Email_Domain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        // we need to get a text in between @ and "."
        //String email = "kjika84@gmail.com";
        int index1 = email.indexOf("@");
        int index2 = email.lastIndexOf(".");
        System.out.println(index1); // returns 7
        System.out.println(index2); // returns 13

        String domain = email.substring(index1+1, index2); //gmail
        System.out.println(domain);


       // email.substring();
    }
}
