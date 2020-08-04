package day16_String;

public class String_Methods2 {
    public static void main(String[] args) {
        // ! isEmpty(): checks if the string is empty and it returns boolean
        // if string length ==0 then true, otherwise false
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());

        String str1 = "Java"; // String pool
        String str2 = new String("Java"); // Heap

        System.out.println(str1 == str2); // false , they are not the same

        System.out.println(str1.equals(str2));

        // ! equals(str): see above example
        // checks only visible text if it's equal and returns boolean
        // cannot ignore the case sensitivity

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4); // fasle
        System.out.println(str3.equals(str4)); // true

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6); // => true
        System.out.println(str5.equals(str6));

        System.out.println("=============================");

        // ! equalsIsIgnoreCase : YES, Yes,yes,yEs ==> yes = true
        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7.equals(str8)); // False
        System.out.println(str7.equalsIgnoreCase(str8)); // true

        System.out.println("===========================");

        // ! contains: checks if String contains the given value
        // returns boolean. Case sensitive
        String str= "I like to learn java programming language";
        System.out.println(str.contains("python")); // false
        System.out.println(!str.contains("python")); //true

        System.out.println(str.contains("java")); // true
        System.out.println(str.contains("Java")); // false

        System.out.println("===========================");

        // startsWith(): checks if the string starts with given str.
        // returns boolean
        String s1 = "Muhtar";
        System.out.println(s1.startsWith("M")); // true
        System.out.println(s1.startsWith("J")); // false
        System.out.println(s1.startsWith("Muh")); // true

        // endsWith(str): checks if the string ends with given str
        // returns boolean

        String word= "";

        if(word.toLowerCase().startsWith("x")){
            System.out.println(word.substring(1));

        }else if( word.toLowerCase().endsWith("x")){
            System.out.println(word.substring(0, word.length()-1));
        }else{
            System.out.println(word);
        }







    }
}
