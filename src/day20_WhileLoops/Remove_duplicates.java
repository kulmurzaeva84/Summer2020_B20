package day20_WhileLoops;
/*
// Write a program that can remove the duplicates from any given String
input: abcabcaabb
output: abc
 */
public class Remove_duplicates {
    public static void main(String[] args) {

        String str = "aabbjjjjjjj"; // ab

        String result= "";

        for(int i = 0; i<= str.length()-1; i++){
            String s = ""+ str.charAt(i); // a, a, b, b
            if( !result.contains(s)){  //if the char is already contained in the result it won't be added
                result += s;
            }
        }
        System.out.println(result);


    }
}
