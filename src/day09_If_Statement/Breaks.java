package day09_If_Statement;

public class Breaks {
    public static void main(String[] args) {

        String itsBreakTime = "No";
        if(itsBreakTime =="Yes"){
            System.out.println("Take 15 min of break");
        }else{
            System.out.println(" Continue the class");
        }
        System.out.println("=======================");

        int a =100;
        int b=200;

        if(a>b){
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }
    }
}
