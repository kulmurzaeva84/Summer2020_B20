package day29_Custom_Methods;

public class EligibileToVote_BuyAlcohol_Calculator {

    /* task 1:
    age,citizenship,name
     */
    public static void main(String[] args) {
        vote("John", 28, true, "Biden");

        vote("Jika", 36, true, "Noone");

        eligibleToBuyAlcohol(true, 19);

        calculator(100,'*', 20);

    }



    public static void vote(String name, int age, boolean citizen, String presidentName){
        boolean eligibleToVote = age>=18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for "+ presidentName);
        }else{
            System.out.println(name+ " is not eligible to vote");
        }
    }
    /* task 2:
    check eligibility to buy alcohol
    */
    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age >=21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are eligible to buy milk");
        }
    }
    /* task 3:
    calculate the garde of the student based on the score
     */
    public static void calculator(double num1, char operator, double num2 ){
       // + - * / % or invlaid
        switch(operator){
            case '+':
                System.out.println("Addition: "+ (num1 +num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1- num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1 * num2));
                break;
            case '/':
                System.out.println("Division: "+(num1 / num2));
            case '%':
                System.out.println("Remainder: "+(num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }







}
