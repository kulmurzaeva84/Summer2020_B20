package day17_String_Review;

public class Pool_VS_Heap {
    public static void main(String[] args) {

        String s1 = "Cybertek";// String pool    those two share the value and they are the same
        String s2 = "Cybertek"; // String pool

        String s3 = new String("Cybertek"); // heap => those are different and need to create a
        //new string
        String s4 = new String("Cybertek"); // heap

        String s5 = "cybertek"; // String pool

        System.out.println(s1 == s2 );// true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false
        System.out.println(s5 == s2); // false
        System.out.println(s5 == s1 ); // false

       /* String methods:
       - charAt()
       - length()
       -upperCase()
       -loweCase()
       - trim()
       - substring()
       replace()
       - replaceFirst()
       - indexOf()
       - lastIndexOf()
       - equals
       - equalsIgnoreCase()
       - isEmpty()
       - ends()
       - starts()
       - contains()
       */


    }
}
