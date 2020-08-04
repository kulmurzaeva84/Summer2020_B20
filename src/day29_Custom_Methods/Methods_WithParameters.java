package day29_Custom_Methods;

import java.util.Scanner;

public class Methods_WithParameters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year and current year");

        age(scan.nextInt(),scan.nextInt());
        //int birthYear = scan.nextInt();
        //int currentYear = scan.nextInt();

        //age(birthYear,currentYear);

        printHello(5);
        // age(1984,2030);


    }

    public static void printHello(int n){

        for(int i =0; i<n; i++){
            System.out.println("Hello world");
        }
    }
    public static void age(int birthYear, int currentYear){

        if(currentYear<birthYear){
            System.out.println("Invalid Entry");
        }else {
            int age = currentYear - birthYear;
            System.out.println("Your are " + age + " years old");
        }

    }







}
