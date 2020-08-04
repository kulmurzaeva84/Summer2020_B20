package day20_WhileLoops;

public class Branching_Statements {
    public static void main(String[] args) {

        char ch = 'A';
        while(ch <='E'){

            if(ch=='C'){
                ch++;
               continue;  // skips everything even the iterator
                // break; // exits the loop
            }
            System.out.println(ch);

            ch++;
        }
        System.out.println("=================");
        while(true){
            System.out.println("Test started");
            // break; // exits the loop
            System.exit(0);  // terminates, stops the entire program!
        }

        //System.out.println("Completed");


    }
}
