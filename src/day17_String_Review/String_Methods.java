package day17_String_Review;

public class String_Methods {
    public static void main(String[] args) {

    // charAt(): retrieves char from the string by index number

    String str= "Cybertek";
    //           01234567
        char ch1 = str.charAt(1);
        System.out.println(ch1); // => y

        // + "":
        String str2 = "Cybertek"; // ! reassign it to a new value
        str2 = str2+ " School"; //==> returns Sybertek School

        System.out.println("========================");

        // length() ==> returns int, assign it to int
       String str3 = "Cybertek"; // 8 digits

        int l = str3.length();
        System.out.println(l); // ==> retuns 8 and max # is 7, 8 does not exist

        // lastindex: length-1 returns the last index
        //char ch2 = str3.charAt(-2); // ==> -2 or 8 does not exist
       // System.out.println(ch2);
        // you need to add -1 to get the last index
        char ch2 = str3.charAt(l-1); // => returns "k" cuz assigned to char
        System.out.println(ch2);
        System.out.println("last index:"+ (l-1));

        // upppercase and lowercase:
        String str4= "cybertek"; // ! always reassign
        str4 = str4.toUpperCase(); // "CYBERTEK"
        System.out.println(str4);

        String str5 = "JAVA";
        str5 = str5.toLowerCase(); // "java"
        System.out.println(str5);

        // trim() - removes white space, does not remove spaces in between words,
        // only unnecessary ones
        String str6 = "     Cybertek        ";
        System.out.println(str6); // reassign to see difference

        str6 = str6.trim(); // "Cybertek"
        System.out.println(str6);

        // substring() : retrieves portion of the string
        // provide beginning and ending indexes,! ending index EXCLUDED.
        // If you want to include the last index of the word add +1
        String str7 = "I like Java Language";
        //             012345678910
        String word = str7.substring(7,10+1);// if you want to include 10 give 11(space) ==>returns Java
        // ! if you want to assign to str7 back it will return only Java,
        // therefore assign no a new variable
        System.out.println(str7); // returns I like Java Language
        System.out.println(word); // returns Java

        String word2 = str7.substring(12); // returns Language
        String word3 = str7.substring(12,str7.length()); // returns Language
        // String word2 = str7.substring(12,20); add 1 to 19 and it returns Language
        System.out.println(word2);
        System.out.println(word3);

        // indexOf & lastIndexOf ==> returns int, returns first or last matching letter
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W"); // if it is W unique
        System.out.println(i1); // returns 23

        int i2 = str8.indexOf(", W")+2;
        int i3 = str8.indexOf("We are happy to see you");// returns first matching letter

        // System.out.println(str8.charAt(i1));
        System.out.println(i2);
        System.out.println(i3);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J"); //returns last matching J
        int i5 = str9.indexOf("J"); // returns first matching J
        int i6 = str9.indexOf(" Java ")+1;

        System.out.println(i4);
        System.out.println(i5);

        //replace & replaceFirst, replace replaces all Java words and replaceFirst only first one,
        // or you can make it unique
        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java", "C#"); // returns all Java as C#
        System.out.println(s1);

        String s2 = "I like Java, Java is a programming language";// to change first Java only
        s2 = s2.replaceFirst("Java","C#");

        System.out.println(s2);

        String s3 = "I like Java, Java is a programming language";
        s3 = s3.replace("Java is", "C# is");
        System.out.println(s3);

        System.out.println("==================================");

        // equals & equalsIgnoreCase => only compares text
        //equal only compares the text how it looks like

        String t1 = "Cat";// String pool
        String t2 = new String("Cat"); // heap
        String t3 = new String("Cat");

        System.out.println(t1 == t2); //false
        System.out.println(t1.equals(t2)); // true
        System.out.println(t2.equals(t3)); // true

        //equalsIgnoreCase
        String t4 = "java";
        String t5 = "Java";

        System.out.println(t4.equals(t5)); // false
        System.out.println(t4 == t5);  //false
        System.out.println(t4.equalsIgnoreCase(t5)); // true

        String t6 ="MuHTar";
        String t7 = "muHTaR";

        System.out.println(t6.equalsIgnoreCase(t7)); // true
        System.out.println(t6.equals(t7)); // false

        // isEmpty: checks if the length of string is 0

        String t8 = " ";

        System.out.println(t8.isEmpty()); // false
        t8= t8.trim(); // true

        String t9 = "Jikita"; // length !=0
        System.out.println(t9.isEmpty());// false

        t9 = ""; // length ==0;
        System.out.println(t9); // true

        // contains: checks if text is contained in String or not
        String t10 = "Java,C#, Python, Ruby, C++";

        System.out.println(t10.contains("Java"));// true
        System.out.println(t10.contains("java")); // false

        System.out.println(t10.toLowerCase().contains("java")); // true

        String r4 = "ABCD";
        System.out.println(r4.contains("D")); // true

        // startsWith & endsWith: starts or ends with some word
        String r5 = "Jika Mika";
        System.out.println(r5.startsWith("E") || r5.startsWith("J"));  // true
        System.out.println(r5.endsWith("Mika")); // true
        System.out.println(r5.endsWith("M")); // false
        System.out.println(r5.endsWith("ka"));// true














    }

}
