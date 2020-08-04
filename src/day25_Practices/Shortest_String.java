package day25_Practices;
// there are two different solutions
public class Shortest_String {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tom", "Ali"};

        int minLength = arr[0].length(); //3

        //for(int i = 0; i <= arr.length-1; i++){  // to find out the minimum lenght of the string in arr
        //    int l = arr[i].length();  // 4  8   4  8

        for(String each : arr){   // we can also do it with for each loop
            int l = each.length();

            if(l < minLength){
                minLength = l;
            }
        }


        //for(int i = 0; i <= arr.length-1; i++){  // to see how many strings' lengths in the array is matching with minLength
         //   if(arr[i].length() == minLength ){
        //        System.out.println(arr[i]);
        for(String each: arr){
            if(each.length()== minLength){
                System.out.println(each);
            }
        }



    }
}
