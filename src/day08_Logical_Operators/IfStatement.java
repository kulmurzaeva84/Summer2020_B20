package day08_Logical_Operators;

public class IfStatement {
    public static void main(String[] args) {
        int a = 2000;
        int b = 2000;


        if (a > b) {
            System.out.println(a + " is the max number");
        }
        if(b > a) {
            System.out.println(b+ " is a the max number");
        }
        if( a == b){
            System.out.println("Both are equal");
        }
        System.out.println("==================================");

        boolean BreakTime = true;
        if(BreakTime == true){
            System.out.println("Take 15 minutes break!");
        }
        if(BreakTime == false){
            System.out.println("Keep studying");
        }
        System.out.println("=================================");
        boolean Corona = true;
        if (Corona == true){
            System.out.println("Buy more toilet papers");
            System.out.println("Keep social distance");
            System.out.println("Buy more hand sanitized");
            System.out.println("Stay at home");
        }

        System.out.println("==================================");






    }

}
