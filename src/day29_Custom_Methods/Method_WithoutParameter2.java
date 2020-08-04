package day29_Custom_Methods;
/*
step 1: print hello world 5 times
step 2 : print your school name
step 3: pprint hello world 5 times
step 4: print your name
step 5: print hello world 5 times
 */
public class Method_WithoutParameter2 {

    public static void main(String[] args) {
        printHello5x();
        System.out.println("Cybertek");
        printHello5x();
        System.out.println("Muhtar");
        printHello5x();
    }


    public static void printHello5x(){
        for( int i =10; i>= 6; i--){
            System.out.println("Hello World");
        }
    }
}
