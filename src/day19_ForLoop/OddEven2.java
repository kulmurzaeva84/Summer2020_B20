package day19_ForLoop;
/*
1. Print odd numbers
 */
public class OddEven2 {
    public static void main(String[] args) {

        for(int i =0 ; i<=50; i++){

            if(i%2 != 0){  // if num is Odd , then skip it
                continue; // for Even : if(i%2==0) it will skip odd nums
            }
            System.out.println(i+" "); // returns Even nums
        }

    }
}
