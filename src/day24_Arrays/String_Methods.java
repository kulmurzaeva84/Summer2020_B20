package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
//   ! toCharArray(); returns char array : A B C D
        String str = "ABCD";
        char[]ch= str.toCharArray();

        System.out.println(Arrays.toString(ch)); // returns [A, B, C, D]

        System.out.println("===========================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1= str1.toCharArray(); //[D C E B A]
        char[] ch2= str2.toCharArray(); // [A D C B E]

        Arrays.sort(ch1); //[ A B C D E]
        Arrays.sort(ch2);  // [ A B C D E]
        boolean r1 =  Arrays.equals(ch1, ch2);
        System.out.println(r1);

//   ! split(value): returns String Array, splits the String by given value
//   We can split the senctence in words and retrieve an array out of it

        String sentence = "I love Programming Language";
        // Reverse the string and get Language Programming love I
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i = words.length-1; i>=0; i-- ){
            System.out.println(words[i]+" ");
        }
        System.out.println("=======================");

        String s = "JAVA";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray(); // all elements are chars
        System.out.println(Arrays.toString(c)); // ell elements are Strings

        // both methods returns exactly the same outputs but with different data types









    }
}
