package day29_Custom_Methods;

public class MaxMin {
    /*
    1. write a method that can print maximum number from any array of integers
    2. write a method that can print minimum number from any array of integers
     */

    public static void main(String[] args) {
        int[ ]numbers = {10,9,111, 2000,10,30,-100,-200};
        maxNum(numbers);
        minNum(numbers);
    }









    public static void maxNum(int[] arr){

        int max = arr[0];
        for(int each: arr){
            if(each>max){
                max= each;
            }
        }
        System.out.println("Max num: "+max);
    }
    public static void minNum(int[] arr){

        int min = arr[0];
        for(int each: arr){
            if(each<min){
                min= each;
            }
        }
        System.out.println("Min num: "+min);
    }






}
