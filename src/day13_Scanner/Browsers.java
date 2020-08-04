package day13_Scanner;
/*
write a program that can display the selected browser
            1.1  declear a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
 */
public class Browsers {
    public static void main(String[] args) {

        String browserName = "chrome";
        // boolean, long, double, float = can't use this types

        switch(browserName){
            case "chrome":
                System.out.println("Opening Chrome Browser");
                break;
            case "firefox":
                System.out.println("Opening Chrome Browser");
                break;
            case "opera":
                System.out.println("Opening Opera Browser");
                break;
            case "safari":
                System.out.println("Opening Safari Browser");
                break;
            case "edge":
                System.out.println("Opening Edge Browser");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }

    }
}
