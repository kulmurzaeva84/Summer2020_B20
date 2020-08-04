package day29_Custom_Methods;

public class PalindromeTest {
    /*
    check if the string is a palindrome, print true or false
    kayak, mom,level
     */
    public static void main(String[] args) {
        palindrome("level"); // true
        palindrome("Jika");  // false
    }

    public static void palindrome(String word){
        String reversed ="";
        for( int i= word.length()-1; i>=0; i--){
            reversed += word.charAt(i);
        }
        System.out.println(reversed.equalsIgnoreCase(word));
    }











}
