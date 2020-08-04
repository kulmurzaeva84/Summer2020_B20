package day31_Recap;

public class WarmUp_Tasks {
    /*
    1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2

            Note: MUST use Arrays and for each loop
     */ // task 1
    public static void main(String[] args) {
        String str= "aabcccd";
        String uniques = ""; // bd

/* this is one way of getting a unique char
        for(int i=0; i<=str.length()-1; i++){
            char ch= str.charAt(i); // will iterate each char from string
            int count = frequency(str, ch); // we are using method instead of loop

            if(count ==1){  // checks if it's unique, if yes it will be concated to uniques
                uniques += ch;
            }
        }

 */ // one solution
        for(char each: str.toCharArray()){ // can also apply toLowerCase()
            int count = frequency(str, each);
            if(count ==1){  // checks if it's unique, if yes it will be concated to uniques
                uniques += each;
            }
        }
        System.out.println(uniques);
        System.out.println("========================");

        String str2 = "pppoiiiiuuuuytttttr";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);

    }

    public static int frequency(String str,char ch){  //
        int count=0;
        for(char each: str.toCharArray()){
            if(each== ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str){
        String uniques = "";

        for(char each  : str.toCharArray() ){
            int count =frequency(str, each);  // frequency of every character
            if(count == 1){
                uniques += each;
            }
        }

        return uniques;
    }












}
