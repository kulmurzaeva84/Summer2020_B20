package day07_Unary_ShortHand;
/* Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify
    if the given is Leap Year, print true if it's leap year, otherwise print false
    boolean: ==,!= , <, >, <=, >=
      */
public class Leap_Year {
    public static void main(String[] args) {

        int year= 2040;  // 2021 -false
        boolean result = year % 4 ==0;

        System.out.println(result);
        System.out.println("Year "+year +" is a leap year: "+ result);



    }
}
