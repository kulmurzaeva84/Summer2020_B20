package day25_Practices;

public class Longest_String {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Tom", "Ali", "Kulmurza", "Murzali"};

        int maxLength = arr[0].length(); // 4 first string and we will compare
        // other strings with first string

        for( String each: arr){

            if(each.length()> maxLength){
                maxLength= each.length();
            }
        }


        for(String each: arr){
            if(each.length() == maxLength){
                System.out.println(each);
            }
        }

    }
}
