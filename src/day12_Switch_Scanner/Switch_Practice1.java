package day12_Switch_Scanner;

public class Switch_Practice1 {
    /*
    Write a program to display days: 1- Monday; 2- Tuesday- 7-Sunday
    otherwise - Invalid
     */
    public static void main(String[] args) {
         // in switch you can't use long c = 10l ;
        //                          float f =10.0f;
        //                          decimal = 10.0
        int num =5; // in switch statement whichever case value matches with value will be returned!
        String result= "";

        switch(num){
            case 1:
               result= "Monday";   // System.out.println("Monday");
                break;
            case 2:
                result= "Tuesady";// System.out.println("Tuesday");
                break;
            case 3:
                result= "Wednasday";  // System.out.println("Wednsday");
                break;
            case 4:
                 result= "Thursday";  //System.out.println("Thursday");
                break;
            case 5:
                result= "Friday";   //System.out.println("Friday");
                break;
            case 6:
                result= "Saturday";  //System.out.println("Saturday");
                break;
            case 7:
                result= "Sunday";  //System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");

        }
        System.out.println(result);
        System.out.println("==============================================");

        int x = 10;
        int y = x ++;
        System.out.println(y++ +" "+x++ +" "+y);

        int score = 0;
         if (score ==0){
             score +=50;
         }
         if(score != 0){
             score +=50;
         }
        System.out.println(score);






    }
}
