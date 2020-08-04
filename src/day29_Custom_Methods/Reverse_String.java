package day29_Custom_Methods;
// create a method that can reverse any String
public class Reverse_String {

    public static void main(String[] args) {

        reverse("Muhtar");
        reverse("Cybertek");



    }
    public static void reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }








}
