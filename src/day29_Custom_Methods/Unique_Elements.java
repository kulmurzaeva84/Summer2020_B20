package day29_Custom_Methods;

public class Unique_Elements {

    public static void main(String[] args) {
        String[] arr= {"A", "B", "B", "C", "C", "D", "E"};
        uniques(arr);
        System.out.println("Hello");

        String[] arr2= {"A", "B", "C", "C", "D", "E"};
        uniques(arr2);
    }










    public static void uniques(String[] arr){

        for(String a: arr){  // gets each of the element
            int count =0;
            for(String each: arr){ // gets the frequency of the element A
                if(a.equals(each)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(a+" "); // if frequency == 1 then it's unique
            }
        }
        System.out.println();


    }
}
