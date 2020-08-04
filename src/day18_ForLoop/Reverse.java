package day18_ForLoop;
/*
write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

 */
public class Reverse {
    public static void main(String[] args) {
        String str = "Java";
        //       avaJ ==> ava,J
       String s1 = str.substring(1); // ==> ava
        char ch1 = str.charAt(0);
        // another way: String s2 = str.substring(0,1);
        String result1 = s1+ch1; // avaJ ==> need to add instead ch1 -> s2

        System.out.println(result1);




    }
}
