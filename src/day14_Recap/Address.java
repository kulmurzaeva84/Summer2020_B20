package day14_Recap;
/*
write a program for the shipping info that should ask address
building number
Street address
city
state
zip code
full name of the person
ex output: Ship To: Jimmy Joe
                    7878 Jones Branch Dr
                    McLean, Va 22102
 */
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        int buildingNumer = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street address:");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("Enter your state:");
        String stateName = scan.next();

        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        System.out.println("Ship To : "+fullName+"\n"+ buildingNumer+ " "+
                streetAddress+"\n"+cityName+", "+stateName+" "+zipCode);



    }
}
