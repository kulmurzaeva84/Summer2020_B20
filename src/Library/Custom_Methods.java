package Library;

public class Custom_Methods {

    public static void removeDup(String str){ // abab

        String nonDup= ""; // ab
        // str.split("") ==> [ a, b, a, b] to use for each loop we need an array
        for(String each : str.split("")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup); // ==> abcde
    }
    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);

    }






}
