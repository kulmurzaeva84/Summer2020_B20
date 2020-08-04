package day29_Custom_Methods;

public class Return_KeyWord {
    // calculate the garde of the student based on the score
    // ! return terminates the method
    public static void main(String[] args) {

        grade(101);
        eligibleToBuyAlcohol(19);

    }






    public static void grade(int score){

        if(score<0 || score>100){
            System.out.println("Invalid score");
            return;
        }
        char grade = (score >=90)? 'A': (score>=80)? 'B' : (score>=70)? 'C': (score>=60)? 'D':'F';
        System.out.println("Grade is "+grade);
    }

    public static void eligibleToBuyAlcohol(int age){
        if(age<21){
            System.out.println("You are not eligible to buy alcohol");
            return;
        }
        System.out.println("You are eligible to buy alcohol");
    }













}
