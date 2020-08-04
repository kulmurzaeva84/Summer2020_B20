package day28_Reacap;
// write a method that can remove duplicates from the string
public class Remove_Duplicates {

    public static void main(String[] args) {

        String str = "abababababacccccddddeeee";
        removeDup(str);

    }

    public static void removeDup(String str){ // abab

        String nonDup= ""; // ab
        // str.split("") ==> [ a, b, a, b] to use for each loop we need an array
        for(String each : str.split("")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup); // ==> abcde
    }
}
