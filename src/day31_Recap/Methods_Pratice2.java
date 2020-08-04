package day31_Recap;
// Reverse the string and then check if it's palindrome
public class Methods_Pratice2 {

    public static void main(String[] args) {
        String name= "madam";
        reverse1(name);
    //  System.out.println(name.equalsIgnoreCase((reverse1(name);)));
    // since it's void method we can't compare it with an original word if it's palindrome

        String rev= reverse2(name);
        System.out.println(reverse2(name));
        System.out.println( name.equalsIgnoreCase( reverse2(name) ));// comparing with original string

    }

    public static void reverse1(String str) {

        String expectedResult = "";  // we need a new string and store reversed version into that string

        for (int i = str.length() - 1; i >= 0; i--) {
            expectedResult += str.charAt(i);
        }
        System.out.println(expectedResult);
    }



    public static String reverse2(String str){

        String expectedResult = "";

        for (int i = str.length() - 1; i >= 0; i--) {
                expectedResult += str.charAt(i);
            }
        return expectedResult;

    }

}
