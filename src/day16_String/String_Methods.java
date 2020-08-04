package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        // !str.replace(oldValue, newValue)
        String email = "cybertek@gmail.com";
        email = email.replace("gmail","yahoo");
        // cybertek@yahoo.com
        System.out.println(email);

        String word = "java";
        word = word.replace("a","e");// jeve
        System.out.println(word);

        String sentence = "I like to learn Java, Java is cool, Java is fun";
        //sentence = sentence.replace("a, Java","a, C#");=> C# is cool
        sentence= sentence.replace("Java ", "Python ");
        System.out.println(sentence);

        // ! in order to replace a specific word ,
        // make it unique by adding extra space or characters

        String s1 = "I'd like to stay in Cybertek, Cybertek is a nice place";
        s1 = s1.replace("Cybertek","MIT");
        s1 = s1.replace("MIT","Cybertek");
        System.out.println(s1);

        String s2 = "I like to leaRn Java, we aRe enjoying Java";// r
        s2= s2.replace("R","r");
        System.out.println(s2);

        // ! replaceFirst (oldValue, newValue)=> returns the first one of similar values
        String s3 = " I like to drink tea and tea";
        s3 = s3.replaceFirst("tea", "cola");
        System.out.println(s3); // ==> I like to drink cola and tea

        String s4 = "I like to Watch Game of thrones, and Walking dead";
        s4 = s4.replace(", and Walking dead","");
        s4 = s4.replace("W","w");
        s4 = s4.replace(" t", " T");
        System.out.println(s4);

        // ! indexOf() returns index # of a char in the word
        // returns int
        String s5 = "I like to stay in Cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re");// "ar"+1 as it returns a not r
        // it returns the first char 'r' index
        int r3 = s5.indexOf("rn"); // returns index of r , the first char


        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        // lastIndexOf(): returns the first occurred character
        // !returns int, always assign to int
        String s6 = "Java is a programming language, and Java is fun";
        int I1 = s6.indexOf("J"); // => 0
        int I2 = s6.lastIndexOf("J"); // second and last J in java word
        System.out.println(I1);
        System.out.println(I2);











    }
}
