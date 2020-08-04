package day23_Arrays;

public class Arrays_MaxMin {
    public static void main(String[] args) {
        int[] arr= {5,5,4,6,4,1};
        int max = arr[0];  //5
        int min = arr[0];
        for(int i = 1; i<= arr.length-1; i++){  // i : 1,2,3,4,5
            if(arr[i]> max){   // compares the arrays elements and assigns the max number to variable max
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max number is: "+ max);
        System.out.println("Min number is: "+min);

















    }
}
