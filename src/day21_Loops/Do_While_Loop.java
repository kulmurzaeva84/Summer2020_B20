package day21_Loops;

public class Do_While_Loop {
    public static void main(String[] args) {

        boolean result= false;

        while(result){
            System.out.println("Hello World");
        }
        System.out.println("====================");

        do{ // just do it
            System.out.println("Hello World");
        }while (result); // it it's false do not do it again
    }
}
