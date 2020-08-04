package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            System.out.println("Hello");
            break;
        }
        System.out.println("===================");

        for(char ch = 'A'; ch <= 'H'; ch++){

            System.out.print(ch +" ");

            if(ch =='C'){   // if you place if statement before sout it will return only AB
                break;      // you need to add If statement after sout ==> returns ABC
            }
        }
        System.out.println("========================");

        for( int i= 10; i<=50; i+=10){
            //System.out.print(i+" "); // sout before IF 10 20 30
            if(i==30){
                break;
            }
            System.out.println(i+" "); // sout after IF 10 20
        }
        System.out.println("=======================");

        for(int x=1000; x>=100; x-=100){
           if(x==500){
               break; // exists the loop
           }
            System.out.print(x+" ");// sout before If returns 1000 900 800 700 600 500
            // sout after if returns 1000 900 800 700 600 (without 500)
            // ! make sure sout is placed within loop
        }








    }
}
