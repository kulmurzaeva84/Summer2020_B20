package day24_Arrays;
// SECOND APPROACH
public class Unique_Words2 {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "C++", "Ruby"};

        for(String each: words){
            String s = each;
            int count =0;
            for(String b: words){  // b represents every element in the array
                if(s.equals(b)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s);
            }
        }


    }
}
