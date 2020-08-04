package day31_Recap;
import Library.Util;
public class Frequency_of_Chars {
    public static void main(String[] args) {
        String str = "AABBBCCC";

        String expectedResult= ""; // A2B3C3

        String nonDup = Util.removeDup(str); // ABC

        System.out.println(nonDup); // ABC


        for( char each: nonDup.toCharArray()){
            int count1 = Util.frequency(str, each); // F- 2
            expectedResult += ""+ each + count1;
        }

          // this is one solution with for each loop

        /*
        for(int i=0; i<= nonDup.length()-1; i++){

            char ch1= nonDup.charAt(i);    // ABC
            int count1 = Util.frequency(str,ch1);  // 2 3 3

            expectedResult += ""+ ch1+count1;
        }

         */ // this is done with for loop

       /* char ch1 = nonDup.charAt(0); // returns A
        int count1 = Util.frequency(str, ch1); // F- 2: str is from where we get char A, ch1 is a char we are getting
        expectedResult+= ""+ ch1 + count1;

        char ch2= nonDup.charAt(1); //B
        int count2= Util.frequency(str, ch2); // 3
        expectedResult += ""+ch2+count2;

        char ch3= nonDup.charAt(2); //C
        int count3= Util.frequency(str, ch3); // 3
        expectedResult += ""+ch3+count3;
        */ // this is very long solution

        System.out.println(expectedResult);  // A2B3C3

        System.out.println("==============================================");

        String str2 = "wwweeeeerrrrrrrrrttttttttyyyyyyyuuuuuu";

        String expectedResult2 = frequencyOfChars(str2);

        System.out.println(expectedResult2);


    }

    public static String frequencyOfChars(String str){

        String expectedResult= "";
        String nonDup= Util.removeDup(str);

        for( char each: nonDup.toCharArray()){
            int count1 = Util.frequency(str, each); // F- 2
            expectedResult += ""+ each + count1;
        }
        return expectedResult;

    }

}
