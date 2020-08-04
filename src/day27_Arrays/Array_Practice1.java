package day27_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        //! the size is fixed , can't add any other names
        String[] names= {"Jika","Mika", "Dashka", "Erika", "Aika"};
        //                       0      1       2         3
        System.out.println(names[1]);

        for(int i =0; i<= names.length-1; i++){
           if(names[i].charAt(0) != 'A'){
           //  if(!names[i].startsWith("A")) {

                continue;
            }
            System.out.println(names[i]);
        }
        System.out.println("========================");

        int[] numbers = new int[5];
        numbers[1]= 23;
        numbers[0]= 100;
        numbers[3]= 300;
        System.out.println(Arrays.toString(numbers));

        System.out.println("=================================================");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");

        String[] students = new String[ scan.nextInt() ]; //3Enter

        scan.nextLine(); // take out the Enter in scanner
        for(int i = students.length-1 ; i >= 0; i--){ //i: 0,1,2,3...students.length-1
            System.out.println("Enter a name");
            students[i]  = scan.nextLine();
        }


        System.out.println(Arrays.toString(students));


















    }
}
