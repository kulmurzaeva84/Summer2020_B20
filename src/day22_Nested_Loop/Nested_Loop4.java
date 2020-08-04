package day22_Nested_Loop;

public class Nested_Loop4 {
    public static void main(String[] args) {


        for(int j =1; j <= 7; j++){
            for(int k=1; k<=j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        for(int j=7; j>=1; j--){  // horizontal lines
            for(int k=j; k>=1; k--){   // vertical lines
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
