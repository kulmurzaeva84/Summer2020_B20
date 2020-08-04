package Office_Hours.Practice_07_14_2020;


public class Unique {
    public static void main(String[] args) {

        String str =  "ABABCDDEFFGHHIJJK";
        String expectedResult = ""; // C

        char ch = str.charAt(0); //A
        int count = 0;

        for(int i =0; i<str.length(); i++){
            char each = str.charAt(i);
            System.out.println(each);
            if(each==ch){
                count+=1;
            }
        }
        if(count == 1){ // unique
            expectedResult += ch;
        }
        System.out.println(expectedResult);

    }
}

