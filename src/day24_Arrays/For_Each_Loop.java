package day24_Arrays;

public class For_Each_Loop {
    public static void main(String[] args) {
//  ! for(DataType each : Collection of Data){
//    }
//   ! Data Type Must match Array's Data Type
//   ! each : represents every single element in array

        int []arr = {1,2,3,4,5,6,7,8,9,-1,-1,-3};

        for(int i= 0; i<= arr.length-1; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("===================");

        for(int each: arr){  // each : represents the elements, not index number
            System.out.print(each); // prints every single element stored in array
        }

    }
}
