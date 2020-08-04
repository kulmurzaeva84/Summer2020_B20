package Office_Hours.Practice_07_01_2020;
/*
 Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
import java.util.Scanner;

public class Combine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 =  scan.next();//"one";
        String str2 = scan.next(); //"eight";

        /* One solution
        char ch1 = str1.charAt(str1.length()-1); // how we get the last char from str1

        char ch2 = str2.charAt(0); // returns the first char from str2

        if(ch1 == ch2){
            System.out.println(str1+str2.substring(1)); //excluding the first character of the second word

        }else{
            System.out.println(str1+str2);
        }*/ // frist solution

        String s1 = str1.substring(str1.length()-1, str1.length());// "e"
        //                         substring(2,3)==> e the same as substring(2)
        String s2 = str2.substring(0, 1 );  //==> "e"
        if(s1.equals(s2)) {
            System.out.println(str1+str2.substring(1)); // str2 will print starting only from index 1
        }else{
            System.out.println(str1+str2);
        }




    }
}
