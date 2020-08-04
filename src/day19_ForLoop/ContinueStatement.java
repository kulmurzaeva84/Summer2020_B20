package day19_ForLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){  // 1 2 3 4 5
            if(i==3){
                continue; // skips 3 and jumps to the next iteration
            }
            System.out.println(i+" "); // 1 2 4 5
        }
        System.out.println("=========================");

        for(char ch = 'A'; ch<= 'F'; ch++){

            if(ch=='C' || ch=='F'){
                continue;
            }
            System.out.print(ch+" ");
        }






    }
}
