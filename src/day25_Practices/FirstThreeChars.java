package day25_Practices;
// print first three chars of the String
public class FirstThreeChars {
    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};
        /*
        System.out.println(words[0].substring(0,3));
        System.out.println(words[1].substring(0,3));
        System.out.println(words[2].substring(0,3));
        System.out.println(words[3].substring(0,3));

         */
        for(String each: words){
            System.out.print(each.substring(0,3));
        }
        System.out.println();
        System.out.println("=======================");


        for(int i =0; i <= words.length-1; i++){ // i: 0, 1, 2, 3, 4
            System.out.print( words[i].substring(0, 3) );
        }








    }
}
