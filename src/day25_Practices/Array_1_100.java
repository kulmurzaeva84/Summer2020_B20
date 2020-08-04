package day25_Practices;

import java.util.Arrays;

public class Array_1_100 {
    public static void main(String[] args) {

        int[]numbers= new int[100]; // Array's size
        //default value of Arr size is 0
        // default value of Arr String is null
        System.out.println(Arrays.toString(numbers));
        /*
        numbers[0]= 1;
        numbers[1]= 2;
        numbers[2]= 3;
        numbers[3]= 4;
        numbers[4]= 5;
        */
        for(int i = 0; i<= numbers.length-1; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        // print only even numbers
        for(int each : numbers){
            if(each%2 !=0){
                continue;
            }
            System.out.print(each+" ");
        }







    }






}
