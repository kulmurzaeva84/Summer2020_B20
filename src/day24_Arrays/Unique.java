package day24_Arrays;
/*
Write a program that can find the uniques characters from a String
 */
public class Unique {
    public static void main(String[] args) {
        String str = "tthhviojglskjijjjjdkslslllkdkdsdf"; //"aabcc"; b is unique
        // this approach is applicable ONLY for Strings!
        // Only works with chars but NOT words!

        String uniques = "";

        for(int i = 0 ; i <= str.length()-1; i ++ ){
            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last= str.lastIndexOf(ch);

            if(first == last){
                uniques += ch;
            }
        }
        System.out.println(uniques);











    }
}
