package day28_Reacap;

import java.util.Scanner;

public class FrequencyOfAnyWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        String word= scan.next();

        //String str= "catcatcatdogdogpythonpython";
        // (0,3)
        int count =0; //cat
        for(int i=0; i<=str.length()-word.length(); i++){
            if(str.substring(i,i+word.length()).equalsIgnoreCase(word)){ // you can find any other word like dog
                count++;  // consisting of three letters

            }
        }
        System.out.println(count);
/*
        for(int i=0; i<=str.length()-6; i++){
            if(str.substring(i,i+6).equalsIgnoreCase("python")){ // you can find the word python
                count++;

            }
        }
        */

        String word2 = scan.next();

        String part =scan.next();
        int count1=0;
        for(int i=0; i<=word2.length()-part.length(); i++){
            if(word2.substring(i, i+part.length()).equalsIgnoreCase(word2)){
                count++;
            }
        }
        System.out.println(count);

    }
}
