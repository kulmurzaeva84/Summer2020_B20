package day28_Reacap;
/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour

 */
public class Frequency_Of_Word {
    public static void main(String[] args) {
        String str= "javajava";
        // java
        // substring(0,4) ==> java;
        //substring(1,5) ==> avaj;
        // substring(2,6) ==> vaja;
        //substring(3,7) ==> ajav;
        // substring (4,8) ==> java;

        //substring(i,i+4)  This is what approach we need to use

        int count=0;
        for(int i=0; i<=str.length()-4; i++){ // i: 0,1,2,3,4,5,6,7

            String s = str.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                count++;

            }

        }
        System.out.println(count);

        int count1 =0;
        for(int i=0; i<= str.length()-4; i++){
            String word1 = str.substring(i, i+4);
            if(word1.equalsIgnoreCase("java")){
                count1++;
            }
        }
        System.out.println(count1);





















    }
}
