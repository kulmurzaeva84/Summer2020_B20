package day15_String;

// import java.lang.String; - no need to import , it's automatically imported
//implicitly
//import java.util.Scanner;

import sun.text.resources.cldr.ig.FormatData_ig;

public class String_Intro {
    public static void main(String[] args) {
        String str = "Cybertek";
      //  Scanner input = new Scanner(System.in);

        String name = "Cybertek"; // String literal
        String name2 = new String("Cybertek"); // new keyword
        System.out.println("===============================");

        String c1 = "Cybertek"; // saved in String pool
        String c2 = new String("Cybertek"); // saved in heap
        String c3 = new String("Cybertek"); // heap
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; // different object cuz of case sencitivity

        System.out.println(c1 == c2); // false
        // String literal == new String => false
        System.out.println(c2 == c3); // false
        // new String == new String => false
        System.out.println(c1 == c4); // true
        // String literal == String literal => true
        System.out.println(c4 == c5); // false
        // "Cybertek" == "cybertek" => false

        // ! Memory locations : String pool(for literals) and
        // Heap (for the ones created by new keyword)
        // ! String is immutable! can't be modified once created
        //
        System.out.println("============================");

        String str1 = "Java";
         str1 = "Javascript";
        System.out.println("str1"); // reassigned to Javascript

        str1 = "Java";
        System.out.println(str1); //=> returns Java

        // ! In String each character has a representive number called index
        // index starts with 0 "Jika" -> 0123

        // ! toLowerCase(): created the lowercase of the String
        String name1 = "JIKA";
        name1 = name1.toLowerCase(); // "jika"

        // ! toUpperCase():
        String name3 = "muhtar";
        name3 = name3.toUpperCase(); // MUHTAR
        System.out.println(name3);

        // ! trim(): removes the unused space (white space)
        String p= "       Cybertek     School       ";
        p= p.trim(); // "Cybertek     School"
        // removes only space which is not in between words

        // ! substring(): create the subString of the String
        // from the beginning index to ending index(ending index will be excluded)
        // 1. substring (beg index, ending index)



    }
}
